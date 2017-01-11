<%-- 
    Document   : deleteCategoryContent
    Created on : Nov 14, 2016, 7:26:47 PM
    Author     : Tran Minh Quang
--%>
<%@page import="java.sql.ResultSet"%>
<%@page import="JDBC.DBContext"%>
<%
    int dete_cate_id = (Integer) request.getAttribute("dele_cate_id");
    if (request.getAttribute("dele_cate_id") == null) {
        response.sendRedirect("listCategory.jsp");
    }
    DBContext db = new DBContext();
    try {
        String sql = "SELECT * from Pro_Categories where Category_ID = '" + dete_cate_id + "'";
        ResultSet rs = db.executeQuery(sql);
        rs.next();
%>

<form class="form-horizontal" name="addCategory" method="POST" action="DeleteCategory?id=<%=request.getAttribute("dele_cate_id")%>">
    <div class="form-group">
        <label class="col-sm-5 control-label">
            Are you sure you want to delete category "<%=rs.getString("Name")%>"?
        </label>
    </div>
    <div class="form-group">
        <div class="col-sm-offset-1 col-sm-10">
            <button class="btn btn-github" type="submit">Yes</button>
            <a href="listCategory.jsp" class="btn btn-github">No</a>
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
