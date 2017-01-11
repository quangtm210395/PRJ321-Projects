<%-- 
    Document   : editPostContent
    Created on : Nov 17, 2016, 11:37:44 PM
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
    <div class="active tab-pane" id="timeline">
        <form class="form-horizontal" action="EditPostServlet?id=${param.id}" method="post">
            <div class="form-group">
                <p class="login-box-msg" style="color:red"><b>${mes}</b></p>
                <p class="login-box-msg" style="color:red"><b>${message}</b></p>
                <label for="inputName" class="col-sm-2 control-label" >Title</label>

                <div class="col-sm-10">
                    <input type="text" class="form-control" value="${row["0"].title}" id="inputName" placeholder="Title" name="title">
                </div>
            </div>
            <div class="form-group">
                <label for="inputExperience" class="col-sm-2 control-label">Content</label>

                <div class="col-sm-10">
                    <textarea class="form-control" id="inputExperience" name="content">${row["0"].content}</textarea>
                </div>
            </div>
            <p></p>
            <div class="form-group">
                <label for="inputExperience" class="col-sm-2 control-label">State</label>
                <div class="col-sm-10">
                    <select class="form-control select2 select2-hidden-accessible" id="inputExperience" name="state" style="width: 100%;" tabindex="-1" aria-hidden="true">
                        <option selected="selected" value="Published">Publish</option>
                        <option value="Drafted">Draft</option>
                    </select>
                </div>
            </div>
            <div class="form-group">
                <div class="col-sm-offset-2 col-sm-10">
                    <button type="submit" class="btn btn-danger">Submit</button>
                </div>
            </div>
        </form>
    </div>
</c:catch>