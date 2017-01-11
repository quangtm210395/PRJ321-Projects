<%-- 
    Document   : setSession
    Created on : Nov 7, 2016, 1:21:25 PM
    Author     : Tran Minh Quang
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            session.setAttribute("username", "Quang");
            out.println("Session has been set!!!");
        %>
        <br>
        <a href="index.jsp">Click to back to index.jsp</a>
    </body>
</html>
