<%-- 
    Document   : declarationDemo
    Created on : Nov 2, 2016, 1:33:24 PM
    Author     : Tran Minh Quang
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%!
    String name = "Quang";
    private void doSomething() {
        System.out.println("I'm doing something!");
    }
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%= name
        %>
        <% 
            doSomething();
        %>
    </body>
</html>
