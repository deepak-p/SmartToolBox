/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maven.smarttoolbox.controller;

/**
 *
 * @author deepak
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.


 /**
 *
 * @author dpokhrel
 */
import Entities.Tools;
import com.maven.smarttoolbox.databasemanagement.DbMgr;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = {"/updatetools", "/gettoolsbyid"})
public class UpdateToolsController extends HttpServlet {

    javax.servlet.ServletRequest j;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String message = "";

        String tool_id = request.getParameter("tool_id");
        String tool_name = request.getParameter("tool_name");
        String status = request.getParameter("status");
        String drawer = request.getParameter("drawer");
        String type = request.getParameter("type");

        String buttonPressed = request.getParameter("action");
        
        Tools tool= new Tools(tool_id,tool_name,Integer.parseInt(drawer),type);
       
       
        

        if (buttonPressed == null) {

        } else if (buttonPressed.equals("update")) {
            //Add admin to database
            DbMgr db = new DbMgr();
            Boolean isAdded =db.updateTools(tool,status);

            if (isAdded) {
                request.setAttribute("Message",  "Successfully Updated the item!!");
                // forwards to the message page
                getServletContext().getRequestDispatcher("/manageitem.jsp").forward(request, response);
            } else {
                request.setAttribute("Message", "Update not ");
                // forwards to the message page
                getServletContext().getRequestDispatcher("/error.jsp").forward(request, response);

            }

        } else if (buttonPressed.equals("delete")) {

            DbMgr db = new DbMgr();
            boolean performed =db.removeTool(tool_id);

            if (performed) {
                request.setAttribute("Message", "Successfully Removed the item!!");
                // forwards to the message page
                getServletContext().getRequestDispatcher("/manageitem.jsp").forward(request, response);
            } else {
                request.setAttribute("Message", message);
                // forwards to the message page
                getServletContext().getRequestDispatcher("/error.jsp").forward(request, response);
            }

        }

    }
    
     @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String message = "";

        try{
        String tool_id = request.getParameter("tool_id");
        
        DbMgr db= new DbMgr();
        Tools t= db.getToolsByID(tool_id);
        
       
          request.setAttribute("tools",t);
                // forwards to the message page
          getServletContext().getRequestDispatcher("/edititems.jsp").forward(request, response);
        }
        catch(ServletException | IOException e){
             request.setAttribute("Message",e);
         getServletContext().getRequestDispatcher("/error.jsp").forward(request, response);

        }
       
    }
    
    
    
    

}
