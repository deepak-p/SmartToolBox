/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maven.smarttoolbox.dbinteraction;

import Entities.ToolsReport;
import com.maven.smarttoolbox.controller.ToolsController;
import com.maven.smarttoolbox.databasemanagement.DBcmd;
import com.maven.smarttoolbox.databasemanagement.DbMgr;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
public class GetFrequentTools extends DBcmd {

    // private List<ToolsReport> toolsReport;
    private String sd;
    private String ed;
    private String status;

    public GetFrequentTools(String sd, String ed, String status) {
        super();
        this.sd = sd;
        this.ed = ed;
        this.status = status;

    }

    @Override
    public void queryDB() throws SQLException {
        String sqlQuery;
        
           java.util.Date start_date ;
             java.util.Date end_date  ;
             SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
             Date sDate =null;
             Date eDate= null;
        try {
            start_date = format.parse(this.sd);
             end_date = format.parse(this.ed);
             sDate= new Date(start_date.getTime());
             eDate = new Date(end_date.getTime());
             
        } catch (ParseException ex) {
            Logger.getLogger(GetFrequentTools.class.getName()).log(Level.SEVERE, null, ex);
        }

        sqlQuery= "select toolName,type,status,tool_id, count(tool_id) checkouts from TOOLS_USES, tools  where status = '" + this.status + "' and tools.id=tool_id and  checkOut between '" + sDate + "'  and '" + eDate + "' group  by tool_id order by tool_id desc;";

        
        System.out.println(sqlQuery);
        System.out.println(this.status);
        System.out.println(this.sd);
        System.out.println(this.ed);
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
                
                
                report.setTool_id(resultSet.getString("tool_id"));
                report.setCheckouts(resultSet.getInt("checkouts"));
                

                ((ArrayList<ToolsReport>) result).add(report);

            }
        } catch (SQLException ex) {
            Logger.getLogger(GetToolsReport.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void main(String[] args) {

      
      DbMgr db = new DbMgr();
           

            List<ToolsReport> toolsReport = db.getFrequentTools("2015-09-01", "2015-09-25", "available");

            for (ToolsReport t : toolsReport) {
                System.out.println(t);

            }

       
    }

}