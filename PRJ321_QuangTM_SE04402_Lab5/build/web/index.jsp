<%-- 
    Document   : index
    Created on : Nov 10, 2016, 8:04:58 PM
    Author     : Tran Minh Quang
--%>

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
        <title>Dashboard</title>
        <%@include file="included/headerScript.jsp" %>
    </head>
    <body class="hold-transition skin-blue sidebar-mini" onload="initializeSliderButtons()">
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
                                        <li class="active"><a href="#activity" data-toggle="tab">Posts</a></li>
                                    </ul>
                                    <div class="tab-content">
                                        <div class="active tab-pane" id="activity">
                                            <!-- Posts -->
                                            <%@include file="included/postContents.jsp" %>
                                            <!-- /.posts -->
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
