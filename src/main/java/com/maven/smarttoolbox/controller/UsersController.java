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
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/admin")
public class UsersController extends HttpServlet {

    javax.servlet.ServletRequest j;

    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       String message="";
       
       String id=request.getParameter("id");
       String fName= request.getParameter("fName");
       String lName=request.getParameter("lName");
       String email=request.getParameter("email");
       String password=request.getParameter("password");
       String type=request.getParameter("type");
       
       //create an object admin
       Users admin= new Users(Integer.parseInt(id),fName,lName,email,password, Integer.parseInt(type));
       
       //Add admin to database
       DbMgr db=new DbMgr();
       Boolean isAdded =db.addUser(admin);
    
       if(isAdded){
        request.setAttribute("Message", message);
        // forwards to the message page
        getServletContext().getRequestDispatcher("/home.jsp").forward(request, response);
       }
       else{
            request.setAttribute("Message", message);
        // forwards to the message page
        getServletContext().getRequestDispatcher("/error.jsp").forward(request, response);
           
       }
    }
}
