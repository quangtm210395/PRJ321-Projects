<%-- 
    Document   : slideBar
    Created on : Nov 10, 2016, 10:43:47 PM
    Author     : Tran Minh Quang
--%>


<aside class="main-sidebar">
    <!-- sidebar: style can be found in sidebar.less -->
    <section class="sidebar">
        <!-- Sidebar user panel -->
        <div class="user-panel">
            <div class="pull-left image">
                <img src="resources/dist/img/manager-512.png" class="img-circle" alt="User Image">
            </div>
            <div class="pull-left info">
                <p><%= (String) session.getAttribute("username")%></p>
                <i class="fa fa-circle text-success"></i> Online
            </div>
        </div>
        <!-- search form -->
        
        <!-- /.search form -->
        <!-- sidebar menu: : style can be found in sidebar.less -->
        <ul class="sidebar-menu">
            <li class="active treeview">
                <a href="#">
                    <i class="fa fa-circle-o text-yellow"></i> <span>Menu</span>
                    <span class="pull-right-container">
                        <i class="fa fa-angle-left pull-right"></i>
                    </span>
                </a>
                <ul class="treeview-menu">
                    <li><a href="index.jsp"><i class="fa fa-circle-o"></i> Dashboard </a></li>
                    <li><a href="createNewPost.jsp"><i class="fa fa-circle-o"></i> Create a new Post</a></li>
                </ul>
            </li>
            
        </ul>
    </section>
    <!-- /.sidebar -->
</aside>