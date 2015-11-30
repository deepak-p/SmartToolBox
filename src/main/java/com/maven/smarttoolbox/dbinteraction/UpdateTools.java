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
public class UpdateTools extends DBcmd {

    private Tools tool;
    private String status;

    private String sqlquery = "update tools set id= ?,toolName= ?, drawer= ?, type= ?, status = ? where id= ?";

    public UpdateTools(Tools tool, String status) {
        super();
        this.tool = tool;
        this.status = status;
    }

    @Override
    public void queryDB() throws SQLException {
        try {
            statement = conn.prepareStatement(sqlquery);
            statement.setString(1, this.tool.getId());
            statement.setString(2, this.tool.getToolName());
            statement.setInt(3, this.tool.getDrawer());
            statement.setString(4, this.tool.getType());
            statement.setString(5, this.status);
            statement.setString(6, this.tool.getId());

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
        Tools t = new Tools();
        t.setDrawer(1);
        t.setId("1000928045XYBEUT");
        t.setToolName("Co");
        t.setType("screwdriver");

        DbMgr db = new DbMgr();
        boolean updateStudent = db.updateTools(t, "available");

        System.out.println(updateStudent);

    }

}
