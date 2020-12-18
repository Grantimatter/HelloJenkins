package com.revature.servlet;

import javax.persistence.Query;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MasterServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //resp.setStatus(404);
        resp.setStatus(200);
        resp.getWriter().print("<h1>Hello Jenkins! PIPELINES ARE AWESOME!</h1>");
        resp.sendRedirect("https://www.google.com");
    }
}
