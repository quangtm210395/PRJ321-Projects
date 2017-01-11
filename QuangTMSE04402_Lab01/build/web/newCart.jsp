<%-- 
    Document   : newCart
    Created on : Nov 15, 2016, 1:03:52 PM
    Author     : Tran Minh Quang
--%>

<%@page import="BusinessObject.MySingleton"%>
<%
    Cookie[] cookies = request.getCookies();
    for (int i = 0; i < cookies.length; i++) {
        Cookie cookie = cookies[i];
        cookie.setMaxAge(0);
        response.addCookie(cookie);
    }
    MySingleton.getInstance().clearMapID();
    response.sendRedirect("ListProduct.jsp");
%>
