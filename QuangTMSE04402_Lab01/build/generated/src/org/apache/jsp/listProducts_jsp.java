package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import JDBC.DBContext;

public final class listProducts_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(5);
    _jspx_dependants.add("/included/headerScript.jsp");
    _jspx_dependants.add("/included/header.jsp");
    _jspx_dependants.add("/included/listProductContent.jsp");
    _jspx_dependants.add("/included/footer.jsp");
    _jspx_dependants.add("/included/footerScript.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Product Management</title>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("\n");
      out.write("<!-- Tell the browser to be responsive to screen width -->\n");
      out.write("<meta content=\"width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no\" name=\"viewport\">\n");
      out.write("<!-- Bootstrap 3.3.6 -->\n");
      out.write("<link rel=\"stylesheet\" href=\"resources/bootstrap/css/bootstrap.min.css\">\n");
      out.write("<!-- Font Awesome -->\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.5.0/css/font-awesome.min.css\">\n");
      out.write("<!-- Ionicons -->\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/ionicons/2.0.1/css/ionicons.min.css\">\n");
      out.write("<!-- jvectormap -->\n");
      out.write("<link rel=\"stylesheet\" href=\"resources/plugins/jvectormap/jquery-jvectormap-1.2.2.css\">\n");
      out.write("<!-- Theme style -->\n");
      out.write("<link rel=\"stylesheet\" href=\"resources/dist/css/AdminLTE.min.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"resources/dist/css/pagination.css\">\n");
      out.write("<!-- AdminLTE Skins. Choose a skin from the css/skins\n");
      out.write("     folder instead of downloading all of them to reduce the load. -->\n");
      out.write("<link rel=\"stylesheet\" href=\"resources/dist/css/skins/_all-skins.min.css\">\n");
      out.write("\n");
      out.write("<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->\n");
      out.write("<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\n");
      out.write("<!--[if lt IE 9]>\n");
      out.write("<script src=\"https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js\"></script>\n");
      out.write("<script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>\n");
      out.write("<![endif]-->\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body class=\"hold-transition skin-blue sidebar-mini\" onload=\"initializeSliderButtons()\">\n");
      out.write("        <div class=\"wrapper\">\n");
      out.write("\n");
      out.write("            <!--Header -->\n");
      out.write("            ");
      out.write("\n");
      out.write("\n");
      out.write("<header class=\"main-header\">\n");
      out.write("\n");
      out.write("    <!-- Logo -->\n");
      out.write("    <a href=\"#\" class=\"logo\">\n");
      out.write("        <!-- mini logo for sidebar mini 50x50 pixels -->\n");
      out.write("        <span class=\"logo-mini\"><b>A</b>LT</span>\n");
      out.write("        <!-- logo for regular state and mobile devices -->\n");
      out.write("        <span class=\"logo-lg\"><b>Post</b>Dashboard</span>\n");
      out.write("    </a>\n");
      out.write("\n");
      out.write("    <!-- Header Navbar: style can be found in header.less -->\n");
      out.write("    <nav class=\"navbar navbar-static-top\">\n");
      out.write("        <!-- Sidebar toggle button-->\n");
      out.write("        <a href=\"#\" class=\"sidebar-toggle\" data-toggle=\"offcanvas\" role=\"button\">\n");
      out.write("            <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("        </a>\n");
      out.write("        <!-- Navbar Right Menu -->\n");
      out.write("        <div class=\"navbar-custom-menu\">\n");
      out.write("            <ul class=\"nav navbar-nav\">\n");
      out.write("                <!-- Messages: style can be found in dropdown.less-->\n");
      out.write("\n");
      out.write("                <!-- User Account: style can be found in dropdown.less -->\n");
      out.write("                <li class=\"dropdown user user-menu\">\n");
      out.write("                    <a href=\"#\" class=\"dropdown-toggle\">\n");
      out.write("                        Login\n");
      out.write("                    </a>\n");
      out.write("\n");
      out.write("                </li>\n");
      out.write("                <li><a href=\"#\" data-toggle=\"control-sidebar\"><i class=\"fa fa-gears\"></i></a></li>\n");
      out.write("                <!-- Control Sidebar Toggle Button -->\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </nav>\n");
      out.write("</header>\n");
      out.write("\n");
      out.write("<!-- Left side column. contains the logo and sidebar -->\n");
      out.write("<aside class=\"main-sidebar\">\n");
      out.write("    <!-- sidebar: style can be found in sidebar.less -->\n");
      out.write("    <section class=\"sidebar\">\n");
      out.write("        <!-- Sidebar user panel -->\n");
      out.write("        <div class=\"user-panel\">\n");
      out.write("            <div class=\"pull-left image\">\n");
      out.write("                <img src=\"resources/dist/img/manager-512.png\" class=\"img-circle\" alt=\"User Image\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"pull-left info\">\n");
      out.write("                <p><a href=\"#\">Become a member?</a></p>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- search form -->\n");
      out.write("\n");
      out.write("        <!-- /.search form -->\n");
      out.write("        <!-- sidebar menu: : style can be found in sidebar.less -->\n");
      out.write("        <ul class=\"sidebar-menu\">\n");
      out.write("            <li class=\"active treeview\">\n");
      out.write("                <a href=\"#\">\n");
      out.write("                    <i class=\"fa fa-dashboard\"></i> <span> Category Management</span>\n");
      out.write("                    <span class=\"pull-right-container\">\n");
      out.write("                        <i class=\"fa fa-angle-left pull-right\"></i>\n");
      out.write("                    </span>\n");
      out.write("                </a>\n");
      out.write("                <ul class=\"treeview-menu\">\n");
      out.write("                    <li><a href=\"listCategory.jsp\"><i class=\"fa fa-circle-o\"></i> View Categories</a></li>\n");
      out.write("                    <li><a href=\"addCategory.jsp\"><i class=\"fa fa-circle-o\"></i> Add new Category</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </li>\n");
      out.write("            <li class=\" treeview\">\n");
      out.write("                <a href=\"#\">\n");
      out.write("                    <i class=\"fa fa-dashboard\"></i> <span> Product Management</span>\n");
      out.write("                    <span class=\"pull-right-container\">\n");
      out.write("                        <i class=\"fa fa-angle-left pull-right\"></i>\n");
      out.write("                    </span>\n");
      out.write("                </a>\n");
      out.write("                <ul class=\"treeview-menu\">\n");
      out.write("                    <li><a href=\"listProducts.jsp\"><i class=\"fa fa-circle-o\"></i> View Products</a></li>\n");
      out.write("                    <li><a href=\"addNewProduct.jsp\"><i class=\"fa fa-circle-o\"></i> Add new Product</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </li>\n");
      out.write("        </ul>\n");
      out.write("    </section>\n");
      out.write("    <!-- /.sidebar -->\n");
      out.write("</aside>");
      out.write("\n");
      out.write("\n");
      out.write("            <!-- Content Wrapper. Contains page content -->\n");
      out.write("            <div class=\"content-wrapper\">\n");
      out.write("                <!-- Content Header (Page header) -->\n");
      out.write("                <section class=\"content-header\">\n");
      out.write("                    <h1>\n");
      out.write("                        Product Management\n");
      out.write("                        <small></small>\n");
      out.write("                    </h1>\n");
      out.write("                    <ol class=\"breadcrumb\">\n");
      out.write("                        <li><a href=\"#\"><i class=\"fa fa-dashboard\"></i> Product</a></li>\n");
      out.write("                        <li class=\"active\"> List Products</li>\n");
      out.write("                    </ol>\n");
      out.write("\n");
      out.write("                    <!--Content -->\n");
      out.write("                    <section class=\"content\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-md-12\">\n");
      out.write("                                <div class=\"nav-tabs-custom\">\n");
      out.write("                                    <div class=\"tab-content\">\n");
      out.write("                                        <div class=\"box-header\">\n");
      out.write("                                            <h3 class=\"box-title\">List Products</h3>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"box-body\">\n");
      out.write("                                            <!-- Posts -->\n");
      out.write("                                            ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

    String cate_id = (String) request.getAttribute("category_id");

      out.write("\n");
      out.write("<div class=\"row\">\n");
      out.write("    <div class=\"col-md-6\">\n");
      out.write("        <form action=\"ProductFilter\" method=\"POST\" class=\"form-horizontal\">\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <div class=\"col-md-offset-1 col-md-6\">\n");
      out.write("                    <label for=\"category\">Name </label>\n");
      out.write("                    <select name=\"category_id\" id=\"category\" class=\"form-control select2 select2-hidden-accessible\" style=\"width: 100%;\">\n");
      out.write("                        ");

                            String selected = cate_id == null ? "selected" : "";
                            out.println("<option value='all' " + selected + " >All</option>");
                            DBContext db = new DBContext();
                            String query = "SELECT * FROM Pro_Categories";
                            try {
                                ResultSet rs1 = db.executeQuery(query);
                                while (rs1.next()) {
                                    selected = cate_id.equals(rs1.getInt(1) + "") ? "selected" : "";
                                    out.println("<option " + selected + " value='" + rs1.getInt(1) + "'>" + rs1.getString(2) + "</option>");
                                }
                        
      out.write("\n");
      out.write("                    </select>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <div class=\"col-md-offset-1 col-md-10\">\n");
      out.write("                    <button class=\"btn btn-github\" type=\"submit\">Filter</button>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("<p></p>\n");
      out.write("<div class=\"row\">\n");
      out.write("    <div class=\"col-md-10\">\n");
      out.write("        ");

            String category = "All";
            if (cate_id != null && !cate_id.equals("all")) {
                ResultSet r = db.executeQuery("Select * from Pro_Categories where Category_ID = '" + cate_id + "'");
                r.next();
                category = r.getString("Name");
                r.close();
            }
        
      out.write("\n");
      out.write("        <h3>Product List in [");
      out.print(category);
      out.write("] category</h3>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("<div class=\"row\">\n");
      out.write("    <div class=\"col-sm-12\">\n");
      out.write("        <table class=\"table table-bordered table-striped dataTable\" role=\"grid\" aria-describedby=\"example1_info\" >\n");
      out.write("            <tr><th bgcolor=\"grey\">ID</th>\n");
      out.write("                <th bgcolor=\"grey\">Title</th>\n");
      out.write("                <th bgcolor=\"grey\">Action</th>\n");
      out.write("            </tr>\n");
      out.write("            ");

                String sql = "";
                if (cate_id == null || cate_id.equals("all")) {
                    sql = "SELECT * FROM Pro_Details";
                } else {
                    sql = "SELECT * FROM Pro_Details WHERE Category_ID = '" + cate_id + "'";
                }
                ResultSet rs = db.executeQuery(sql);
                while (rs.next()) {
            
      out.write("\n");
      out.write("            <tr><td>");
      out.print(rs.getInt(1));
      out.write("</td>\n");
      out.write("                <td>");
      out.print(rs.getString(3));
      out.write("</td>\n");
      out.write("                <td>\n");
      out.write("                    <a href=\"deleteProduct.jsp?id=");
      out.print(rs.getInt(1));
      out.write("&name=");
      out.print(rs.getString(3));
      out.write("\">Delete</a> | \n");
      out.write("                    <a href=\"editProduct.jsp?id=");
      out.print(rs.getInt(1));
      out.write("\">Edit</a>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            ");

                    }
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    db.close();
                }
            
      out.write("\n");
      out.write("\n");
      out.write("        </table>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("<div class=\"row\">\n");
      out.write("    <div class=\"col-md-6\">\n");
      out.write("        <div class=\"form-horizontal\">\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <div class=\"col-md-offset-1 col-md-10\">\n");
      out.write("                    <a class=\"btn btn-github\" href=\"addNewProduct.jsp\">Add Products</a>\n");
      out.write("                    <a class=\"btn btn-github\" href=\"listCategory.jsp\">Category list</a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("                                            <!-- /.posts -->\n");
      out.write("\n");
      out.write("                                            <!-- /.tab-pane -->\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <!-- /.tab-content -->\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </section>\n");
      out.write("\n");
      out.write("                </section>\n");
      out.write("\n");
      out.write("                <!-- Main content -->\n");
      out.write("\n");
      out.write("\n");
      out.write("                <!-- /.content -->\n");
      out.write("            </div>\n");
      out.write("            <!-- /.content-wrapper -->\n");
      out.write("\n");
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
      out.write("\n");
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
      out.write("</aside>\n");
      out.write("<!-- /.control-sidebar -->\n");
      out.write("<!-- Add the sidebar's background. This div must be placed\n");
      out.write("     immediately after the control sidebar -->\n");
      out.write("<div class=\"control-sidebar-bg\"></div>");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- ./wrapper -->\n");
      out.write("\n");
      out.write("<!-- jQuery 2.2.3 -->\n");
      out.write("<script src=\"resources/plugins/jQuery/jquery-2.2.3.min.js\"></script>\n");
      out.write("<!-- Bootstrap 3.3.6 -->\n");
      out.write("<script src=\"resources/bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("<!-- FastClick -->\n");
      out.write("<script src=\"resources/plugins/fastclick/fastclick.js\"></script>\n");
      out.write("<!-- AdminLTE App -->\n");
      out.write("<script src=\"resources/dist/js/app.min.js\"></script>\n");
      out.write("<!-- Sparkline -->\n");
      out.write("<script src=\"resources/plugins/sparkline/jquery.sparkline.min.js\"></script>\n");
      out.write("<!-- jvectormap -->\n");
      out.write("<script src=\"resources/plugins/jvectormap/jquery-jvectormap-1.2.2.min.js\"></script>\n");
      out.write("<script src=\"resources/plugins/jvectormap/jquery-jvectormap-world-mill-en.js\"></script>\n");
      out.write("<!-- SlimScroll 1.3.0 -->\n");
      out.write("<script src=\"resources/plugins/slimScroll/jquery.slimscroll.min.js\"></script>\n");
      out.write("<!-- ChartJS 1.0.1 -->\n");
      out.write("<script src=\"resources/plugins/chartjs/Chart.min.js\"></script>\n");
      out.write("<!-- AdminLTE dashboard demo (This is only for demo purposes) -->\n");
      out.write("<script src=\"resources/dist/js/pages/dashboard2.js\"></script>\n");
      out.write("<!-- AdminLTE for demo purposes -->\n");
      out.write("<script src=\"resources/dist/js/demo.js\"></script>\n");
      out.write("<!-- Pagination button -->\n");
      out.write("<script src=\"resources/dist/js/main.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("        ");
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
}
