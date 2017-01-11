<%-- 
    Document   : index
    Created on : Nov 21, 2016, 6:13:33 AM
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
        <jsp:useBean id="person1" class="beans.Person" scope="request" />
        ${person1}
        <hr>
        
        
    </body>
</html>
