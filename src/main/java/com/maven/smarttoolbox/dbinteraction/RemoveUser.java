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
public class RemoveUser extends DBcmd {

    String sqlQuery = "Delete from USERS where id= ?;";

    private String id;

    public RemoveUser(String  id) {
        super();
        this.id = id;
    }

    @Override
    public void queryDB() throws SQLException {
        try {
            statement = conn.prepareStatement(sqlQuery);
            statement.setString(1, this.id);
            System.out.println(statement);
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

    public static void main(String[] args) {
        DbMgr db = new DbMgr();
        boolean removeUser = db.removeUser("1000928045");
        System.out.println(removeUser);

    }

}
