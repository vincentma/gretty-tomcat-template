package com.vincent;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWorldServlet extends HttpServlet {

    private static final long serialVersionUID = -3769110988652575230L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        int i = 0;
        i++;
        int j = i + 10;
        System.out.println(j);
        res.getWriter().write("hello world" + j);
    }
}
