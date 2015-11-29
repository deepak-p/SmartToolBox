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
import Entities.Users;
import com.maven.smarttoolbox.databasemanagement.DbMgr;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/updatestudent")
public class UpdateUsersController extends HttpServlet {

    javax.servlet.ServletRequest j;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String message = "";

        String id = request.getParameter("id");
        String fName = request.getParameter("fName");
        String lName = request.getParameter("lName");
        String email = request.getParameter("email");

        String buttonPressed = request.getParameter("action");
        
        

        if (buttonPressed == null) {

        } else if (buttonPressed.equals("update")) {
            //Add admin to database
            DbMgr db = new DbMgr();
            Boolean isAdded = db.updateStudent(id, fName, lName, email);

            if (isAdded) {
                request.setAttribute("Message", message);
                // forwards to the message page
                getServletContext().getRequestDispatcher("/manageuser.jsp").forward(request, response);
            } else {
                request.setAttribute("Message", message);
                // forwards to the message page
                getServletContext().getRequestDispatcher("/error.jsp").forward(request, response);

            }

        } else if (buttonPressed.equals("delete")) {

            DbMgr db = new DbMgr();
            boolean performed = db.removeUser(id);

            if (performed) {
                request.setAttribute("Message", message);
                // forwards to the message page
                getServletContext().getRequestDispatcher("/manageuser.jsp").forward(request, response);
            } else {
                request.setAttribute("Message", message);
                // forwards to the message page
                getServletContext().getRequestDispatcher("/error.jsp").forward(request, response);
            }

        }

    }

}
