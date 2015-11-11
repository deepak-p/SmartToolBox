/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maven.smarttoolbox.dbinteraction;

import Entities.ToolsReport;
import com.maven.smarttoolbox.databasemanagement.DBcmd;
import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author deepak
 */
public class LoginVerification extends DBcmd {

    // private List<ToolsReport> toolsReport;
    private String user;
    private String password;
   
    private String sqlQuery = "Select password from users where email= (?) and type= "+1+";";

    public LoginVerification(String user, String password) {
        super();
        this.user = user;
        this.password = password;
       

    }

    @Override
    public void queryDB() throws SQLException {

        System.out.println(sqlQuery);
        try {
            //System.out.println(sql);
            statement = conn.prepareStatement(sqlQuery);
            statement.setString(1, this.user);
            
            resultSet = statement.executeQuery();

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

            if (resultSet.next()) {

                String pass = resultSet.getString("password");

                if (pass.equals(this.password)) {
                    result = "success";
                } else {
                    result = "incorrect password or user type";
                }

            }

        } catch (Exception ex) {
           System.out.println(ex);
        }
    }
    
    
    public static void main(String[] args){
        DBcmd d= new LoginVerification("deepak.pokhrel@cse.uta.ed","the");
        
        d.execute();
        String result1 = (String)d.getResult();
        
        System.out.println(result1);
    }

}
