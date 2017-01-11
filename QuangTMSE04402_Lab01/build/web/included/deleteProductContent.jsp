<%-- 
    Document   : deleteProductContent
    Created on : Nov 15, 2016, 2:22:03 AM
    Author     : Tran Minh Quang
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="JDBC.DBContext"%>
<%
    int id = (Integer) request.getAttribute("id");
    if (request.getAttribute("id") == null) {
        response.sendRedirect("listProducts.jsp");
    }
    DBContext db = new DBContext();
    try {
        String sql = "SELECT * from Pro_Details where Product_ID = '" + id + "'";
        ResultSet rs = db.executeQuery(sql);
        rs.next();
%>

<form class="form-horizontal" name="addCategory" method="POST" action="DeleteProduct?id=<%=request.getAttribute("id")%>">
    <div class="form-group">
        <label class="col-sm-4 control-label">
            Are you sure you want to delete product "<%=rs.getString("Name")%>"?
        </label>
    </div>
    <div class="form-group">
        <div class="col-sm-offset-1 col-sm-10">
            <button class="btn btn-github" type="submit">Yes</button>
            <a href="listProducts.jsp" class="btn btn-github">No</a>

        </div>
    </div>
</form>
<%
        rs.close();
    } catch (Exception e) {
        e.printStackTrace();
    } finally {
        db.close();
    }
%>