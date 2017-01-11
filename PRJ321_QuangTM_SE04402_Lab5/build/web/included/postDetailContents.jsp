<%-- 
    Document   : postDetailContents
    Created on : Nov 12, 2016, 10:02:20 PM
    Author     : Tran Minh Quang
--%>

<%@page import="java.util.Map"%>
<%@page import="java.sql.Timestamp"%>
<%@page import="java.util.TreeMap"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="JDBC.DBContext"%>
<%
    String id = request.getParameter("id");
    DBContext db = new DBContext();
    String sql = "SELECT * from Posts WHERE post_id = '" + id + "'";
    ResultSet rs;
    try {
        rs = db.executeQuery(sql);
        rs.next();
%>

<div class="post">
    <div class="user-block">
        <img class="img-circle img-bordered-sm" src="resources/dist/img/manager-512.png" alt="user image">
        <span class="username">
            <!--Title -->
            <a href="postDetail.jsp?id=<%=rs.getInt(1)%>"><%=rs.getString(2)%></a>
            <%
                String author = rs.getString(4);
                if (author.equals((String)session.getAttribute("username"))) {
            %>
            <a href="editPost.jsp?id=<%=rs.getInt(1)%>" class="pull-right btn-box-tool" ><i class="fa fa-fw fa-edit"></i></a>
                <%
                    }
                %>
        </span>
        <!--User & published time -->
        <span class="description">by <%=session.getAttribute("username")%> - <%=rs.getString(6)%> at <%=rs.getTimestamp(5)%></span>
    </div>
    <!-- /.user-block -->
    <p>
        <%=rs.getString(3)%>
    </p>

</div>

<%
        
    } catch (Exception e) {
        e.printStackTrace();
    }


%>