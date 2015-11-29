/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maven.smarttoolbox.databasemanagement;

import Entities.Tools;
import Entities.ToolsReport;
import Entities.Users;
import com.maven.smarttoolbox.dbinteraction.LoginVerification;
import java.sql.Date;
import java.util.List;

/**
 *
 * @author deepak
 */
public interface DbImpl {

    public boolean addUser(Users s);

    public boolean removeUser(String id);

    public boolean addTools(Tools t);
    public List<ToolsReport> getToolsReport(String status);

    public boolean removeTools(int toolId);

    public List<ToolsReport> getFrequentTools(String startDate, String endDate,String status);

    public Tools getLeastFrequentTools(Date startDate, Date endDate);

    public void reportLostItem(int toolId);

    public boolean updateTools(Tools t);
    public boolean updateStudent(String id, String fName,String lName,String email);

    public String loginVerification(String email, String password);
    
    public List<Users> getStudents(String id);


}
