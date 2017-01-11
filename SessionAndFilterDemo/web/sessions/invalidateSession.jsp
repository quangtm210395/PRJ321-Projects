<%-- 
    Document   : invalidateSession
    Created on : Nov 7, 2016, 1:28:07 PM
    Author     : Tran Minh Quang
--%>

<%
    session.invalidate();
    response.sendRedirect("index.jsp");
%>