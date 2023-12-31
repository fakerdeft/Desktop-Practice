package com.desktop.filter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/first/filter")
public class FirstFilterTest extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("servlet 요청...");
        
        req.setAttribute("name", req.getAttribute("name"));
        RequestDispatcher view = req.getRequestDispatcher("/filterPage.jsp");
        view.forward(req, resp);
    }
}
