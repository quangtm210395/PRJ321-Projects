/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import jdbc.DbContext;

/**
 *
 * @author luyenchu
 */
public class UpdatePerson extends HttpServlet {

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
        String strId = request.getParameter("id");
        String name = request.getParameter("pName");
        String strAge = request.getParameter("pAge");
        
        boolean valid = true;
        String message ="";
        if(name == null || "".equals(name.trim())){
            message = "Name cannot be left blank!";
            valid = false;
        }
        int age  = -1;
        try{
            age = Integer.parseInt(strAge);
        }catch(Exception e){
            message += "<br />"+ "Age is not a number!";
            valid = false;
        }
        
        if(valid){
            //insert
            DbContext db = new DbContext();
            String insert = "UPDATE Persons SET personName='"+name+"', "
                    + "personAge="+age
                    +" WHERE id="+strId;
            try {
                db.executeUpdate(insert);
                response.sendRedirect("list.jsp");
            } catch (Exception ex) {
                ex.printStackTrace();
                message = "Error: " + ex;
                request.setAttribute("message",message);
                request.getRequestDispatcher("edit.jsp?"+strId).forward(request, response);
            }
        }else{
            request.setAttribute("message",message);
            request.getRequestDispatcher("edit.jsp?id="+strId).forward(request, response);
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
