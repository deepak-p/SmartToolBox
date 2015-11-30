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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author deepak
 */
public class GetToolsByID extends DBcmd {
    
    private String id;

    public GetToolsByID(String id) {
        this.id = id;
    }
    

    @Override
    public void queryDB() throws SQLException {
       
           String sqlQuery = "select * from tools where id= '"+this.id +"';";
       // String sqlQuery="select * from tools where id = (?) ;";
       

        try {
            //System.out.println(sql);
            statement = conn.prepareStatement(sqlQuery);
            

            System.out.println(statement);
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
            

            while (resultSet.next()) {
                Tools tool = new Tools();
                tool.setToolName(resultSet.getString("toolName"));
                tool.setType(resultSet.getString("type"));
                tool.setId(resultSet.getString("id"));
                tool.setDrawer(resultSet.getInt("drawer"));
                
               

                
               result=tool;

            }
        } catch (SQLException ex) {
            Logger.getLogger(GetToolsByID.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    
     public static void main(String[] args){
        
        
        DbMgr db = new DbMgr();
       Tools update= db.getToolsByID("1000928045XYBEUT");
        
        System.out.println(update);
        
        
    }
    
    
}
