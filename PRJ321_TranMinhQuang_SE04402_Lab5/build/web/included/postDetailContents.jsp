<%-- 
    Document   : postDetailContents
    Created on : Nov 12, 2016, 10:02:20 PM
    Author     : Tran Minh Quang
--%>

<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%
    try {
        int id = Integer.parseInt(request.getParameter("id"));
    } catch (Exception e) {
%>
<h1>Error: Post_id must be a number</h1>
<a href="index.jsp">Back to Home Page</a>
<%
    }
%>

<c:catch var="exception">
    <sql:query dataSource="jdbc/Lab5_DB" var="rs">
        SELECT * from Posts where post_id = '${param.id}';
    </sql:query>
    <c:set value="${rs.rows}" var="row"/>
    <c:if test="${rs.rowCount == 0}">
        <c:set value="This Post_id does not exists" var="mes"/>
    </c:if>
    <p class="login-box-msg" style="color:red"><b>${mes}</b></p>
    <div class="post">
        <div class="user-block">
            <!--<img class="img-circle img-bordered-sm" src="resources/dist/img/manager-512.png" alt="user image"/>-->
            <span class="username">
                <!--Title -->
                <a href="postDetail.jsp?id=${row["0"].post_id}">${row["0"].title}</a>

                <c:if test="${row["0"].author == username}">
                    <a href="editPost.jsp?id=${row["0"].post_id}" class="pull-right btn-box-tool" ><i class="fa fa-fw fa-edit"></i></a>
                </c:if>
            </span>
            <!--User & published time -->
            <span class="description">by ${row["0"].author} - ${row["0"].state} at ${row["0"].published_time}</span>
        </div>
        <!-- /.user-block -->
        <p>
            ${row["0"].content}
        </p>

    </div>
</c:catch>
