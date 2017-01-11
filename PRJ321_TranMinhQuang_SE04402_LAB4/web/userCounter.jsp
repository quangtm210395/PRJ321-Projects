<%-- 
    Document   : userCounter
    Created on : Nov 7, 2016, 4:54:29 PM
    Author     : Tran Minh Quang
--%>

<%@page import="java.util.Map"%>
<%@page import="bussinessObject.UsersSingleton"%>
<%@page import="java.util.HashMap"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>All user informations</title>
    </head>
    <body>
        <h1>All user informations:</h1>
        <%
            HashMap<String, String> dataMap = UsersSingleton.getInstance().getMap();
            for (Map.Entry<String, String> entry : dataMap.entrySet()) {
                out.println("<p>Username: " + entry.getKey() + ", Password: " + entry.getValue() + "</p>");
            }
        %>
    </body>
</html>
