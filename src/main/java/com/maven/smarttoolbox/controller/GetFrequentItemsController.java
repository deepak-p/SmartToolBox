/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maven.smarttoolbox.controller;

/**
 *
 * @author dpokhrel
 */
import Entities.ToolsReport;
import com.maven.smarttoolbox.databasemanagement.DbMgr;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/getfrequentitems")
public class GetFrequentItemsController extends HttpServlet {

    javax.servlet.ServletRequest j;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String beginDate = request.getParameter("begindate");
        String endDate = request.getParameter("enddate");

        DbMgr db = new DbMgr();
        List<ToolsReport> toolsReport = db.getFrequentTools(beginDate, endDate, "available");

        request.setAttribute("toolsreport", toolsReport);
        request.setAttribute("Message",beginDate+"  "+endDate);
        
        request.getRequestDispatcher("GetFrequentItems.jsp").forward(request, response);

    }

}
