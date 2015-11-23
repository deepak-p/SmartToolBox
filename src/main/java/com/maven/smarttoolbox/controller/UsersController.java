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
import Entities.Users;
import com.maven.smarttoolbox.databasemanagement.DbMgr;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/admin", "/getstudentrecords"})
public class UsersController extends HttpServlet {

    javax.servlet.ServletRequest j;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String message = "";

        String id = request.getParameter("id");
        String fName = request.getParameter("fName");
        String lName = request.getParameter("lName");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String type = request.getParameter("type");

        //create an object admin
        Users admin = new Users(Integer.parseInt(id), fName, lName, email, password, Integer.parseInt(type));

        //Add admin to database
        DbMgr db = new DbMgr();
        Boolean isAdded = db.addUser(admin);

        if (isAdded) {
            request.setAttribute("Message", message);
            // forwards to the message page
            getServletContext().getRequestDispatcher("/home.jsp").forward(request, response);
        } else {
            request.setAttribute("Message", message);
            // forwards to the message page
            getServletContext().getRequestDispatcher("/error.jsp").forward(request, response);

        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // forward to mypage.html
        try{
        String id;
        if (request.getParameter("id") != null) {
            id = request.getParameter("id");
            DbMgr db = new DbMgr();
            List<Users> students = db.getStudents(id);
         

          
            request.setAttribute("student", students.get(0));
            
            

            request.getRequestDispatcher("edituser.jsp").forward(request, response);
        }

        DbMgr db = new DbMgr();

        List<Users> users = db.getStudents(null);

        request.setAttribute("students", users);

        request.getRequestDispatcher("alluser.jsp").forward(request, response);
        }
        catch(Exception e){
            request.setAttribute("Message", "The user does not exist");
            request.getRequestDispatcher("error.jsp").forward(request, response);
        }
    }
}
