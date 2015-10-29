/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maven.smarttoolbox.dbinteraction;

import Entities.Users;
import com.maven.smarttoolbox.databasemanagement.DBcmd;
import java.sql.SQLException;

/**
 *
 * @author deepak
 */
public class AddUser extends DBcmd {

    String sqlQuery = "INSERT INTO USERS (id, fName, lName,email,password,type) VALUES (?, ?, ?,?,?,?)";

    private Users user;

    public AddUser(Users user) {
        super();
        this.user = user;
    }

    @Override
    public void queryDB() throws SQLException {
        try {
            statement = conn.prepareStatement(sqlQuery);
            statement.setInt(1, user.getId());
            statement.setString(2, user.getFName());
            statement.setString(3, user.getLName());
            statement.setString(4, user.getEmail());
            statement.setString(5, user.getPassword());
            statement.setInt(6, user.getType());

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

}
