<%-- 
    Document   : profile
    Created on : Nov 7, 2016, 4:53:30 PM
    Author     : Tran Minh Quang
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Current User informations</title>
    </head>
    <body>
        <h1>Current User Information:</h1>
        Username: 
        <%=session.getAttribute("username")
        %>
        <br>
        Password:
        <%= session.getAttribute("password")
        %>
    </body>
</html>
