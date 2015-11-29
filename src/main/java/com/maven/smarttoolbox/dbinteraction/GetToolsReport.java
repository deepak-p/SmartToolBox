/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maven.smarttoolbox.dbinteraction;

import Entities.ToolsReport;
import com.maven.smarttoolbox.databasemanagement.DBcmd;
import com.maven.smarttoolbox.databasemanagement.DbMgr;
import java.sql.Date;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
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
    private String status;

    public GetToolsReport(Date sd, Date ed, String status) {
        super();
        this.sd = sd;
        this.ed = ed;
        this.status = status;

    }

    @Override
    public void queryDB() throws SQLException {
        String sqlQuery;
        if (!this.status.equals("")) {
            //  sqlQuery= "select toolName,type,status,tool_id, count(tool_id) checkouts from TOOLS_USES, tools  where status = '" + this.status + "' and tools.id=tool_id and  checkOut between '" + this.sd + "'  and '" + this.ed + "' group  by tool_id order by tool_id desc;";
            sqlQuery = "select * from  tools  where status = '" + this.status + "'  ";
        } else {
            sqlQuery = "select toolName,type,status,id, count(id) checkouts from tools;";

        }

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

             

                    report.setTool_id(resultSet.getString("id"));
                    report.setCheckouts(0);

                
                ((ArrayList<ToolsReport>) result).add(report);

            }
        } catch (SQLException ex) {
            Logger.getLogger(GetToolsReport.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void main(String[] args) {

        DbMgr db = new DbMgr();

        String status = "available";

        SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
        java.util.Date start_date;
        try {
            start_date = format.parse("20140901");
            java.util.Date end_date = format.parse("20160915");
            Date startDate = new Date(start_date.getTime());
            Date endDate = new Date(end_date.getTime());

            List<ToolsReport> toolsReport = db.getToolsReport(startDate, endDate, status);

            for (ToolsReport t : toolsReport) {
                System.out.println(t);

            }

        } catch (ParseException ex) {
        }

    }

}
