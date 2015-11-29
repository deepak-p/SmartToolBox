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
import com.maven.smarttoolbox.dbinteraction.GetFrequentTools;
import com.maven.smarttoolbox.dbinteraction.GetStudents;
import com.maven.smarttoolbox.dbinteraction.GetToolsReport;
//import com.maven.smarttoolbox.dbinteraction.GetToolsReport;
import com.maven.smarttoolbox.dbinteraction.LoginVerification;
import com.maven.smarttoolbox.dbinteraction.RemoveUser;
import com.maven.smarttoolbox.dbinteraction.UpdateStudent;
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
    public boolean removeUser(String id) {
        DBcmd removeUser = new RemoveUser(id);
        removeUser.execute();
        return (boolean) removeUser.getResult();
      
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
    public List<ToolsReport> getFrequentTools(String startDate, String endDate,String status) {
        
         DBcmd addTools = new GetFrequentTools(startDate,endDate,status); 
        addTools.execute();
        return (List<ToolsReport>) addTools.getResult();
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
    public List<ToolsReport> getToolsReport(String status) {
        DBcmd getToolsReport=new GetToolsReport(status);
        getToolsReport.execute();
        return (List<ToolsReport>) getToolsReport.getResult();
    }

    @Override
    public String loginVerification(String email,String password) {
       DBcmd loginVerify= new LoginVerification(email,password);
       loginVerify.execute();
       return (String) loginVerify.getResult();
    }

    @Override
    public List<Users> getStudents(String id) {
         DBcmd getStudents=new GetStudents(id);
        getStudents.execute();
        return (List<Users>) getStudents.getResult();
        
    }

    @Override
    public boolean updateStudent(String id, String fName, String lName,String email) {
         DBcmd updateStudent=new UpdateStudent(id,fName,lName,email);
       updateStudent.execute();
        return (boolean) updateStudent.getResult();
    }

}
