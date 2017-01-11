/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
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
@WebServlet(urlPatterns = {"/CourseRegistration"})
public class CourseRegistration extends HttpServlet {

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
//        request.getRequestDispatcher("received.jsp").forward(request, response);
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Course Registration</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Course Registration Information: </h1>");
            
            Enumeration<String> parameterNames = request.getParameterNames();
            ArrayList<String> names = new ArrayList();
            while(parameterNames.hasMoreElements()) {
                String paramName = (String)parameterNames.nextElement();
                names.add(request.getParameter(paramName));
            }
            out.println("<div><b>Name:</b> " + names.get(0) + " "+ names.get(1) + "</div>");
            out.println("<div><b>Contact No:</b> " + names.get(2) + "</div>");
            out.println("<div><b>Email address:</b> " + names.get(3) + "</div>");
            
            out.println("<div><b>Course choosen:</b> </div>");
            String[] courseValues = request.getParameterValues("course");
            for (String courseValue : courseValues) {
                if (courseValue != null) {
                    out.println("<div> - " + courseValue + "</div>");
                }
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
