<%-- 
    Document   : viewSession
    Created on : Nov 7, 2016, 1:21:32 PM
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
        
        Session Value is:
        <%=
            session.getAttribute("username")
        %>
        <br>
        <a href="index.jsp">Click to go to index.jsp</a>
        <hr>
        <a href="invalidateSession.jsp">Invalidate Session</a>
    </body>
</html>
