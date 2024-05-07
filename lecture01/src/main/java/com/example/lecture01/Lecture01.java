package com.example.lecture01;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Lecture01", value = "/Lecture01")
public class Lecture01 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doProcess(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doProcess(request,response);
    }

    protected void doProcess(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException
    {
        PrintWriter out = response.getWriter();
        out.println("Hello World");
    }
}
