<%-- 
    Document   : posts
    Created on : Nov 10, 2016, 11:30:03 PM
    Author     : Tran Minh Quang
--%>

<%@page import="java.util.Map"%>
<%@page import="java.sql.Timestamp"%>
<%@page import="java.util.TreeMap"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="JDBC.DBContext"%>


<%
    DBContext db = new DBContext();
    String sql = "SELECT * from Posts order by published_time DESC";
    ResultSet rs;
    String username = (String) session.getAttribute("username");
    String p = (String) request.getParameter("pagi");
    System.out.println("pagi = " + p);
    int pagi = p != null ? Integer.parseInt(p) - 1 : 0;
    System.out.println(pagi);

    try {
        rs = db.executeQuery(sql);
        //calculate row count
        int size = 0;
        while (rs.next()) {
            String author = rs.getString(4);
            if (!(rs.getString(6).equals("Drafted") && !author.equals(username))) {
                size++;
            }
        }
        rs.beforeFirst();
        
        int pageCount = (size - 1) / 5 + 1;
        if (pagi < 0 || pagi > pageCount) {
            response.sendRedirect("posts.jsp");
        }
        
        if (pagi > 0) {
            for (int i = 0; i < 5 * pagi; i++) {
                if (rs.next()) {
                    if (rs.getString(6).equals("Drafted") && !rs.getString(4).equals(username)) {
                        i--;
                    }
                    continue;
                } else {
                    break;
                }
            }
        }

        for (int i = 0; i < 5; i++) {
            if (rs.next()) {
                String author = rs.getString(4);
                if (!(rs.getString(6).equals("Drafted") && !author.equals(username))) {

%>

<div class="post">
    <div class="user-block">
        <!--<img class="img-circle img-bordered-sm" src="resources/dist/img/manager-512.png" alt="user image">-->
        <span class="username">
            <!--Title -->
            <a href="postDetail.jsp?id=<%=rs.getInt(1)%>"><%=rs.getString(2)%></a>
            <%
                if (author.equals(username)) {
            %>
            <a href="editPost.jsp?id=<%=rs.getInt(1)%>" class="pull-right btn-box-tool" ><i class="fa fa-fw fa-edit"></i></a>
                <%
                    }
                %>
        </span>
        <!--User & published time -->
        <span class="description">by <%=rs.getString(4)%> - <%=rs.getString(6)%> at <%=rs.getTimestamp(5)%></span>
    </div>
    <!-- /.user-block -->
<!--        <p>
    <%=rs.getString(3)%>
</p>-->

</div>

<%
            } else
                i--;
        } else
            break;
    }
    rs.close();
%>
<div class="box-footer">
    <ul class="pagination no-margin pull-right" id="pagination-buttons">
        <li><a href="?pagi=<%=(pagi + 1) > 1 ? pagi : (pagi + 1)%>"><</a></li>
        <li class="active"><a href="?pagi=1">1</a></li>
            <%
                for (int i = 2; i <= pageCount; i++) {
            %>
        <li><a href="?pagi=<%=i%>"><%=i%></a></li>
            <%
                }
            %>
        <li><a href="?pagi=<%=(pagi + 1) < pageCount ? (pagi + 2) : (pagi + 1)%>">></a></li>
    </ul>
</div>
<%
    } catch (Exception e) {
        e.printStackTrace();
    } finally {
        db.close();
    }
%>
