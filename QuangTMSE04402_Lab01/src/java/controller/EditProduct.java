/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import BusinessObject.Checker;
import JDBC.DBContext;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Tran Minh Quang
 */
public class EditProduct extends HttpServlet {

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
        
        String name = request.getParameter("name");
        String description = request.getParameter("description");
        String price = request.getParameter("price");
        String available = request.getParameter("available") == null ? "No" : "Yes";
        String category_id = request.getParameter("category_id");
        
        String message = "";
        boolean valid = true;
        DBContext db = new DBContext();
        try {
            int Product_ID = Integer.parseInt( request.getParameter("id"));
            ResultSet rs = db.executeQuery("select COUNT(*) as row from Pro_Details where Product_ID = '"
                        + Product_ID + "'");
            rs.next();
            if (rs.getInt("row") == 0) {
                throw new Exception();
            }
            if (Checker.check_Product(name, available, description, price) == false) {
                valid = false;
                message += "Name, available, description or price invalid!";
                System.out.println( "mes: "+message);
            }
            if (valid) valid = db.updateProduct(Product_ID, category_id, name, available, description, Float.parseFloat(price))==1;
            if (valid) {
                response.sendRedirect("listProducts.jsp");
            } else {
                request.setAttribute("message", message);
                request.setAttribute("id", Product_ID);
                request.getRequestDispatcher("editProduct.jsp?id=" + Product_ID).forward(request, response);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            out.println("<h1>Error: Product_ID does not exists!</h1>");
            out.println("<a href='listProducts.jsp'>Back to List Product</a>");
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
