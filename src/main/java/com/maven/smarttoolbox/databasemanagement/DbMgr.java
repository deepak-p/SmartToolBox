/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maven.smarttoolbox.databasemanagement;

import Entities.Tools;
import Entities.ToolsReport;
import Entities.Users;
import java.sql.Date;
import java.text.ParseException;
import java.util.List;

/**
 *
 * @author deepak
 */
public class DbMgr {

    DbImpl dbimpl = new RDBImpl();

    public String loginVerification(String email,String password){
        return dbimpl.loginVerification(email,password);
        
    }
    public boolean addUser(Users s) {
        return dbimpl.addUser(s);

    }

    public boolean removeUser(int id) {
        return true;

    }

    public boolean addTools(Tools t) {
        return dbimpl.addTools(t);

    }

    public boolean removeTools(int toolId) {
        return true;

    }

    public Tools getFrequentTools(Date startDate, Date endDate) {
        return new Tools();

    }

    public Tools getLeastFrequentTools(Date startDate, Date endDate) {
        return new Tools();

    }

    public List<ToolsReport> getToolsReport(Date startDate, Date endDate,String status) {
        return dbimpl.getToolsReport(startDate, endDate,status);

    }
    
    public List<Users> getStudents(String id) {
        return dbimpl.getStudents(id);

    }
    

    public void reportLostItem(int toolId) {

    }

    public boolean updateTools(Tools t) {
        return true;

    }

    public static void main(String[] args) throws ParseException {

        DbMgr db = new DbMgr();

     //getting list of records
        /*
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
        java.util.Date start_date = format.parse("20150901");
        java.util.Date end_date = format.parse("20150915");
        Date startDate = new Date(start_date.getTime());
        Date endDate = new Date(end_date.getTime());

        List<ToolsReport> toolsReport = db.getToolsReport(startDate, endDate);

        for (ToolsReport t : toolsReport) {
            System.out.println(t.toString());
        }
                
                */
        
      // Adding items
        Tools t = new Tools();
        t.setId(Long.parseLong("123789"));
        t.setDrawer(3);
        t.setToolName("New_screwdriver");
        t.setType("Screwdriver");
        
        System.out.println(db.addTools(t));
        
        
        

    }

}
