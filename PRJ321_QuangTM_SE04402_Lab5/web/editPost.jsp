<%-- 
    Document   : editPost
    Created on : Nov 11, 2016, 3:17:46 PM
    Author     : Tran Minh Quang
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="JDBC.DBContext"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    Object user = session.getAttribute("username");
    if (user == null) {
        response.sendRedirect("login.jsp");
    }
%>
<!DOCTYPE html>
<html>
    <head>
        <title>Create new Post</title>
        <%@include file="included/headerScript.jsp" %>
    </head>
    <body class="hold-transition skin-blue sidebar-mini">
        <div class="wrapper">

            <!--Header -->
            <%@include file="included/header.jsp" %>
            <!-- Left side column. contains the logo and sidebar -->


            <!-- Content Wrapper. Contains page content -->
            <div class="content-wrapper">
                <!-- Content Header (Page header) -->
                <section class="content-header">
                    <h1>
                        Posts
                        <small></small>
                    </h1>
                    <ol class="breadcrumb">
                        <li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
                        <li class="active">Posts</li>
                    </ol>

                    <!--Content -->
                    <section class="content">
                        <div class="row">
                            <div class="row">
                                <div class="nav-tabs-custom">
                                    <ul class="nav nav-tabs">
                                        <li class="active"><a href="#timeline" data-toggle="tab">Write a new Post</a></li>
                                    </ul>
                                    <div class="tab-content">

                                        <!-- /.tab-pane -->
                                        <div class="active tab-pane" id="timeline">
                                            <!-- The writer -->
                                            <%                                                        int id = Integer.parseInt(request.getParameter("id"));
                                                DBContext db = new DBContext();
                                                String sql = "SELECT * from Posts where post_id = '" + id + "'";
                                                ResultSet rs;
                                                try {
                                                    rs = db.executeQuery(sql);
                                                    rs.next();
                                            %>
                                            <form class="form-horizontal" action="EditPostServlet?id=<%=rs.getInt(1)%>" method="post">
                                                <div class="form-group">
                                                    <p class="login-box-msg">${message}</p>
                                                    <label for="inputName" class="col-sm-2 control-label" >Title</label>

                                                    <div class="col-sm-10">
                                                        <input type="text" class="form-control" value="<%=rs.getString(2)%>" id="inputName" placeholder="Title" name="title">
                                                    </div>
                                                </div>
                                                <div class="form-group">
                                                    <label for="inputExperience" class="col-sm-2 control-label">Content</label>

                                                    <div class="col-sm-10">
                                                        <textarea class="form-control" id="inputExperience" name="content"><%=rs.getString(3)%></textarea>
                                                    </div>
                                                </div>
                                                <p></p>
                                                <%
                                                    } catch (Exception e) {
                                                        e.printStackTrace();
                                                    }
                                                %>
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
                                        <!-- /.tab-pane -->

                                    </div>
                                    <!-- /.tab-content -->
                                </div>
                            </div>
                        </div>
                    </section>

                </section>

                <!-- Main content -->


                <!-- /.content -->
            </div>
            <!-- /.content-wrapper -->

            <%@include file="included/footer.jsp" %>
        </div>
        <%@include file="included/footerScript.jsp" %>
    </body>
</html>
