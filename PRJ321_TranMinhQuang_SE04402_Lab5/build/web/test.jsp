<%-- 
    Document   : test
    Created on : Nov 17, 2016, 12:11:51 AM
    Author     : Tran Minh Quang
--%>

<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page import="java.io.*,java.util.*,java.sql.*"%>
<%@ page import="javax.servlet.http.*,javax.servlet.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>

<html>
    <head>
        <title>JSTL sql:query Tag</title>
    </head>
    <body>
        <sql:query dataSource="jdbc/Lab5_DB" var="result">
            SELECT * from Posts order by published_time DESC;
        </sql:query>
            Total number of selected: ${result.rowCount}
            
        <table border="1" width="100%">
            <tr>
                <th>ID</th>
                <th>Title</th>
                <th>Author</th>
            </tr>

            <c:forEach var="row" items="${result.rows}" >
                <tr>
                    <td>${row["post_id"]}</td>
                    <td>${row["title"]}</td>
                    <td>${row["author"]}</td>
                </tr>
            </c:forEach>
            <c:set var="i" value="0"/>
                <tr>
                    <td>${result.rows["0"].post_id}</td>
                    <td>${result.rows["0"].title}</td>
                    <td>${result.rows["0"].author}</td>
                </tr>
        </table>
                    <c:set var="so" value="123" scope="request"/>
                    <%
//                        request.getParameter("so1","223");
                    %>
                    <h5>${param.so1}</h5>
    </body>
</html>
