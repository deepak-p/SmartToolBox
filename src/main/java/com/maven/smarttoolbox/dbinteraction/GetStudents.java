/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maven.smarttoolbox.dbinteraction;

import Entities.Users;
import com.maven.smarttoolbox.databasemanagement.DBcmd;
import com.maven.smarttoolbox.databasemanagement.DbMgr;
import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author deepak
 */
public class GetStudents extends DBcmd {

    // private List<ToolsReport> toolsReport;
    private String id;

    public GetStudents() {
    }

    public GetStudents(String id) {
        this.id = id;
    }

    @Override
    public void queryDB() throws SQLException {

        String sqlQuery;
        if (this.id != null) {
            sqlQuery = "select email,fName,id,lName from users where type = " + 0 + " and id= '" + this.id + "';";
        } else {
            sqlQuery = "select email,fName,id,lName from users where type = " + 0 + ";";
        }

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
            result = new ArrayList<>();

            while (resultSet.next()) {

                Users students = new Users();
                students.setEmail(resultSet.getString("email"));
                students.setFName(resultSet.getString("fName"));
                students.setId(resultSet.getInt("id"));
                students.setLName(resultSet.getString("lName"));

                ((ArrayList<Users>) result).add(students);

            }
        } catch (SQLException ex) {
            Logger.getLogger(GetToolsReport.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void main(String[] args) {

        DbMgr db = new DbMgr();

        List<Users> toolsReport = db.getStudents("100928050");

        for (Users t : toolsReport) {
            System.out.println(t);

        }

    }

}
