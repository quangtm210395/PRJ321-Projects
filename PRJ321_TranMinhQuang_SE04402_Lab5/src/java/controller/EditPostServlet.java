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
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Tran Minh Quang
 */
public class EditPostServlet extends HttpServlet {

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
        String message = "";
        boolean valid = true;
        HttpSession session = request.getSession();
        try {
            DBContext db = new DBContext();
            int id = (Integer.parseInt(request.getParameter("id")));
            ResultSet rs = db.executeQuery("select COUNT(*) as row from Posts where post_id = '" + id + "'");
            rs.next();
            if (rs.getInt("row") == 0) {
            request.setAttribute("message", "Post_id does not exists!");
            request.getRequestDispatcher("editPost.jsp").forward(request, response);
            } else {
                String title = request.getParameter("title");
                String content = request.getParameter("content");
                String author = (String) session.getAttribute("username");
                String state = request.getParameter("state");
                Timestamp t = new Timestamp(Calendar.getInstance().getTimeInMillis());
                if (title.isEmpty()) {
                    message += "Title must not be empty! <br>";
                    valid = false;
                }
                if (content.isEmpty()) {
                    message += "Content must not be empty! <br>";
                    valid = false;
                }
                if (valid) {
                    valid = db.updatePost(title, content, author, t, state, id) == 1;
                }
                if (valid) {
                    response.sendRedirect("index.jsp");
                } else {
                    request.setAttribute("message", message);
                    request.getRequestDispatcher("editPost.jsp").forward(request, response);
                }
            }
        } catch (NumberFormatException ex) {
            ex.printStackTrace();
            out.println("<h1>Error: Post_id must be a number</h1>");
            out.println("<a href='index.jsp'>Back to Home Page</a>");
        } catch (Exception ex) {
            Logger.getLogger(EditPostServlet.class.getName()).log(Level.SEVERE, null, ex);
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
