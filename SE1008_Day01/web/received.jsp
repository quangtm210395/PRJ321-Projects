<%-- 
    Document   : received
    Created on : Oct 31, 2016, 2:28:00 PM
    Author     : luyenchu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <p>
            Bonjour:
            <%
                String userEnter = (String)request.getAttribute("userEnter");
            %>
            <b>
                <%= userEnter %>
            </b>
        </p>
    </body>
</html>
