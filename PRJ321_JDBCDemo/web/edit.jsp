<%-- 
    Document   : edit
    Created on : Nov 9, 2016, 2:56:31 PM
    Author     : Tran Minh Quang
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="jdbc.DbContext"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <hr />
        <p style="color:red;">${message}</p>
        <%
            DbContext db = new DbContext();
            String sql = "SELECT * FROM Persons WHERE id=" + request.getParameter("id");
            try {
                ResultSet rs = db.executeQuery(sql);

        %>
        <ul>
            <%                if (rs.next()) {
                int id = rs.getInt(1);
                String name = rs.getString(2);
                int age = rs.getInt(3);
            %>
            <form action="UpdatePerson" method="POST">
                <input type="hidden" name="id" value="<%=id%>" />
                <label for="pName">Person Name </label>
                <input name="pName" value="<%=name%>"  />
                <label for="pAge">Person Age </label>
                <input name="pAge" value="<%=age%>" />
                <button type="submit">Submit</button>
            </form>
            <%
                    } else {
                        out.println("<br /> found no record with id given!");
                    }
                    db.close();
                } catch (Exception e) {
                    out.println("Error!!!!: " + e);
                }
            %>
        </ul>
    </body>
</html>
