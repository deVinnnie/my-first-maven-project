package com.realdolmen.course;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@WebServlet(urlPatterns = "/TestServlet")
public class TestServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<String> list = Arrays.asList(
               "Dog", "Cat", "Horse", "Mouse", "Duck"
        );

        request.setAttribute("animals", list);
        request.getRequestDispatcher("WEB-INF/test.jsp").forward(request,response);
    }
}
