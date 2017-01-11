<%-- 
    Document   : index
    Created on : Nov 16, 2016, 1:49:31 PM
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
        <h1>Hello World!</h1>
        Example of EL \${3+5}: ${3+5}
        <hr />
        <%
            String s = request.getParameter("user");
        %>
        Param User by request parameter: [<%= s%>]
        Param User: [${param["user"]}]
        <hr />
        <b><a style="color:red">${message}</a></b>
        <form action="validateform.jsp">
            Enter user: <input name="user" />
            <button type="submit">Submit</button>
        </form>
        <hr />
        ${header}
        <br />
        ${header["user-agent"]}
        <hr />
        ${sessionScope["loggedUser"]}
    </body>
</html>
