<%-- 
    Document   : header
    Created on : Nov 10, 2016, 8:50:09 PM
    Author     : Tran Minh Quang
--%>

<header class="main-header">

    <!-- Logo -->
    <a href="#" class="logo">
        <!-- mini logo for sidebar mini 50x50 pixels -->
        <span class="logo-mini"><b>A</b>LT</span>
        <!-- logo for regular state and mobile devices -->
        <span class="logo-lg"><b>Product</b> Management</span>
    </a>

    <!-- Header Navbar: style can be found in header.less -->
    <nav class="navbar navbar-static-top">
        <!-- Sidebar toggle button-->
        <a href="#" class="sidebar-toggle" data-toggle="offcanvas" role="button">
            <span class="sr-only">Toggle navigation</span>
        </a>
        <!-- Navbar Right Menu -->
        <div class="navbar-custom-menu">
            <ul class="nav navbar-nav">
                <!-- Messages: style can be found in dropdown.less-->

                <!-- User Account: style can be found in dropdown.less -->
                <li class="dropdown user user-menu">
                    <a href="#" class="dropdown-toggle">
                        Login
                    </a>

                </li>
                <li><a href="#" data-toggle="control-sidebar"><i class="fa fa-gears"></i></a></li>
                <!-- Control Sidebar Toggle Button -->
            </ul>
        </div>

    </nav>
</header>

<!-- Left side column. contains the logo and sidebar -->
<aside class="main-sidebar">
    <!-- sidebar: style can be found in sidebar.less -->
    <section class="sidebar">
        <!-- Sidebar user panel -->
        <div class="user-panel">
            <div class="pull-left image">
                <img src="resources/dist/img/manager-512.png" class="img-circle" alt="User Image">
            </div>
            <div class="pull-left info">
                <p><a href="#">Become a member?</a></p>
            </div>
        </div>
        <!-- search form -->

        <!-- /.search form -->
        <!-- sidebar menu: : style can be found in sidebar.less -->
        <ul class="sidebar-menu">
            <li class="treeview">
                <a href="#">
                    <i class="fa fa-dashboard"></i> <span> Category Management</span>
                    <span class="pull-right-container">
                        <i class="fa fa-angle-left pull-right"></i>
                    </span>
                </a>
                <ul class="treeview-menu">
                    <li><a href="listCategory.jsp"><i class="fa fa-circle-o"></i> View Categories</a></li>
                    <li><a href="addCategory.jsp"><i class="fa fa-circle-o"></i> Add new Category</a></li>
                </ul>
            </li>
            <li class=" treeview">
                <a href="#">
                    <i class="fa fa-dashboard"></i> <span> Product Management</span>
                    <span class="pull-right-container">
                        <i class="fa fa-angle-left pull-right"></i>
                    </span>
                </a>
                <ul class="treeview-menu">
                    <li><a href="listProducts.jsp"><i class="fa fa-circle-o"></i> View Products</a></li>
                    <li><a href="addNewProduct.jsp"><i class="fa fa-circle-o"></i> Add new Product</a></li>
                </ul>
            </li>
            <li class=" treeview">
                <a href="#">
                    <i class="fa fa-dashboard"></i> <span> Shopping</span>
                    <span class="pull-right-container">
                        <i class="fa fa-angle-left pull-right"></i>
                    </span>
                </a>
                <ul class="treeview-menu">
                    <li><a href="sale.jsp"><i class="fa fa-circle-o"></i> Home page</a></li>
                    <li><a href="shoppingCart.jsp"><i class="fa fa-circle-o"></i> View Shopping Cart</a></li>
                </ul>
            </li>
        </ul>
    </section>
    <!-- /.sidebar -->
</aside>