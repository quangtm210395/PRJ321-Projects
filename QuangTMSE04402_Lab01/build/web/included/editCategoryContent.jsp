<%-- 
    Document   : editCategoryContent
    Created on : Nov 14, 2016, 10:44:36 PM
    Author     : Tran Minh Quang
--%>
<%@page import="java.sql.ResultSet"%>
<%@page import="JDBC.DBContext"%>
<%
    int edit_cate_id = (Integer) request.getAttribute("edit_cate_id");
    if (request.getAttribute("edit_cate_id") == null) {
        response.sendRedirect("listCategory.jsp");
    }
    DBContext db = new DBContext();
    try {
        String sql = "SELECT * from Pro_Categories where Category_ID = '" + edit_cate_id + "'";
        ResultSet rs = db.executeQuery(sql);
        rs.next();
%>

<form name="addCategory" method="POST" action="EditCategory?id=<%=request.getAttribute("edit_cate_id")%>" class="form-horizontal">
    <p style="color:red">${message}</p>
    <div class="form-group">
        <label for="name" class="col-sm-2 control-label">Category Name </label>
        <div class="col-sm-10">
            <input type="text" name="category" value="<%=rs.getString("Name")%>" class="form-control" id="name">
        </div>
    </div>
    <div class="form-group">
        <div class="col-sm-offset-1 col-sm-10">
            <button class="btn btn-github" type="submit">Edit Category</button>
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