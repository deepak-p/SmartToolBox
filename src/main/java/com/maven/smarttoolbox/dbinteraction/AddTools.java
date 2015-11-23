/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maven.smarttoolbox.dbinteraction;

import Entities.Tools;
import com.maven.smarttoolbox.databasemanagement.DBcmd;
import com.maven.smarttoolbox.databasemanagement.DbMgr;
import java.sql.SQLException;

/**
 *
 * @author deepak
 */
public class AddTools extends DBcmd {

    private Tools tool;
    String sqlQuery = "INSERT INTO Tools (id, toolName,drawer, type,status) VALUES (?, ?, ?, ?,?)";

    public AddTools(Tools tool) {
        super();
        this.tool = tool;
    }

    @Override
    public void queryDB() throws SQLException {
        try {
            statement = conn.prepareStatement(sqlQuery);
            statement.setLong(1, tool.getId());
            statement.setString(2, tool.getToolName());
            statement.setInt(3, tool.getDrawer());
            statement.setString(4, tool.getType());
            statement.setString(5, "available");

            statement.executeUpdate();
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
        result = true;
    }
    
    public static void main(String[] args){
        
       
      
         DbMgr db = new DbMgr();
         Tools tools= new Tools();
         tools.setId(Long.parseLong("123098"));
         tools.setDrawer(4);
         tools.setToolName("Screw-medium-size");
         tools.setType("Screwdriver");

       boolean message=db.addTools(tools);
       
       
        
        
    }

}
