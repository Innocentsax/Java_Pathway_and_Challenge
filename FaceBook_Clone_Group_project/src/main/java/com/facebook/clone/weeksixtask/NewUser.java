package com.facebook.clone.weeksixtask;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/new_user/account")
public class NewUser extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("first_name") + "  "+ req.getParameter("last_name");
        String age =  req.getParameter("dob");
        String sex = req.getParameter("gender");
        String email = req.getParameter("email");
        String password = req.getParameter("pw");

        PrintWriter out = resp.getWriter();
        out.println(name);
        out.println(age);
        out.println(sex);
        out.println(email);
        out.println(password);

    }
}
