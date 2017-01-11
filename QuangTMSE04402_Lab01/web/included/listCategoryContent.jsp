<%-- 
    Document   : listCategoryContent
    Created on : Nov 14, 2016, 6:21:52 PM
    Author     : Tran Minh Quang
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="JDBC.DBContext"%>
<%
    String name = (String) (session.getAttribute("name") != null ? session.getAttribute("name") : "");
%>

<div class="row">
    <div class="col-md-6">
        <form action="SearchProcess" method="Post" class="form-horizontal">
            <div class="form-group">
                <div class="col-md-offset-1 col-md-6">
                    <label for="search">Name </label>
                    <input name="name" value="<%=name%>" class="form-control input-sm" id="search">
                </div>
            </div>
            <div class="form-group">
                <div class="col-md-offset-1 col-md-10">
                    <button class="btn btn-github" type="submit">Search</button>
                </div>
            </div>
        </form>
    </div>
</div>

<p></p>
<div class="row">
    <div class="col-sm-12">
        <table class="table table-bordered table-striped dataTable" role="grid" aria-describedby="example1_info" >
            <tr>
                <th bgcolor="grey">ID</th>
                <th bgcolor="grey">Category</th>
                <th bgcolor="grey">Action</th>
            </tr>
            <%
                DBContext db = new DBContext();
                String sql = "SELECT * FROM Pro_Categories";
                try {
                    ResultSet rs = db.executeQuery(sql);
                    while (rs.next()) {
                        if (!name.isEmpty()) {
                            if (rs.getString(2).toLowerCase().contains(name.toLowerCase())) {
            %>
            <tr><td><%=rs.getInt(1)%></td>
                <td><%=rs.getString(2)%></td>
                <td>
                    <a href="DeleteCategoryServlet?id=<%=rs.getInt(1)%>&name=<%=rs.getString(2)%>">Delete</a> | 
                    <a href="EditCategoryServlet?id=<%=rs.getInt(1)%>">Edit</a> | 
                    <a href="ProductFilter?category_id=<%=rs.getInt(1)%>">Product in categories</a> | 
                    <a href="SaleFilter?category_id=<%=rs.getInt(1)%>">Sales</a>
                </td>
            </tr>
            <%
                }
            } else {
            %>
            <tr><td><%=rs.getInt(1)%></td>
                <td><%=rs.getString(2)%></td>
                <td>
                    <a href="DeleteCategoryServlet?id=<%=rs.getInt(1)%>">Delete</a> | 
                    <a href="EditCategoryServlet?id=<%=rs.getInt(1)%>">Edit</a> | 
                    <a href="ProductFilter?category_id=<%=rs.getInt(1)%>">Product in categories</a> | 
                    <a href="SaleFilter?category_id=<%=rs.getInt(1)%>">Sales</a>
                </td>
            </tr>
            <%
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    db.close();
                }
            %>

        </table>
    </div>
</div>
<div class="row">
    <div class="col-md-6">
        <div class="form-horizontal">
            <div class="form-group">
                <div class="col-md-offset-1 col-md-2">
                    <a class="btn btn-github" href="addCategory.jsp">Add Category</a>
                </div>
            </div>
        </div>
    </div>
</div>