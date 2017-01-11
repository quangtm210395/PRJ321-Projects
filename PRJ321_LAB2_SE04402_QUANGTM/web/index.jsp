<%-- 
    Document   : index
    Created on : Oct 31, 2016, 2:32:34 PM
    Author     : Tran Minh Quang
--%>

<%@page import="java.util.Enumeration"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page import="java.util.Random"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tran Minh Quang</title>
    </head>
    <body>
        <%
            for(int i = 1; i <= 10; i++) {
                out.println(i + " ");
            }
        %>
        <hr />
        <%
            for(int j = 1; j <= 10; j++) {
                out.println(j*j + " ");
            }
        %>
        <hr />
        <%
            String left = "1<sup>2</sup>";
            String right = "1";
            int result = 1;
        %>
            <p style ="color: rgb( <%= new Random().nextInt(255)%>, <%= new Random().nextInt(255)%>, <%= new Random().nextInt(255)%> );">
                <%=left%> = <%=right%> = <%=result%> </p>
        <%
            for(int k = 2; k <= 10; k ++) {
                left += "+ " + Integer.toString(k) + "<sup>2</sup>";
                right += "+ " + Integer.toString(k*k);
                result+= k*k;
        %>
        <p style ="color: rgb( <%= new Random().nextInt(255)%>, <%= new Random().nextInt(255)%>, <%= new Random().nextInt(255)%> );">
                <%=left%> = <%=right%> = <%=result%> </p>
        <%
            }
        %>
        <hr />
        
        <p>
            Current Date: <%=new Date()%>
        </p>
        <hr />
        
        <p>
            Current Date: <%=new SimpleDateFormat("dd/MM/yy HH:mm").format(new Date())%>
        </p>
        
        <%
            String agent = request.getHeader("User-Agent");
            Enumeration<String> headers = request.getHeaderNames();
        %>
        <p>You are accessing using <%= agent %></p>
        <%
            while(headers.hasMoreElements()){
                String headerName = headers.nextElement();
                out.println("Header: " + headerName);
                out.println("Value: " + request.getHeader(headerName));
                out.println("<br />");
            }
        %>
        
    </body>
</html>
