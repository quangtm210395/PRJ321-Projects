<%-- 
    Document   : listProductContent
    Created on : Nov 14, 2016, 10:54:50 PM
    Author     : Tran Minh Quang
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="JDBC.DBContext"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    String cate_id = (String) session.getAttribute("cate_id");
    System.out.println(cate_id);
%>

<div class="row">
    <div class="col-md-6">
        <form action="ProductFilter" method="POST" class="form-horizontal">
            <div class="form-group">
                <div class="col-md-offset-1 col-md-6">
                    <label for="category">Name </label>
                    <select name="category_id" id="category" class="form-control select2 select2-hidden-accessible" style="width: 100%;">
                        <%
                            if (cate_id == null || (cate_id != null && cate_id.equals("all"))) {
                        %>
                        <option value="all" selected>All</option>
                        <%
                        } else {
                        %>
                        <option value="all">All</option>
                        <%
                            }
                            DBContext db = new DBContext();
                            String query = "SELECT * FROM Pro_Categories";
                            try {
                                ResultSet rs1 = db.executeQuery(query);
                                while (rs1.next()) {
                                    if (cate_id != null && cate_id.equals(rs1.getInt(1) + "")) {
                        %>
                        <option value="<%=rs1.getInt(1)%>" selected><%=rs1.getString(2)%></option>
                        <%
                        } else {
                        %>
                        <option value="<%=rs1.getInt(1)%>"><%=rs1.getString(2)%></option>
                        <%
                                }
                            }
                            rs1.close();
                        %>
                    </select>
                </div>
            </div>
            <div class="form-group">
                <div class="col-md-offset-1 col-md-10">
                    <button class="btn btn-github" type="submit">Filter</button>
                </div>
            </div>
        </form>
    </div>
</div>
<p></p>
<div class="row">
    <div class="col-md-10">
        <%
            String category = "All";
            if (cate_id != null && !cate_id.equals("all")) {
                ResultSet r = db.executeQuery("Select * from Pro_Categories where Category_ID = '" + cate_id + "'");
                r.next();
                category = r.getString("Name");
                r.close();
            }
        %>
        <h3>Product List in [<%=category%>] category</h3>
    </div>
</div>
<div class="row">
    <div class="col-sm-12">
        <table class="table table-bordered table-striped dataTable" role="grid" aria-describedby="example1_info" >
            <tr><th bgcolor="grey">ID</th>
                <th bgcolor="grey">Title</th>
                <th bgcolor="grey">Action</th>
            </tr>
            <%
                String sql = "";
                if (cate_id == null || cate_id.equals("all")) {
                    sql = "SELECT * FROM Pro_Details";
                } else {
                    sql = "SELECT * FROM Pro_Details WHERE Category_ID = '" + cate_id + "'";
                }
                ResultSet rs = db.executeQuery(sql);
                while (rs.next()) {
            %>
            <tr><td><%=rs.getInt(1)%></td>
                <td><%=rs.getString(3)%></td>
                <td>
                    <a href="DeleteProductServlet?id=<%=rs.getInt(1)%>">Delete</a> | 
                    <a href="EditProductServlet?id=<%=rs.getInt(1)%>">Edit</a>
                </td>
            </tr>
            <%
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
                <div class="col-md-offset-1 col-md-10">
                    <a class="btn btn-github" href="addNewProduct.jsp">Add Products</a>
                    <a class="btn btn-github" href="listCategory.jsp">Category list</a>
                </div>
            </div>
        </div>
    </div>
</div>
