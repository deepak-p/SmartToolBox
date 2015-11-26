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
import Entities.Tools;
import Entities.ToolsReport;
import com.maven.smarttoolbox.databasemanagement.DbMgr;
import java.io.IOException;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/tools", "/getrecords"})
public class ToolsController extends HttpServlet {

    javax.servlet.ServletRequest j;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String message = "";

        String id = request.getParameter("id");
        String toolName = request.getParameter("toolName");
        String location = request.getParameter("location");
        String type = request.getParameter("type");

        //create an object admin
        Tools tool = new Tools(id, toolName, Integer.parseInt(location), type);

        //Add admin to database
        message = id + toolName + location + type;
        DbMgr db = new DbMgr();
        Boolean isAdded = db.addTools(tool);

        if (isAdded) {
            request.setAttribute("Message", message);
            // forwards to the message page
            getServletContext().getRequestDispatcher("/inventory.jsp").forward(request, response);
        } else {
            request.setAttribute("Message", message);
            // forwards to t//he message page
            getServletContext().getRequestDispatcher("/error.jsp").forward(request, response);

        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // forward to mypage.html
        String status;
        if (request.getParameter("status") != null) {
            status = request.getParameter("status");
            DbMgr db = new DbMgr();
            SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
            java.util.Date start_date;
            try {
                start_date = format.parse("20140901");
                java.util.Date end_date = format.parse("20161215");
                Date startDate = new Date(start_date.getTime());
                Date endDate = new Date(end_date.getTime());

                List<ToolsReport> toolsReport = db.getToolsReport(startDate, endDate, status);

                request.setAttribute("toolsreport", toolsReport);
            } catch (ParseException ex) {
                Logger.getLogger(ToolsController.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            status = "available";
            DbMgr db = new DbMgr();
            SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
            java.util.Date start_date;
            try {
                start_date = format.parse("20150901");
                java.util.Date end_date = format.parse("20151215");
                Date startDate = new Date(start_date.getTime());
                Date endDate = new Date(end_date.getTime());

                List<ToolsReport> toolsReport = db.getToolsReport(startDate, endDate, status);

                request.setAttribute("toolsreport", toolsReport);
            } catch (ParseException ex) {
                Logger.getLogger(ToolsController.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

        request.getRequestDispatcher("allitems.jsp").forward(request, response);
    }
}
