/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Tran Minh Quang
 */
@WebServlet(urlPatterns = {"/helloworld.html"})
public class HelloWorld extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet HelloWorld</title>");            
            out.println("</head>");
            out.println("<body>");
            
            out.println("<h1><b> TRẦN MINH QUANG </b></h1>");
            out.println("<hr />");
            out.println("<p>Hobbies: Games, Music, Japanese and Code</p>");
            out.println("<p>Programming language: Java </p>");
            out.println("<p>Girl Friend: Rin </p>");
            
            out.println("<p>HelloWorld</p>");
            out.println("<hr />");
            
            out.println("<p>");
            for (int i = 1; i < 1000; i += 2) {
                if (i % 3 == 0) {
                    out.println("<span style='color : black'>" + i + " </span>");
                } else {
                    out.println("<span style='color : red'>" + i + " </span>");
                }
            }
            out.println("</p>");
            out.println("<hr />");
            String agent = request.getHeader("User-Agent");
            Enumeration<String> headerNames = request.getHeaderNames();
            out.println("<p>You are accessing using " + agent + "</p>");
            while(headerNames.hasMoreElements()) {
                String headerName = headerNames.nextElement();
                out.println("Header: " + headerName);
                out.println("Value: " + request.getHeader(headerName));
                out.println("<br />");
            }
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
