<%-- 
    Document   : posts
    Created on : Nov 24, 2016, 9:49:58 AM
    Author     : Tran Minh Quang
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title>AdminLTE 2 | Dashboard</title>

        <%@include file="included/headerScript.jsp" %>
        
    </head>
    <body class="hold-transition skin-green-light sidebar-mini">
        <div class="wrapper">

            <%@include file="included/header.jsp" %>
            <%@include file="included/sidebar.jsp" %>
            
            <!-- Content Wrapper. Contains page content -->
            <div class="content-wrapper">
                <!-- Content Header (Page header) -->
                <section class="content-header">
                    <h1>
                        Dashboard
                        <small>Control panel</small>
                    </h1>
                    <ol class="breadcrumb">
                        <li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
                        <li class="active">Dashboard</li>
                    </ol>
                </section>

                <!-- Main content -->
                <%@include file="contents/postsContent.jsp" %>
                <!-- /.content -->
            </div>
            <!-- /.content-wrapper -->
            
            <%@include file="included/footer.jsp" %>
            
            <!-- /.control-sidebar -->
            <!-- Add the sidebar's background. This div must be placed
                 immediately after the control sidebar -->
            <div class="control-sidebar-bg"></div>
        </div>
        <!-- ./wrapper -->

        <%@include file="included/footerScript.jsp" %>
    </body>
</html>
