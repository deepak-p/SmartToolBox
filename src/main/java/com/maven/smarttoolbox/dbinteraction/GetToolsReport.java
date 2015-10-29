/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maven.smarttoolbox.dbinteraction;

import Entities.ToolsReport;
import com.maven.smarttoolbox.databasemanagement.DBcmd;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author deepak
 */
public class GetToolsReport extends DBcmd {

    // private List<ToolsReport> toolsReport;
    private Date sd;
    private Date ed;

    public GetToolsReport(Date sd, Date ed) {
        super();
        this.sd = sd;
        this.ed = ed;

    }

    @Override
    public void queryDB() throws SQLException {
        String sqlQuery = "select toolName,type,status,tool_id, count(tool_id) checkouts from TOOLS_USES, tools  where tools.id=tool_id and  checkOut between '" + this.sd + "'  and '" + this.ed + "' group  by tool_id order by tool_id desc;";

        System.out.println(sqlQuery);
        try {
            //System.out.println(sql);
            statement = conn.prepareStatement(sqlQuery);

            resultSet = statement.executeQuery(sqlQuery);

            processResult();
        } catch (SQLException e) {
            System.out.println(e);
            conn.close();
        } finally {
            statement.close();
        }
    }

    @Override
    public void processResult() {

        try {
            result = new ArrayList<>();

            while (resultSet.next()) {
                ToolsReport report = new ToolsReport();
                report.setToolName(resultSet.getString("toolName"));
                report.setType(resultSet.getString("type"));
                report.setStatus(resultSet.getString("status"));
                report.setTool_id(resultSet.getLong("tool_id"));
                report.setCheckouts(resultSet.getInt("checkouts"));

                ((ArrayList<ToolsReport>) result).add(report);

            }
        } catch (SQLException ex) {
            Logger.getLogger(GetToolsReport.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
