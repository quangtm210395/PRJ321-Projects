<%-- 
    Document   : index
    Created on : Nov 9, 2016, 1:44:35 PM
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
        Person 
        <hr />
        <p style="color:red;">${message}</p>
        <form action="InsertPerson" method="POST">
            <label for="pName">Person Name </label>
            <input name="pName" value="<%=request.getParameter("pName") != null?request.getParameter("pName"):""%>"  />
            <label for="pAge">Person Age </label>
            <input name="pAge" value="${param['pAge']}" />
            <button type="submit">Submit</button>
        </form>
    </body>
</html>
