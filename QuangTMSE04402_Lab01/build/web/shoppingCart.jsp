<%-- 
    Document   : shoppingCart
    Created on : Nov 15, 2016, 3:18:46 AM
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
                        <li><a href="#"><i class="fa fa-dashboard"></i> Shopping Cart</a></li>
                        <li class="active"> View Shopping Cart</li>
                    </ol>

                    <!--Content -->
                    <section class="content">
                        <div class="row">
                            <div class="col-md-12">
                                <div class="nav-tabs-custom">
                                    <div class="tab-content">
                                        <div class="box-header">
                                            <h3 class="box-title">Shopping cart details</h3>
                                        </div>
                                        <div class="box-body">
                                            <!-- Posts -->
                                            <%@include file="included/shoppingCartContent.jsp" %>
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
        