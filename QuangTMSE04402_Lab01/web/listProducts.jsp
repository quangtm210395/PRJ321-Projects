<%-- 
    Document   : listProducts
    Created on : Nov 14, 2016, 2:46:37 PM
    Author     : Tran Minh Quang
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Product Management</title>
        <%@include file="included/headerScript.jsp" %>
    </head>
    <body class="hold-transition skin-blue sidebar-mini" onload="initializeSliderButtons()">
        <div class="wrapper">

            <!--Header -->
            <%@include file="included/header.jsp" %>

            <!-- Content Wrapper. Contains page content -->
            <div class="content-wrapper">
                <!-- Content Header (Page header) -->
                <section class="content-header">
                    <h1>
                        Product Management
                        <small></small>
                    </h1>
                    <ol class="breadcrumb">
                        <li><a href="#"><i class="fa fa-dashboard"></i> Product</a></li>
                        <li class="active"> List Products</li>
                    </ol>

                    <!--Content -->
                    <section class="content">
                        <div class="row">
                            <div class="col-md-12">
                                <div class="nav-tabs-custom">
                                    <div class="tab-content">
                                        <div class="box-header">
                                            <h3 class="box-title">List Products</h3>
                                        </div>
                                        <div class="box-body">
                                            <!-- Posts -->
                                            <%@include file="included/listProductContent.jsp" %>
                                            <!-- /.posts -->

                                            <!-- /.tab-pane -->
                                        </div>
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
        