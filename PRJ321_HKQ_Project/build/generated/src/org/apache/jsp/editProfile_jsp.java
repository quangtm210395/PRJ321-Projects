package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class editProfile_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(6);
    _jspx_dependants.add("/included/headerScript.jsp");
    _jspx_dependants.add("/included/header.jsp");
    _jspx_dependants.add("/included/sidebar.jsp");
    _jspx_dependants.add("/contents/editProfileContent.jsp");
    _jspx_dependants.add("/included/footer.jsp");
    _jspx_dependants.add("/included/footerScript.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_choose;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_otherwise;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sql_query_var_dataSource;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_when_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_choose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_otherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_sql_query_var_dataSource = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_when_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_set_var_value_nobody.release();
    _jspx_tagPool_c_choose.release();
    _jspx_tagPool_c_if_test.release();
    _jspx_tagPool_c_otherwise.release();
    _jspx_tagPool_sql_query_var_dataSource.release();
    _jspx_tagPool_c_when_test.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <title>HKQ Freelancer</title>\n");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("<!-- Tell the browser to be responsive to screen width -->\n");
      out.write("  <meta content=\"width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no\" name=\"viewport\">\n");
      out.write("  <!-- Bootstrap 3.3.6 -->\n");
      out.write("  <link rel=\"stylesheet\" href=\"resources/bootstrap/css/bootstrap.min.css\">\n");
      out.write("  <!-- Font Awesome -->\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.5.0/css/font-awesome.min.css\">\n");
      out.write("  <!-- Ionicons -->\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/ionicons/2.0.1/css/ionicons.min.css\">\n");
      out.write("  <!-- Theme style -->\n");
      out.write("  <link rel=\"stylesheet\" href=\"resources/dist/css/AdminLTE.min.css\">\n");
      out.write("  <!-- AdminLTE Skins. Choose a skin from the css/skins\n");
      out.write("       folder instead of downloading all of them to reduce the load. -->\n");
      out.write("  <link rel=\"stylesheet\" href=\"resources/dist/css/skins/_all-skins.min.css\">\n");
      out.write("  <!-- iCheck -->\n");
      out.write("  <link rel=\"stylesheet\" href=\"resources/plugins/iCheck/flat/blue.css\">\n");
      out.write("  <!-- Morris chart -->\n");
      out.write("  <link rel=\"stylesheet\" href=\"resources/plugins/morris/morris.css\">\n");
      out.write("  <!-- jvectormap -->\n");
      out.write("  <link rel=\"stylesheet\" href=\"resources/plugins/jvectormap/jquery-jvectormap-1.2.2.css\">\n");
      out.write("  <!-- Date Picker -->\n");
      out.write("  <link rel=\"stylesheet\" href=\"resources/plugins/datepicker/datepicker3.css\">\n");
      out.write("  <!-- Daterange picker -->\n");
      out.write("  <link rel=\"stylesheet\" href=\"resources/plugins/daterangepicker/daterangepicker.css\">\n");
      out.write("  <!-- bootstrap wysihtml5 - text editor -->\n");
      out.write("  <link rel=\"stylesheet\" href=\"resources/plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.min.css\">\n");
      out.write("\n");
      out.write("  <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->\n");
      out.write("  <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\n");
      out.write("  <!--[if lt IE 9]>\n");
      out.write("  <script src=\"https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js\"></script>\n");
      out.write("  <script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>\n");
      out.write("  <![endif]-->");
      out.write("\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body class=\"hold-transition skin-green-light sidebar-mini\">\n");
      out.write("        <div class=\"wrapper\">\n");
      out.write("\n");
      out.write("            ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<header class=\"main-header\">\n");
      out.write("    <!-- Logo -->\n");
      out.write("    <a href=\"index2.html\" class=\"logo\">\n");
      out.write("        <!-- mini logo for sidebar mini 50x50 pixels -->\n");
      out.write("        <span class=\"logo-mini\"><b>A</b>LT</span>\n");
      out.write("        <!-- logo for regular state and mobile devices -->\n");
      out.write("        <span class=\"logo-lg\"><b>HKQ</b>Lance</span>\n");
      out.write("    </a>\n");
      out.write("    <!-- Header Navbar: style can be found in header.less -->\n");
      out.write("    <nav class=\"navbar navbar-static-top\">\n");
      out.write("        <!-- Sidebar toggle button-->\n");
      out.write("        <!--        <a href=\"#\" class=\"sidebar-toggle\" data-toggle=\"offcanvas\" role=\"button\">\n");
      out.write("                    <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                </a>-->\n");
      out.write("        <div class=\"navbar-left\">\n");
      out.write("            <ul class=\"nav navbar-nav\">\n");
      out.write("                <li class=\"\">\n");
      out.write("                    <a href=\"hireFrelancer.jsp\" class=\" center text-white\" > Hire Freelancers</a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"#\" class=\" center text-white\" > Freelance Jobs</a>\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"navbar-custom-menu\">\n");
      out.write("            <ul class=\"nav navbar-nav\">\n");
      out.write("                <!-- Messages: style can be found in dropdown.less-->\n");
      out.write("\n");
      out.write("                <!-- Notifications: style can be found in dropdown.less -->\n");
      out.write("                <li class=\"dropdown notifications-menu\">\n");
      out.write("                    <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\n");
      out.write("                        <i class=\"fa fa-bell-o\"></i>\n");
      out.write("                        <span class=\"label label-warning\">10</span>\n");
      out.write("                    </a>\n");
      out.write("                    <ul class=\"dropdown-menu\">\n");
      out.write("                        <li class=\"header\">You have 10 notifications</li>\n");
      out.write("                        <li>\n");
      out.write("                            <!-- inner menu: contains the actual data -->\n");
      out.write("                            <ul class=\"menu\">\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"#\">\n");
      out.write("                                        <i class=\"fa fa-users text-aqua\"></i> 5 new members joined today\n");
      out.write("                                    </a>\n");
      out.write("                                </li>\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"#\">\n");
      out.write("                                        <i class=\"fa fa-warning text-yellow\"></i> Very long description here that may not fit into the\n");
      out.write("                                        page and may cause design problems\n");
      out.write("                                    </a>\n");
      out.write("                                </li>\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"#\">\n");
      out.write("                                        <i class=\"fa fa-users text-red\"></i> 5 new members joined\n");
      out.write("                                    </a>\n");
      out.write("                                </li>\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"#\">\n");
      out.write("                                        <i class=\"fa fa-shopping-cart text-green\"></i> 25 sales made\n");
      out.write("                                    </a>\n");
      out.write("                                </li>\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"#\">\n");
      out.write("                                        <i class=\"fa fa-user text-red\"></i> You changed your username\n");
      out.write("                                    </a>\n");
      out.write("                                </li>\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"footer\"><a href=\"#\">View all</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("                <!-- Tasks: style can be found in dropdown.less -->\n");
      out.write("\n");
      out.write("                <!-- User Account: style can be found in dropdown.less -->\n");
      out.write("                <li class=\"dropdown user user-menu\">\n");
      out.write("                    ");
      if (_jspx_meth_c_choose_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                </li>\n");
      out.write("                <!-- Control Sidebar Toggle Button -->\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"#\" data-toggle=\"control-sidebar\"><i class=\"fa fa-gears\"></i></a>\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("    </nav>\n");
      out.write("</header>\n");
      out.write("\n");
      out.write("            ");
      out.write("\n");
      out.write("\n");
      out.write("<!-- Left side column. contains the logo and sidebar -->\n");
      out.write("<aside class=\"main-sidebar\">\n");
      out.write("    <!-- sidebar: style can be found in sidebar.less -->\n");
      out.write("    <section class=\"sidebar\">\n");
      out.write("        <!-- Sidebar user panel -->\n");
      out.write("        <!-- search form -->\n");
      out.write("        <form action=\"#\" method=\"get\" class=\"sidebar-form\">\n");
      out.write("            <div class=\"input-group\">\n");
      out.write("                <input type=\"text\" name=\"q\" class=\"form-control\" placeholder=\"Search...\">\n");
      out.write("                <span class=\"input-group-btn\">\n");
      out.write("                    <button type=\"submit\" name=\"search\" id=\"search-btn\" class=\"btn btn-flat\"><i class=\"fa fa-search\"></i>\n");
      out.write("                    </button>\n");
      out.write("                </span>\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
      out.write("        <!-- /.search form -->\n");
      out.write("\n");
      out.write("        <!-- sidebar menu: : style can be found in sidebar.less -->\n");
      out.write("        <ul class=\"sidebar-menu\">\n");
      out.write("            <li class=\"header\">CATEGORY</li>\n");
      out.write("            <li class=\" treeview\">\n");
      out.write("                <a href=\"#\">\n");
      out.write("                    <i class=\"fa fa-globe\"></i> <span>Web Applications</span>\n");
      out.write("                    <span class=\"pull-right-container\">\n");
      out.write("                        <i class=\"fa fa-angle-left pull-right\"></i>\n");
      out.write("                    </span>\n");
      out.write("                </a>\n");
      out.write("                <ul class=\"treeview-menu\">\n");
      out.write("                    <li><a href=\"#\"><i class=\"fa fa-circle-o\"></i> Word Press</a></li>\n");
      out.write("                    <li><a href=\"#\"><i class=\"fa fa-circle-o\"></i> PHP</a></li>\n");
      out.write("                    <li><a href=\"#\"><i class=\"fa fa-circle-o\"></i> ASP</a></li>\n");
      out.write("                    <li><a href=\"#\"><i class=\"fa fa-circle-o\"></i> JSP</a></li>\n");
      out.write("                    <li><a href=\"#\"><i class=\"fa fa-circle-o\"></i> Node JS</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </li>\n");
      out.write("            <li class=\" treeview\">\n");
      out.write("                <a href=\"#\">\n");
      out.write("                    <i class=\"fa fa-desktop\"></i> <span>Desktop Applications</span>\n");
      out.write("                    <span class=\"pull-right-container\">\n");
      out.write("                        <i class=\"fa fa-angle-left pull-right\"></i>\n");
      out.write("                    </span>\n");
      out.write("                </a>\n");
      out.write("                <ul class=\"treeview-menu\">\n");
      out.write("                    <li><a href=\"#\"><i class=\"fa fa-circle-o\"></i> Desktop Java Apps</a></li>\n");
      out.write("                    <li><a href=\"#\"><i class=\"fa fa-circle-o\"></i> Desktop C# Apps</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"treeview\">\n");
      out.write("                <a href=\"#\">\n");
      out.write("                    <i class=\"fa fa-mobile\"></i> <span>Mobile Applications</span>\n");
      out.write("                    <span class=\"pull-right-container\">\n");
      out.write("                        <i class=\"fa fa-angle-left pull-right\"></i>\n");
      out.write("                    </span>\n");
      out.write("                </a>\n");
      out.write("                <ul class=\"treeview-menu\">\n");
      out.write("                    <li><a href=\"#\"><i class=\"fa fa-circle-o\"></i> Android Apps</a></li>\n");
      out.write("                    <li><a href=\"#\"><i class=\"fa fa-circle-o\"></i> IOS Apps</a></li>\n");
      out.write("                    <li><a href=\"#\"><i class=\"fa fa-circle-o\"></i> Windows Phone Apps</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </li>\n");
      out.write("        </ul>\n");
      out.write("    </section>\n");
      out.write("    <!-- /.sidebar -->\n");
      out.write("</aside>\n");
      out.write("\n");
      out.write("            \n");
      out.write("            <!-- Content Wrapper. Contains page content -->\n");
      out.write("            <div class=\"content-wrapper\">\n");
      out.write("                <!-- Content Header (Page header) -->\n");
      out.write("                <section class=\"content-header\">\n");
      out.write("                    <h1>\n");
      out.write("                        Dashboard\n");
      out.write("                        <small>Control panel</small>\n");
      out.write("                    </h1>\n");
      out.write("                    <ol class=\"breadcrumb\">\n");
      out.write("                        <li><a href=\"#\"><i class=\"fa fa-dashboard\"></i> Home</a></li>\n");
      out.write("                        <li class=\"active\">Dashboard</li>\n");
      out.write("                    </ol>\n");
      out.write("                </section>\n");
      out.write("\n");
      out.write("                <!-- Main content -->\n");
      out.write("                ");
      out.write("\n");
      out.write("<section class=\"content\">\n");
      out.write("    <div class=\"row\">\n");
      out.write("\n");
      out.write("        <div class=\"col-md-12\">\n");
      out.write("            <div class=\"nav-tabs-custom\">\n");
      out.write("                <ul class=\"nav nav-tabs\">\n");
      out.write("                    <li class=\"active\"><a href=\"#activity\" data-toggle=\"tab\">Activity</a></li>\n");
      out.write("                    <li><a href=\"#timeline\" data-toggle=\"tab\">Timeline</a></li>\n");
      out.write("                    <li><a href=\"#settings\" data-toggle=\"tab\">Settings</a></li>\n");
      out.write("                </ul>\n");
      out.write("                <div class=\"tab-content\">\n");
      out.write("                    <div class=\"active tab-pane\" id=\"activity\">\n");
      out.write("                        <!-- Post -->\n");
      out.write("                        <div class=\"post\">\n");
      out.write("                            <div class=\"user-block\">\n");
      out.write("                                <img class=\"img-circle img-bordered-sm\" src=\"../../dist/img/user1-128x128.jpg\" alt=\"user image\">\n");
      out.write("                                <span class=\"username\">\n");
      out.write("                                    <a href=\"#\">Jonathan Burke Jr.</a>\n");
      out.write("                                    <a href=\"#\" class=\"pull-right btn-box-tool\"><i class=\"fa fa-times\"></i></a>\n");
      out.write("                                </span>\n");
      out.write("                                <span class=\"description\">Shared publicly - 7:30 PM today</span>\n");
      out.write("                            </div>\n");
      out.write("                            <!-- /.user-block -->\n");
      out.write("                            <p>\n");
      out.write("                                Lorem ipsum represents a long-held tradition for designers,\n");
      out.write("                                typographers and the like. Some people hate it and argue for\n");
      out.write("                                its demise, but others ignore the hate as they create awesome\n");
      out.write("                                tools to help create filler text for everyone from bacon lovers\n");
      out.write("                                to Charlie Sheen fans.\n");
      out.write("                            </p>\n");
      out.write("                            <ul class=\"list-inline\">\n");
      out.write("                                <li><a href=\"#\" class=\"link-black text-sm\"><i class=\"fa fa-share margin-r-5\"></i> Share</a></li>\n");
      out.write("                                <li><a href=\"#\" class=\"link-black text-sm\"><i class=\"fa fa-thumbs-o-up margin-r-5\"></i> Like</a>\n");
      out.write("                                </li>\n");
      out.write("                                <li class=\"pull-right\">\n");
      out.write("                                    <a href=\"#\" class=\"link-black text-sm\"><i class=\"fa fa-comments-o margin-r-5\"></i> Comments\n");
      out.write("                                        (5)</a></li>\n");
      out.write("                            </ul>\n");
      out.write("\n");
      out.write("                            <input class=\"form-control input-sm\" type=\"text\" placeholder=\"Type a comment\">\n");
      out.write("                        </div>\n");
      out.write("                        <!-- /.post -->\n");
      out.write("\n");
      out.write("                        <!-- Post -->\n");
      out.write("                        <div class=\"post clearfix\">\n");
      out.write("                            <div class=\"user-block\">\n");
      out.write("                                <img class=\"img-circle img-bordered-sm\" src=\"../../dist/img/user7-128x128.jpg\" alt=\"User Image\">\n");
      out.write("                                <span class=\"username\">\n");
      out.write("                                    <a href=\"#\">Sarah Ross</a>\n");
      out.write("                                    <a href=\"#\" class=\"pull-right btn-box-tool\"><i class=\"fa fa-times\"></i></a>\n");
      out.write("                                </span>\n");
      out.write("                                <span class=\"description\">Sent you a message - 3 days ago</span>\n");
      out.write("                            </div>\n");
      out.write("                            <!-- /.user-block -->\n");
      out.write("                            <p>\n");
      out.write("                                Lorem ipsum represents a long-held tradition for designers,\n");
      out.write("                                typographers and the like. Some people hate it and argue for\n");
      out.write("                                its demise, but others ignore the hate as they create awesome\n");
      out.write("                                tools to help create filler text for everyone from bacon lovers\n");
      out.write("                                to Charlie Sheen fans.\n");
      out.write("                            </p>\n");
      out.write("\n");
      out.write("                            <form class=\"form-horizontal\">\n");
      out.write("                                <div class=\"form-group margin-bottom-none\">\n");
      out.write("                                    <div class=\"col-sm-9\">\n");
      out.write("                                        <input class=\"form-control input-sm\" placeholder=\"Response\">\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-sm-3\">\n");
      out.write("                                        <button type=\"submit\" class=\"btn btn-danger pull-right btn-block btn-sm\">Send</button>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                        <!-- /.post -->\n");
      out.write("\n");
      out.write("                        <!-- Post -->\n");
      out.write("                        <div class=\"post\">\n");
      out.write("                            <div class=\"user-block\">\n");
      out.write("                                <img class=\"img-circle img-bordered-sm\" src=\"../../dist/img/user6-128x128.jpg\" alt=\"User Image\">\n");
      out.write("                                <span class=\"username\">\n");
      out.write("                                    <a href=\"#\">Adam Jones</a>\n");
      out.write("                                    <a href=\"#\" class=\"pull-right btn-box-tool\"><i class=\"fa fa-times\"></i></a>\n");
      out.write("                                </span>\n");
      out.write("                                <span class=\"description\">Posted 5 photos - 5 days ago</span>\n");
      out.write("                            </div>\n");
      out.write("                            <!-- /.user-block -->\n");
      out.write("                            <div class=\"row margin-bottom\">\n");
      out.write("                                <div class=\"col-sm-6\">\n");
      out.write("                                    <img class=\"img-responsive\" src=\"../../dist/img/photo1.png\" alt=\"Photo\">\n");
      out.write("                                </div>\n");
      out.write("                                <!-- /.col -->\n");
      out.write("                                <div class=\"col-sm-6\">\n");
      out.write("                                    <div class=\"row\">\n");
      out.write("                                        <div class=\"col-sm-6\">\n");
      out.write("                                            <img class=\"img-responsive\" src=\"../../dist/img/photo2.png\" alt=\"Photo\">\n");
      out.write("                                            <br>\n");
      out.write("                                            <img class=\"img-responsive\" src=\"../../dist/img/photo3.jpg\" alt=\"Photo\">\n");
      out.write("                                        </div>\n");
      out.write("                                        <!-- /.col -->\n");
      out.write("                                        <div class=\"col-sm-6\">\n");
      out.write("                                            <img class=\"img-responsive\" src=\"../../dist/img/photo4.jpg\" alt=\"Photo\">\n");
      out.write("                                            <br>\n");
      out.write("                                            <img class=\"img-responsive\" src=\"../../dist/img/photo1.png\" alt=\"Photo\">\n");
      out.write("                                        </div>\n");
      out.write("                                        <!-- /.col -->\n");
      out.write("                                    </div>\n");
      out.write("                                    <!-- /.row -->\n");
      out.write("                                </div>\n");
      out.write("                                <!-- /.col -->\n");
      out.write("                            </div>\n");
      out.write("                            <!-- /.row -->\n");
      out.write("\n");
      out.write("                            <ul class=\"list-inline\">\n");
      out.write("                                <li><a href=\"#\" class=\"link-black text-sm\"><i class=\"fa fa-share margin-r-5\"></i> Share</a></li>\n");
      out.write("                                <li><a href=\"#\" class=\"link-black text-sm\"><i class=\"fa fa-thumbs-o-up margin-r-5\"></i> Like</a>\n");
      out.write("                                </li>\n");
      out.write("                                <li class=\"pull-right\">\n");
      out.write("                                    <a href=\"#\" class=\"link-black text-sm\"><i class=\"fa fa-comments-o margin-r-5\"></i> Comments\n");
      out.write("                                        (5)</a></li>\n");
      out.write("                            </ul>\n");
      out.write("\n");
      out.write("                            <input class=\"form-control input-sm\" type=\"text\" placeholder=\"Type a comment\">\n");
      out.write("                        </div>\n");
      out.write("                        <!-- /.post -->\n");
      out.write("                    </div>\n");
      out.write("                    <!-- /.tab-pane -->\n");
      out.write("                    <div class=\"tab-pane\" id=\"timeline\">\n");
      out.write("                        <!-- The timeline -->\n");
      out.write("                        <ul class=\"timeline timeline-inverse\">\n");
      out.write("                            <!-- timeline time label -->\n");
      out.write("                            <li class=\"time-label\">\n");
      out.write("                                <span class=\"bg-red\">\n");
      out.write("                                    10 Feb. 2014\n");
      out.write("                                </span>\n");
      out.write("                            </li>\n");
      out.write("                            <!-- /.timeline-label -->\n");
      out.write("                            <!-- timeline item -->\n");
      out.write("                            <li>\n");
      out.write("                                <i class=\"fa fa-envelope bg-blue\"></i>\n");
      out.write("\n");
      out.write("                                <div class=\"timeline-item\">\n");
      out.write("                                    <span class=\"time\"><i class=\"fa fa-clock-o\"></i> 12:05</span>\n");
      out.write("\n");
      out.write("                                    <h3 class=\"timeline-header\"><a href=\"#\">Support Team</a> sent you an email</h3>\n");
      out.write("\n");
      out.write("                                    <div class=\"timeline-body\">\n");
      out.write("                                        Etsy doostang zoodles disqus groupon greplin oooj voxy zoodles,\n");
      out.write("                                        weebly ning heekya handango imeem plugg dopplr jibjab, movity\n");
      out.write("                                        jajah plickers sifteo edmodo ifttt zimbra. Babblely odeo kaboodle\n");
      out.write("                                        quora plaxo ideeli hulu weebly balihoo...\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"timeline-footer\">\n");
      out.write("                                        <a class=\"btn btn-primary btn-xs\">Read more</a>\n");
      out.write("                                        <a class=\"btn btn-danger btn-xs\">Delete</a>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </li>\n");
      out.write("                            <!-- END timeline item -->\n");
      out.write("                            <!-- timeline item -->\n");
      out.write("                            <li>\n");
      out.write("                                <i class=\"fa fa-user bg-aqua\"></i>\n");
      out.write("\n");
      out.write("                                <div class=\"timeline-item\">\n");
      out.write("                                    <span class=\"time\"><i class=\"fa fa-clock-o\"></i> 5 mins ago</span>\n");
      out.write("\n");
      out.write("                                    <h3 class=\"timeline-header no-border\"><a href=\"#\">Sarah Young</a> accepted your friend request\n");
      out.write("                                    </h3>\n");
      out.write("                                </div>\n");
      out.write("                            </li>\n");
      out.write("                            <!-- END timeline item -->\n");
      out.write("                            <!-- timeline item -->\n");
      out.write("                            <li>\n");
      out.write("                                <i class=\"fa fa-comments bg-yellow\"></i>\n");
      out.write("\n");
      out.write("                                <div class=\"timeline-item\">\n");
      out.write("                                    <span class=\"time\"><i class=\"fa fa-clock-o\"></i> 27 mins ago</span>\n");
      out.write("\n");
      out.write("                                    <h3 class=\"timeline-header\"><a href=\"#\">Jay White</a> commented on your post</h3>\n");
      out.write("\n");
      out.write("                                    <div class=\"timeline-body\">\n");
      out.write("                                        Take me to your leader!\n");
      out.write("                                        Switzerland is small and neutral!\n");
      out.write("                                        We are more like Germany, ambitious and misunderstood!\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"timeline-footer\">\n");
      out.write("                                        <a class=\"btn btn-warning btn-flat btn-xs\">View comment</a>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </li>\n");
      out.write("                            <!-- END timeline item -->\n");
      out.write("                            <!-- timeline time label -->\n");
      out.write("                            <li class=\"time-label\">\n");
      out.write("                                <span class=\"bg-green\">\n");
      out.write("                                    3 Jan. 2014\n");
      out.write("                                </span>\n");
      out.write("                            </li>\n");
      out.write("                            <!-- /.timeline-label -->\n");
      out.write("                            <!-- timeline item -->\n");
      out.write("                            <li>\n");
      out.write("                                <i class=\"fa fa-camera bg-purple\"></i>\n");
      out.write("\n");
      out.write("                                <div class=\"timeline-item\">\n");
      out.write("                                    <span class=\"time\"><i class=\"fa fa-clock-o\"></i> 2 days ago</span>\n");
      out.write("\n");
      out.write("                                    <h3 class=\"timeline-header\"><a href=\"#\">Mina Lee</a> uploaded new photos</h3>\n");
      out.write("\n");
      out.write("                                    <div class=\"timeline-body\">\n");
      out.write("                                        <img src=\"http://placehold.it/150x100\" alt=\"...\" class=\"margin\">\n");
      out.write("                                        <img src=\"http://placehold.it/150x100\" alt=\"...\" class=\"margin\">\n");
      out.write("                                        <img src=\"http://placehold.it/150x100\" alt=\"...\" class=\"margin\">\n");
      out.write("                                        <img src=\"http://placehold.it/150x100\" alt=\"...\" class=\"margin\">\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </li>\n");
      out.write("                            <!-- END timeline item -->\n");
      out.write("                            <li>\n");
      out.write("                                <i class=\"fa fa-clock-o bg-gray\"></i>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- /.tab-pane -->\n");
      out.write("\n");
      out.write("                    <div class=\"tab-pane\" id=\"settings\">\n");
      out.write("                        <form class=\"form-horizontal\">\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"inputName\" class=\"col-sm-2 control-label\">Name</label>\n");
      out.write("\n");
      out.write("                                <div class=\"col-sm-10\">\n");
      out.write("                                    <input type=\"email\" class=\"form-control\" id=\"inputName\" placeholder=\"Name\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"inputEmail\" class=\"col-sm-2 control-label\">Email</label>\n");
      out.write("\n");
      out.write("                                <div class=\"col-sm-10\">\n");
      out.write("                                    <input type=\"email\" class=\"form-control\" id=\"inputEmail\" placeholder=\"Email\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"inputName\" class=\"col-sm-2 control-label\">Name</label>\n");
      out.write("\n");
      out.write("                                <div class=\"col-sm-10\">\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" id=\"inputName\" placeholder=\"Name\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"inputExperience\" class=\"col-sm-2 control-label\">Experience</label>\n");
      out.write("\n");
      out.write("                                <div class=\"col-sm-10\">\n");
      out.write("                                    <textarea class=\"form-control\" id=\"inputExperience\" placeholder=\"Experience\"></textarea>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"inputSkills\" class=\"col-sm-2 control-label\">Skills</label>\n");
      out.write("\n");
      out.write("                                <div class=\"col-sm-10\">\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" id=\"inputSkills\" placeholder=\"Skills\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <div class=\"col-sm-offset-2 col-sm-10\">\n");
      out.write("                                    <div class=\"checkbox\">\n");
      out.write("                                        <label>\n");
      out.write("                                            <input type=\"checkbox\"> I agree to the <a href=\"#\">terms and conditions</a>\n");
      out.write("                                        </label>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <div class=\"col-sm-offset-2 col-sm-10\">\n");
      out.write("                                    <button type=\"submit\" class=\"btn btn-danger\">Submit</button>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- /.tab-pane -->\n");
      out.write("                </div>\n");
      out.write("                <!-- /.tab-content -->\n");
      out.write("            </div>\n");
      out.write("            <!-- /.nav-tabs-custom -->\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("</section>");
      out.write("\n");
      out.write("                <!-- /.content -->\n");
      out.write("            </div>\n");
      out.write("            <!-- /.content-wrapper -->\n");
      out.write("            \n");
      out.write("            ");
      out.write("\n");
      out.write("\n");
      out.write("<footer class=\"main-footer\">\n");
      out.write("    <div class=\"pull-right hidden-xs\">\n");
      out.write("        <b>Version</b> 2.3.7\n");
      out.write("    </div>\n");
      out.write("    <strong>Copyright &copy; 2014-2016 <a href=\"http://almsaeedstudio.com\">Almsaeed Studio</a>.</strong> All rights\n");
      out.write("    reserved.\n");
      out.write("</footer>\n");
      out.write("\n");
      out.write("<!-- Control Sidebar -->\n");
      out.write("<aside class=\"control-sidebar control-sidebar-dark\">\n");
      out.write("    <!-- Create the tabs -->\n");
      out.write("    <ul class=\"nav nav-tabs nav-justified control-sidebar-tabs\">\n");
      out.write("        <li><a href=\"#control-sidebar-home-tab\" data-toggle=\"tab\"><i class=\"fa fa-home\"></i></a></li>\n");
      out.write("        <li><a href=\"#control-sidebar-settings-tab\" data-toggle=\"tab\"><i class=\"fa fa-gears\"></i></a></li>\n");
      out.write("    </ul>\n");
      out.write("    <!-- Tab panes -->\n");
      out.write("    <div class=\"tab-content\">\n");
      out.write("        <!-- Home tab content -->\n");
      out.write("        <div class=\"tab-pane\" id=\"control-sidebar-home-tab\">\n");
      out.write("            <h3 class=\"control-sidebar-heading\">Recent Activity</h3>\n");
      out.write("            <ul class=\"control-sidebar-menu\">\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"javascript:void(0)\">\n");
      out.write("                        <i class=\"menu-icon fa fa-birthday-cake bg-red\"></i>\n");
      out.write("\n");
      out.write("                        <div class=\"menu-info\">\n");
      out.write("                            <h4 class=\"control-sidebar-subheading\">Langdon's Birthday</h4>\n");
      out.write("\n");
      out.write("                            <p>Will be 23 on April 24th</p>\n");
      out.write("                        </div>\n");
      out.write("                    </a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"javascript:void(0)\">\n");
      out.write("                        <i class=\"menu-icon fa fa-user bg-yellow\"></i>\n");
      out.write("\n");
      out.write("                        <div class=\"menu-info\">\n");
      out.write("                            <h4 class=\"control-sidebar-subheading\">Frodo Updated His Profile</h4>\n");
      out.write("\n");
      out.write("                            <p>New phone +1(800)555-1234</p>\n");
      out.write("                        </div>\n");
      out.write("                    </a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"javascript:void(0)\">\n");
      out.write("                        <i class=\"menu-icon fa fa-envelope-o bg-light-blue\"></i>\n");
      out.write("\n");
      out.write("                        <div class=\"menu-info\">\n");
      out.write("                            <h4 class=\"control-sidebar-subheading\">Nora Joined Mailing List</h4>\n");
      out.write("\n");
      out.write("                            <p>nora@example.com</p>\n");
      out.write("                        </div>\n");
      out.write("                    </a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"javascript:void(0)\">\n");
      out.write("                        <i class=\"menu-icon fa fa-file-code-o bg-green\"></i>\n");
      out.write("\n");
      out.write("                        <div class=\"menu-info\">\n");
      out.write("                            <h4 class=\"control-sidebar-subheading\">Cron Job 254 Executed</h4>\n");
      out.write("\n");
      out.write("                            <p>Execution time 5 seconds</p>\n");
      out.write("                        </div>\n");
      out.write("                    </a>\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("            <!-- /.control-sidebar-menu -->\n");
      out.write("\n");
      out.write("            <h3 class=\"control-sidebar-heading\">Tasks Progress</h3>\n");
      out.write("            <ul class=\"control-sidebar-menu\">\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"javascript:void(0)\">\n");
      out.write("                        <h4 class=\"control-sidebar-subheading\">\n");
      out.write("                            Custom Template Design\n");
      out.write("                            <span class=\"label label-danger pull-right\">70%</span>\n");
      out.write("                        </h4>\n");
      out.write("\n");
      out.write("                        <div class=\"progress progress-xxs\">\n");
      out.write("                            <div class=\"progress-bar progress-bar-danger\" style=\"width: 70%\"></div>\n");
      out.write("                        </div>\n");
      out.write("                    </a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"javascript:void(0)\">\n");
      out.write("                        <h4 class=\"control-sidebar-subheading\">\n");
      out.write("                            Update Resume\n");
      out.write("                            <span class=\"label label-success pull-right\">95%</span>\n");
      out.write("                        </h4>\n");
      out.write("\n");
      out.write("                        <div class=\"progress progress-xxs\">\n");
      out.write("                            <div class=\"progress-bar progress-bar-success\" style=\"width: 95%\"></div>\n");
      out.write("                        </div>\n");
      out.write("                    </a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"javascript:void(0)\">\n");
      out.write("                        <h4 class=\"control-sidebar-subheading\">\n");
      out.write("                            Laravel Integration\n");
      out.write("                            <span class=\"label label-warning pull-right\">50%</span>\n");
      out.write("                        </h4>\n");
      out.write("\n");
      out.write("                        <div class=\"progress progress-xxs\">\n");
      out.write("                            <div class=\"progress-bar progress-bar-warning\" style=\"width: 50%\"></div>\n");
      out.write("                        </div>\n");
      out.write("                    </a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"javascript:void(0)\">\n");
      out.write("                        <h4 class=\"control-sidebar-subheading\">\n");
      out.write("                            Back End Framework\n");
      out.write("                            <span class=\"label label-primary pull-right\">68%</span>\n");
      out.write("                        </h4>\n");
      out.write("\n");
      out.write("                        <div class=\"progress progress-xxs\">\n");
      out.write("                            <div class=\"progress-bar progress-bar-primary\" style=\"width: 68%\"></div>\n");
      out.write("                        </div>\n");
      out.write("                    </a>\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("            <!-- /.control-sidebar-menu -->\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <!-- /.tab-pane -->\n");
      out.write("        <!-- Stats tab content -->\n");
      out.write("        <div class=\"tab-pane\" id=\"control-sidebar-stats-tab\">Stats Tab Content</div>\n");
      out.write("        <!-- /.tab-pane -->\n");
      out.write("        <!-- Settings tab content -->\n");
      out.write("        <div class=\"tab-pane\" id=\"control-sidebar-settings-tab\">\n");
      out.write("            <form method=\"post\">\n");
      out.write("                <h3 class=\"control-sidebar-heading\">General Settings</h3>\n");
      out.write("\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label class=\"control-sidebar-subheading\">\n");
      out.write("                        Report panel usage\n");
      out.write("                        <input type=\"checkbox\" class=\"pull-right\" checked>\n");
      out.write("                    </label>\n");
      out.write("\n");
      out.write("                    <p>\n");
      out.write("                        Some information about this general settings option\n");
      out.write("                    </p>\n");
      out.write("                </div>\n");
      out.write("                <!-- /.form-group -->\n");
      out.write("\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label class=\"control-sidebar-subheading\">\n");
      out.write("                        Allow mail redirect\n");
      out.write("                        <input type=\"checkbox\" class=\"pull-right\" checked>\n");
      out.write("                    </label>\n");
      out.write("\n");
      out.write("                    <p>\n");
      out.write("                        Other sets of options are available\n");
      out.write("                    </p>\n");
      out.write("                </div>\n");
      out.write("                <!-- /.form-group -->\n");
      out.write("\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label class=\"control-sidebar-subheading\">\n");
      out.write("                        Expose author name in posts\n");
      out.write("                        <input type=\"checkbox\" class=\"pull-right\" checked>\n");
      out.write("                    </label>\n");
      out.write("\n");
      out.write("                    <p>\n");
      out.write("                        Allow the user to show his name in blog posts\n");
      out.write("                    </p>\n");
      out.write("                </div>\n");
      out.write("                <!-- /.form-group -->\n");
      out.write("\n");
      out.write("                <h3 class=\"control-sidebar-heading\">Chat Settings</h3>\n");
      out.write("\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label class=\"control-sidebar-subheading\">\n");
      out.write("                        Show me as online\n");
      out.write("                        <input type=\"checkbox\" class=\"pull-right\" checked>\n");
      out.write("                    </label>\n");
      out.write("                </div>\n");
      out.write("                <!-- /.form-group -->\n");
      out.write("\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label class=\"control-sidebar-subheading\">\n");
      out.write("                        Turn off notifications\n");
      out.write("                        <input type=\"checkbox\" class=\"pull-right\">\n");
      out.write("                    </label>\n");
      out.write("                </div>\n");
      out.write("                <!-- /.form-group -->\n");
      out.write("\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label class=\"control-sidebar-subheading\">\n");
      out.write("                        Delete chat history\n");
      out.write("                        <a href=\"javascript:void(0)\" class=\"text-red pull-right\"><i class=\"fa fa-trash-o\"></i></a>\n");
      out.write("                    </label>\n");
      out.write("                </div>\n");
      out.write("                <!-- /.form-group -->\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("        <!-- /.tab-pane -->\n");
      out.write("    </div>\n");
      out.write("</aside>");
      out.write("\n");
      out.write("            \n");
      out.write("            <!-- /.control-sidebar -->\n");
      out.write("            <!-- Add the sidebar's background. This div must be placed\n");
      out.write("                 immediately after the control sidebar -->\n");
      out.write("            <div class=\"control-sidebar-bg\"></div>\n");
      out.write("        </div>\n");
      out.write("        <!-- ./wrapper -->\n");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("<!-- jQuery 2.2.3 -->\n");
      out.write("<script src=\"resources/plugins/jQuery/jquery-2.2.3.min.js\"></script>\n");
      out.write("<!-- jQuery UI 1.11.4 -->\n");
      out.write("<script src=\"https://code.jquery.com/ui/1.11.4/jquery-ui.min.js\"></script>\n");
      out.write("<!-- Resolve conflict in jQuery UI tooltip with Bootstrap tooltip -->\n");
      out.write("<script>\n");
      out.write("    $.widget.bridge('uibutton', $.ui.button);\n");
      out.write("</script>\n");
      out.write("<!-- Bootstrap 3.3.6 -->\n");
      out.write("<script src=\"resources/bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("<!-- Morris.js charts -->\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/raphael/2.1.0/raphael-min.js\"></script>\n");
      out.write("<script src=\"resources/plugins/morris/morris.min.js\"></script>\n");
      out.write("<!-- Sparkline -->\n");
      out.write("<script src=\"resources/plugins/sparkline/jquery.sparkline.min.js\"></script>\n");
      out.write("<!-- jvectormap -->\n");
      out.write("<script src=\"resources/plugins/jvectormap/jquery-jvectormap-1.2.2.min.js\"></script>\n");
      out.write("<script src=\"resources/plugins/jvectormap/jquery-jvectormap-world-mill-en.js\"></script>\n");
      out.write("<!-- jQuery Knob Chart -->\n");
      out.write("<script src=\"resources/plugins/knob/jquery.knob.js\"></script>\n");
      out.write("<!-- daterangepicker -->\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/moment.js/2.11.2/moment.min.js\"></script>\n");
      out.write("<script src=\"resources/plugins/daterangepicker/daterangepicker.js\"></script>\n");
      out.write("<!-- datepicker -->\n");
      out.write("<script src=\"resources/plugins/datepicker/bootstrap-datepicker.js\"></script>\n");
      out.write("<!-- Bootstrap WYSIHTML5 -->\n");
      out.write("<script src=\"resources/plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.all.min.js\"></script>\n");
      out.write("<!-- Slimscroll -->\n");
      out.write("<script src=\"resources/plugins/slimScroll/jquery.slimscroll.min.js\"></script>\n");
      out.write("<!-- FastClick -->\n");
      out.write("<script src=\"resources/plugins/fastclick/fastclick.js\"></script>\n");
      out.write("<!-- AdminLTE App -->\n");
      out.write("<script src=\"resources/dist/js/app.min.js\"></script>\n");
      out.write("<!-- AdminLTE dashboard demo (This is only for demo purposes) -->\n");
      out.write("<script src=\"resources/dist/js/pages/dashboard.js\"></script>\n");
      out.write("<!-- AdminLTE for demo purposes -->\n");
      out.write("<script src=\"resources/dist/js/demo.js\"></script>");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_choose_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_0.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_0.setParent(null);
    int _jspx_eval_c_choose_0 = _jspx_th_c_choose_0.doStartTag();
    if (_jspx_eval_c_choose_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                        ");
        if (_jspx_meth_c_when_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                        ");
        if (_jspx_meth_c_otherwise_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                    ");
        int evalDoAfterBody = _jspx_th_c_choose_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
      return true;
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
    return false;
  }

  private boolean _jspx_meth_c_when_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_0.setPageContext(_jspx_page_context);
    _jspx_th_c_when_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.user == null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_0 = _jspx_th_c_when_0.doStartTag();
    if (_jspx_eval_c_when_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                            <a href=\"login.jsp\" class=\"dropdown-toggle\">\n");
        out.write("                                <span class=\"hidden-xs\">Login</span>\n");
        out.write("                            </a>\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_c_when_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_0.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    int _jspx_eval_c_otherwise_0 = _jspx_th_c_otherwise_0.doStartTag();
    if (_jspx_eval_c_otherwise_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                            ");
        if (_jspx_meth_sql_query_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_otherwise_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                            ");
        if (_jspx_meth_c_if_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_otherwise_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                            <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\n");
        out.write("                                <img src=\"resources/dist/img/default-user.png\" class=\"user-image\" alt=\"User Image\">\n");
        out.write("                                <span class=\"hidden-xs\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row[\"0\"].Name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</span>\n");
        out.write("                            </a>\n");
        out.write("                            <ul class=\"dropdown-menu\">\n");
        out.write("                                <!-- User image -->\n");
        out.write("                                <li class=\"user-header\">\n");
        out.write("                                    <img src=\"resources/dist/img/default-user.png\" class=\"img-circle\" alt=\"User Image\">\n");
        out.write("\n");
        out.write("                                    <p>\n");
        out.write("                                        ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row[\"0\"].Name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\n");
        out.write("                                        <small>Member since Nov. 2012</small>\n");
        out.write("                                    </p>\n");
        out.write("                                </li>\n");
        out.write("                                <!-- Menu Body -->\n");
        out.write("                                <li class=\"user-body\">\n");
        out.write("                                    <div class=\"row\">\n");
        out.write("                                        <div class=\"col-xs-4 text-center\">\n");
        out.write("                                            <a href=\"#\">Followers</a>\n");
        out.write("                                        </div>\n");
        out.write("                                        <div class=\"col-xs-4 text-center\">\n");
        out.write("                                            <a href=\"#\">Sales</a>\n");
        out.write("                                        </div>\n");
        out.write("                                        <div class=\"col-xs-4 text-center\">\n");
        out.write("                                            <a href=\"#\">Friends</a>\n");
        out.write("                                        </div>\n");
        out.write("                                    </div>\n");
        out.write("                                    <!-- /.row -->\n");
        out.write("                                </li>\n");
        out.write("                                <!-- Menu Footer-->\n");
        out.write("                                <li class=\"user-footer\">\n");
        out.write("                                    <div class=\"pull-left\">\n");
        out.write("                                        <a href=\"#\" class=\"btn btn-default btn-flat\">Profile</a>\n");
        out.write("                                    </div>\n");
        out.write("                                    <div class=\"pull-right\">\n");
        out.write("                                        <a href=\"Logout\" class=\"btn btn-default btn-flat\">Sign out</a>\n");
        out.write("                                    </div>\n");
        out.write("                                </li>\n");
        out.write("                            </ul>\n");
        out.write("\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_c_otherwise_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_0);
      return true;
    }
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_0);
    return false;
  }

  private boolean _jspx_meth_sql_query_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_otherwise_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:query
    org.apache.taglibs.standard.tag.rt.sql.QueryTag _jspx_th_sql_query_0 = (org.apache.taglibs.standard.tag.rt.sql.QueryTag) _jspx_tagPool_sql_query_var_dataSource.get(org.apache.taglibs.standard.tag.rt.sql.QueryTag.class);
    _jspx_th_sql_query_0.setPageContext(_jspx_page_context);
    _jspx_th_sql_query_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_otherwise_0);
    _jspx_th_sql_query_0.setDataSource(new String("jdbc/PRJ321_Project"));
    _jspx_th_sql_query_0.setVar("rs");
    int[] _jspx_push_body_count_sql_query_0 = new int[] { 0 };
    try {
      int _jspx_eval_sql_query_0 = _jspx_th_sql_query_0.doStartTag();
      if (_jspx_eval_sql_query_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_sql_query_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_push_body_count_sql_query_0[0]++;
          _jspx_th_sql_query_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_sql_query_0.doInitBody();
        }
        do {
          out.write("\n");
          out.write("                                SELECT * FROM Users WHERE Username = '");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.user}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("';\n");
          out.write("                            ");
          int evalDoAfterBody = _jspx_th_sql_query_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_sql_query_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
          _jspx_push_body_count_sql_query_0[0]--;
      }
      if (_jspx_th_sql_query_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_sql_query_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_sql_query_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_sql_query_0.doFinally();
      _jspx_tagPool_sql_query_var_dataSource.reuse(_jspx_th_sql_query_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_otherwise_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_otherwise_0);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rs.rowCount != 0}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                ");
        if (_jspx_meth_c_set_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_set_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_0.setPageContext(_jspx_page_context);
    _jspx_th_c_set_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_set_0.setVar("row");
    _jspx_th_c_set_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rs.rows}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
    if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
    return false;
  }
}
