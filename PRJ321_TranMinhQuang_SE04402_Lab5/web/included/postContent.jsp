<%-- 
    Document   : postContent
    Created on : Nov 16, 2016, 10:43:05 PM
    Author     : Tran Minh Quang
--%>

<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>

<c:catch var="exception">
    <%
        String p = (String) request.getParameter("pagi");
        int pageNum = p != null ? Integer.parseInt(p) : 1;
        request.setAttribute("min", (pageNum - 1) * 5);
        request.setAttribute("max", pageNum * 5);
    %>

    <c:set var="draft" value="Drafted"></c:set>
    <sql:query dataSource="jdbc/Lab5_DB" var="rs">
        SELECT * FROM POSTS WHERE author = '${username}' OR state != '${draft}' ORDER BY published_time DESC;
    </sql:query>

    <sql:query dataSource="jdbc/Lab5_DB" var="result">
        SELECT * FROM (
        SELECT *, ROW_NUMBER() OVER (ORDER BY published_time DESC) as row FROM posts where author = '${username}' OR state != '${draft}'
        )newTable  WHERE row BETWEEN ${min} AND ${max};
    </sql:query>

    <c:set var="rowCount" value="${rs.rowCount}" scope="request"/>
    <%
        System.out.println("row count " + request.getAttribute("rowCount"));
        int pageCount = (int) Math.ceil((Integer) request.getAttribute("rowCount") * 1.0 / 5);
        request.setAttribute("pageCount", pageCount);
        if (pageNum < 1 || pageNum > pageCount) {
            response.sendRedirect("posts.jsp");
        }
    %>

    <c:forEach var="row" items="${result.rows}">
        <div class="post">
            <div class="user-block">
                <!--<img class="img-circle img-bordered-sm" src="resources/dist/img/manager-512.png" alt="user image">-->
                <span class="username">
                    <!--Title -->
                    <a href="postDetail.jsp?id=${row.post_id}">${row.title}</a>
                    <c:if test="${row.author == username}">
                        <a href="editPost.jsp?id=${row.post_id}" class="pull-right btn-box-tool" ><i class="fa fa-fw fa-edit"></i></a>
                        </c:if>
                </span>
                <!--User & published time -->
                <span class="description">by ${row.author} - ${row.state} at ${row.published_time}</span>
            </div>
            <!-- /.user-block -->
            <!--        <p>
            ${row.content}
        </p>-->

        </div>
    </c:forEach>

    <div class="box-footer">
        <ul class="pagination no-margin pull-right" id="pagination-buttons">
            <li class="<%= (pageNum > 1) ? "" : "disabled"%>"><a href="?pagi=<%= pageNum > 1 ? (pageNum - 1) : pageNum%>"><</a></li>

            <%
                for (int i = 1; i <= pageCount; i++) {
                    System.out.println("page num : " + pageNum + " i: " + i);
            %>
            <li class="<%= (pageNum) == i ? "active" : ""%>"><a href="?pagi=<%=i%>"><%=i%></a></li>
                <%
                    }
                %>

            <li class="<%= (pageNum < pageCount) ? "" : "disabled"%>"><a href="?pagi=<%= pageNum < pageCount ? (pageNum + 2) : pageNum%>">></a></li>
        </ul>
    </div>

</c:catch>
<p>${exception}</p>