<%-- 
    Document   : addNewProductContent
    Created on : Nov 15, 2016, 12:03:25 AM
    Author     : Tran Minh Quang
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="JDBC.DBContext"%>
<form name="addCategory" method="POST" action="AddProduct" class="form-horizontal">
    <p style="color:red">${message}</p>
    <div class="form-group">
        <label for="name" class="col-sm-2 control-label">Title </label>
        <div class="col-sm-10">
            <input type="text" name="name" class="form-control" id="name">
        </div>
    </div>
    <div class="form-group">
        <label for="name" class="col-sm-2 control-label">Description </label>
        <div class="col-sm-10">
            <textarea name="description" class="form-control" id="name"></textarea>
        </div>
    </div>
    <div class="form-group">
        <label for="name" class="col-sm-2 control-label">Available? </label>
        <div class="col-sm-10">
            <input type="checkbox" class="minimal" name="available" id="name">
        </div>
    </div>
    <div class="form-group">
        <label for="name" class="col-sm-2 control-label">Price </label>
        <div class="col-sm-10">
            <input type="text" name="price" value="0.0" class="form-control" id="name">
        </div>
    </div>
    <div class="form-group">
        <label for="name" class="col-sm-2 control-label">Category </label>
        <div class="col-sm-10">
            <select name="category_id" id="category" class="form-control select2 select2-hidden-accessible" style="width: 100%;">
                <%
                    DBContext db = new DBContext();
                    String query = "SELECT * FROM Pro_Categories";
                    try {
                        ResultSet rs1 = db.executeQuery(query);
                        while (rs1.next()) {
                %>
                <option value="<%=rs1.getInt(1)%>"><%=rs1.getString(2)%></option>
                <%
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    } finally {
                        db.close();
                    }
                %>
            </select>
        </div>
    </div>
    <div class="form-group">
        <div class="col-sm-offset-2 col-sm-10">
            <button class="btn btn-github" type="submit">Add Product</button>
        </div>
    </div>
</form>
