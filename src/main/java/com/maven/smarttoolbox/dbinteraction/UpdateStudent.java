/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maven.smarttoolbox.dbinteraction;

import com.maven.smarttoolbox.databasemanagement.DBcmd;
import com.maven.smarttoolbox.databasemanagement.DbMgr;
import java.sql.SQLException;

/**
 *
 * @author deepak
 */
public class UpdateStudent extends DBcmd{
    
    private String id;
    private String fName;
    private String lName;
    private String email;
    
    private String sqlquery="update users set fName= ?,lName= ?,email= ? where id= ?";

    public UpdateStudent(String id, String fName, String lName, String email) {
        super();
        this.id = id;
        this.fName = fName;
        this.lName = lName;
        this.email = email;
    }
    
    

    @Override
    public void queryDB() throws SQLException {
       try {
            statement = conn.prepareStatement(sqlquery);
            statement.setString(1, this.fName);
            statement.setString(2, this.lName);
            statement.setString(3, this.email);
            statement.setString(4, this.id);
            

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
        result=true;
    }
    
    public static void main(String[] args){
        UpdateStudent update = new UpdateStudent("100928050","Dee","Pokhr","d@hotmail.com");
        
        
        DbMgr db = new DbMgr();
        boolean updateStudent = db.updateStudent("100928050","Dee","Pokhr","d66@hotmail.com");
        
        System.out.println(updateStudent);
        
        
    }
    
}
