<%-- 
    Document   : validateform
    Created on : Nov 16, 2016, 1:56:35 PM
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
        <%
            String user = request.getParameter("user");
            if(user == null || "".equals(user)){
                request.setAttribute("message", "Error: User is empty!");
                request.getRequestDispatcher("/index.jsp").forward(request, response);
            }else{
                out.println("Validated: " + user);
            }
        %>
    </body>
</html>
