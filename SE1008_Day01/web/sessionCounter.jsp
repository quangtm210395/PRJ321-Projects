<%-- 
    Document   : sessionCounter
    Created on : Nov 2, 2016, 1:25:20 PM
    Author     : Tran Minh Quang
--%>

<%@page import="listener.SessionCounter"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        Current number of connected users:
        <%= SessionCounter.counter.get()%>
    </body>
</html>
