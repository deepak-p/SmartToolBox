/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maven.smarttoolbox.databasemanagement;

import Entities.Tools;
import Entities.ToolsReport;
import Entities.Users;
import com.maven.smarttoolbox.dbinteraction.AddTools;
import com.maven.smarttoolbox.dbinteraction.AddUser;
import com.maven.smarttoolbox.dbinteraction.GetToolsReport;
import com.maven.smarttoolbox.dbinteraction.LoginVerification;
import java.sql.Date;
import java.util.List;

/**
 *
 * @author deepak
 */
public class RDBImpl implements DbImpl {

    @Override
    public boolean addUser(Users admin) {
        DBcmd addUser = new AddUser(admin);
        addUser.execute();
        return (Boolean) addUser.getResult();
    }

    @Override
    public boolean removeUser(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean addTools(Tools t) {
       
        DBcmd addTools = new AddTools(t); 
        addTools.execute();
        return (Boolean) addTools.getResult();

    }

    @Override
    public boolean removeTools(int toolId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Tools getFrequentTools(Date startDate, Date endDate) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Tools getLeastFrequentTools(Date startDate, Date endDate) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void reportLostItem(int toolId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean updateTools(Tools t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ToolsReport> getToolsReport(Date startDate,Date endDate,String status) {
        DBcmd getToolsReport=new GetToolsReport(startDate,endDate,status);
        getToolsReport.execute();
        return (List<ToolsReport>) getToolsReport.getResult();
    }

    @Override
    public String loginVerification(String email,String password) {
       DBcmd loginVerify= new LoginVerification(email,password);
       loginVerify.execute();
       return (String) loginVerify.getResult();
    }

}
