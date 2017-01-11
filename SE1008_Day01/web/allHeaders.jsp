<%-- 
    Document   : allHeaders
    Created on : Oct 31, 2016, 2:14:35 PM
    Author     : luyenchu
--%>

<%@page import="java.util.Enumeration"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String agent = request.getHeader("User-Agent");
            Enumeration<String> headers = request.getHeaderNames();
        %>
        <p>You are accessing using <%= agent %></p>
        <%
            while(headers.hasMoreElements()){
                String headerName = headers.nextElement();
                out.println("Header: " + headerName);
                out.println("Value: " + request.getHeader(headerName));
                out.println("<br />");
            }
        %>
    </body>
</html>
