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
import com.maven.smarttoolbox.databasemanagement.DbMgr;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns = {"/login"})
public class LoginController extends HttpServlet {

    javax.servlet.ServletRequest j;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String message = "";

        String userName = request.getParameter("user");
        String password = request.getParameter("pass");
       

        DbMgr db = new DbMgr();

        message=db.loginVerification(userName, password);
        
        

        if (message.equals("success")) {
            
                HttpSession session = request.getSession();
                session.setAttribute("email", userName);
                request.setAttribute("Message", message );
                getServletContext().getRequestDispatcher("/home.jsp").forward(request, response);
            

        } else {
            request.setAttribute("Message", message);
            getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
        }

    }

}
