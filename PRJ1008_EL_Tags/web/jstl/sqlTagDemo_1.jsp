<%-- 
    Document   : sqlTagDemo
    Created on : Nov 16, 2016, 2:36:00 PM
    Author     : luyenchu
--%>

<%@ page import="java.io.*,java.util.*,java.sql.*"%>
<%@ page import="javax.servlet.http.*,javax.servlet.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>

<html>
    <head>
        <title>JSTL sql:query Tag</title>
    </head>
    <body>
        <sql:query dataSource="jdbc/personDB" var="result">
            SELECT * from Persons;
        </sql:query>
            Total number of selected: ${result.rowCount}
            
        <table border="1" width="100%">
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Age</th>
            </tr>

            <c:forEach var="row" items="${result.rows}">
                <tr>
                    <td>${row["id"]}</td>
                    <td>${row["personName"]}</td>
                    <td>${row["personAge"]}</td>
                </tr>
            </c:forEach>
        </table>

    </body>
</html>
