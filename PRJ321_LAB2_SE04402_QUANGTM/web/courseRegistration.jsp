<%-- 
    Document   : courseRegistration
    Created on : Oct 31, 2016, 3:40:39 PM
    Author     : Tran Minh Quang
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Course Registration</title>
    </head>
    <body>
        <h1>Course Registration</h1>
        <form action="CourseRegistration" method="post">
            First name: <input name="firstName" /><br>
            Last name: <input name="lastName" /><br>
            Contact no: <input name="contactNo" /><br>
            Email Address: <input name="emailAdd" /><br>
            <input type="checkbox" name="course" value="Java Desktop Application" checked> Java Desktop Application<br>
            <input type="checkbox" name="course" value="Web-base Java Application" > Web-base Java Application<br>
            <input type="checkbox" name="course" value=".Net Framework Application" > .Net Framework Application<br>
            <input type="submit" value="Submit" />
        </form>
    </body>
</html>
