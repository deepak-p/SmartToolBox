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
import java.util.List;

/**
 *
 * @author deepak
 */
public interface DbImpl {

    public boolean addUser(Users s);

    public boolean removeUser(int id);

    public boolean addTools(Tools t);
    public List<ToolsReport> getToolsReport(Date startDate, Date endDate);

    public boolean removeTools(int toolId);

    public Tools getFrequentTools(Date startDate, Date endDate);

    public Tools getLeastFrequentTools(Date startDate, Date endDate);

    public void reportLostItem(int toolId);

    public boolean updateTools(Tools t);


}
