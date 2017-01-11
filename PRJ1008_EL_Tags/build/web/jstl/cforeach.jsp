<%-- 
    Document   : cforeach
    Created on : Nov 16, 2016, 2:07:18 PM
    Author     : luyenchu
--%>

<%@page import="java.text.SimpleDateFormat"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <c:forEach var="i" begin="1" end="5">
            Item <c:out value="${i}"/><p>
            </c:forEach>
        <hr />
        <a href="${pageContext.servletContext.contextPath}/LoadingDataServlet">Load person</a>
        <br />
        <c:forEach items="${persons}" var="item">

            ${item.name} &DoubleLongRightArrow; 
            <fmt:formatNumber value="${item.tien}"
                              currencySymbol="USD"
                              type="currency"
                              pattern="###,###.##" />
            &nabla;
            ${item.age}
            <c:if test="${item.age > 25}">
                Senior
            </c:if>
            <c:if test="${item.age <= 25}">
                Junior
            </c:if>
            &DoubleLongLeftArrow; 
            <fmt:formatDate value="${item.joinDate}" pattern="dd/MM/yyyy" />
            
            <br />
        </c:forEach>
    </body>
</html>
