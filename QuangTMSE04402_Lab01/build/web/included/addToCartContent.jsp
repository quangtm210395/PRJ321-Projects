<%-- 
    Document   : addToCartContent
    Created on : Nov 15, 2016, 3:09:35 AM
    Author     : Tran Minh Quang
--%>
<%@page import="java.sql.ResultSet"%>
<%@page import="JDBC.DBContext"%>
<%@page import="BusinessObject.MySingleton"%>
<%
    String id = request.getParameter("id");
    boolean valid = true;
    if (id != null) {

        DBContext db = new DBContext();
        try {
            int product_id = Integer.parseInt(request.getParameter("id"));
            ResultSet rs = db.executeQuery("select COUNT(*) as row from Pro_Details where Product_ID = '" + id + "'");
            rs.next();
            if (rs.getInt("row") == 0) {
                throw new Exception();
            } else {
                System.out.println("product_id: " + id);
                Cookie cookie = new Cookie("id", id);
                cookie.setMaxAge(60 * 60 * 24);
                response.addCookie(cookie);
                response.sendRedirect("GetCookies");
            }

        } catch (Exception e) {
            e.printStackTrace();
            valid = false;
        }
    }
%>

<div class="row">
    <div class="col-md-10">
        <h3><%=valid?"Add to cart Successfully" : "Product_ID does not exists!"%></h3>
    </div>
</div>

<div class="row">
    <div class="col-md-6">
        <div class="form-horizontal">
            <div class="form-group">
                <div class="col-md-offset-1 col-md-10">
                    <a class="btn btn-github" href="shoppingCart.jsp">View Shopping cart</a>
                    <a class="btn btn-github" href="sale.jsp">Home Page</a>
                </div>
            </div>
        </div>
    </div>
</div>