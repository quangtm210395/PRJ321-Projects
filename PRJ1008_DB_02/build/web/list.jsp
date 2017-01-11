<%-- 
    Document   : list
    Created on : Nov 9, 2016, 2:28:32 PM
    Author     : luyenchu
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
        <%
            DbContext db = new DbContext();
            String sql = "SELECT * FROM Persons";
            try{
                ResultSet rs = db.executeQuery(sql);
            
        %>
        <ul>
            <%
                 while(rs.next()){
                     int id = rs.getInt(1);
            %>
            <li><a href="edit.jsp?id=<%=id%>"><%= rs.getInt(1)%>&nbsp; &CirclePlus; <%= rs.getString(2)%></a></li>
            <%
                    }
                    db.close();
            }catch(Exception e){
                out.println("Error!!!!: "+ e);
            }
            %>
        </ul>
        
    </body>
</html>
