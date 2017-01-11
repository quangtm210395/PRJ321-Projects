<%-- 
    Document   : index
    Created on : Oct 31, 2016, 1:26:36 PM
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
        <ol>
            <%
                for (int i = 0; i < 10; i++) {
            %>
            <li><%= i%></li>
                <%
                    }
                %>
            <hr />
            <form action="ForwardServlet">
                <input name="user" />
                <button type="submit">
                    Submit
                </button>
            </form>
        </ol>
    </body>
</html>
