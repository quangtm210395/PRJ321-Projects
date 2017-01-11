/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import JDBC.DBContext;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Tran Minh Quang
 */
public class EditCategory extends HttpServlet {

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
        String category = request.getParameter("category");
        DBContext db = new DBContext();
        try {
            int id = Integer.parseInt( request.getParameter("id"));
            boolean valid = true;
            String message = "";
            ResultSet rs = db.executeQuery("select COUNT(*) as row from Pro_Categories where Category_ID = '" + id + "'");
            rs.next();
            if (rs.getInt("row") == 0) {
                throw new Exception();
            }
            if (category == null || category.isEmpty()) {
                message += "Category must not be empty <br>";
                valid = false;
            } else if (category.length() > 50) {
                message += "Category max length must be 50 <br>";
                valid = false;
            } 
            String sql = "UPDATE Pro_Categories SET Name = ('" + category + "') WHERE Category_ID = '" + id + "'";
            if (valid) valid = db.executeUpdate(sql)==1;
            if (valid == false) {
                request.setAttribute("message", message);
                request.setAttribute("edit_cate_id", id);
                request.getRequestDispatcher("editCategory.jsp?id=" + id).forward(request, response);
            } else {
                response.sendRedirect("listCategory.jsp");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            out.println("<h1>Error: Category_ID does not exists!</h1>");
            out.println("<a href='listCategory.jsp'>Back to List Category</a>");
            
        } finally {
            db.close();
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
