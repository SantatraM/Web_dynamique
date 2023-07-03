package etu1787.framework.servlet;

import etu1787.framework.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class FrontServlet extends HttpServlet {
   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String url = request.getRequestURL().toString();
        Util util = new Util();
        String value = util.getUrl(url);
        out.println(value);
    }
  
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            processRequest(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            processRequest(request, response);
    }
}