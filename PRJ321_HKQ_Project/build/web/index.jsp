<%-- 
    Document   : index
    Created on : Nov 23, 2016, 12:54:48 PM
    Author     : Tran Minh Quang
--%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title>HKQ Freelancer</title>

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
                <%@include file="contents/indexContent.jsp" %>
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
