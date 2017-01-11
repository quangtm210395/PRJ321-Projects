package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class posts_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(4);
    _jspx_dependants.add("/included/headerScript.jsp");
    _jspx_dependants.add("/included/postContent.jsp");
    _jspx_dependants.add("/included/footer.jsp");
    _jspx_dependants.add("/included/footerScript.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_scope_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_catch_var;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_fmt_parseNumber_var_value_integerOnly_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sql_query_var_dataSource;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_redirect_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_set_var_value_scope_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_catch_var = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_fmt_parseNumber_var_value_integerOnly_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_sql_query_var_dataSource = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_redirect_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_set_var_value_nobody.release();
    _jspx_tagPool_c_set_var_value_scope_nobody.release();
    _jspx_tagPool_c_catch_var.release();
    _jspx_tagPool_fmt_parseNumber_var_value_integerOnly_nobody.release();
    _jspx_tagPool_c_if_test.release();
    _jspx_tagPool_sql_query_var_dataSource.release();
    _jspx_tagPool_c_redirect_nobody.release();
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

    Object user = session.getAttribute("username");
    if (user != null) {
        response.sendRedirect("index.jsp");
    }

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Dashboard</title>\n");
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
      out.write("            <header class=\"main-header\">\n");
      out.write("\n");
      out.write("                <!-- Logo -->\n");
      out.write("                <a href=\"index2.html\" class=\"logo\">\n");
      out.write("                    <!-- mini logo for sidebar mini 50x50 pixels -->\n");
      out.write("                    <span class=\"logo-mini\"><b>A</b>LT</span>\n");
      out.write("                    <!-- logo for regular state and mobile devices -->\n");
      out.write("                    <span class=\"logo-lg\"><b>Post</b>Dashboard</span>\n");
      out.write("                </a>\n");
      out.write("\n");
      out.write("                <!-- Header Navbar: style can be found in header.less -->\n");
      out.write("                <nav class=\"navbar navbar-static-top\">\n");
      out.write("                    <!-- Sidebar toggle button-->\n");
      out.write("                    <!-- Navbar Right Menu -->\n");
      out.write("                    <div class=\"navbar-custom-menu\">\n");
      out.write("                        <ul class=\"nav navbar-nav\">\n");
      out.write("                            <!-- Messages: style can be found in dropdown.less-->\n");
      out.write("\n");
      out.write("                            <!-- User Account: style can be found in dropdown.less -->\n");
      out.write("                            <li class=\"dropdown user user-menu\">\n");
      out.write("                                <a href=\"login.jsp\" class=\"dropdown-toggle\">\n");
      out.write("                                    Login\n");
      out.write("                                </a>\n");
      out.write("\n");
      out.write("                            </li>\n");
      out.write("                            <li><a href=\"#\" data-toggle=\"control-sidebar\"><i class=\"fa fa-gears\"></i></a></li>\n");
      out.write("                            <!-- Control Sidebar Toggle Button -->\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </nav>\n");
      out.write("            </header>\n");
      out.write("            \n");
      out.write("            <!-- Left side column. contains the logo and sidebar -->\n");
      out.write("            <aside class=\"main-sidebar\">\n");
      out.write("                <!-- sidebar: style can be found in sidebar.less -->\n");
      out.write("                <section class=\"sidebar\">\n");
      out.write("                    <!-- Sidebar user panel -->\n");
      out.write("                    <div class=\"user-panel\">\n");
      out.write("                        <div class=\"pull-left image\">\n");
      out.write("                            <img src=\"resources/dist/img/manager-512.png\" class=\"img-circle\" alt=\"User Image\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"pull-left info\">\n");
      out.write("                            <p><a href=\"register.jsp\">Become a member?</a></p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- search form -->\n");
      out.write("\n");
      out.write("                    <!-- /.search form -->\n");
      out.write("                    <!-- sidebar menu: : style can be found in sidebar.less -->\n");
      out.write("                    <ul class=\"sidebar-menu\">\n");
      out.write("                        <li class=\"active treeview\">\n");
      out.write("                            <a href=\"#\">\n");
      out.write("                                <i class=\"fa fa-dashboard\"></i> <span>Dashboard</span>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("\n");
      out.write("                    </ul>\n");
      out.write("                </section>\n");
      out.write("                <!-- /.sidebar -->\n");
      out.write("            </aside>\n");
      out.write("\n");
      out.write("            <!-- Content Wrapper. Contains page content -->\n");
      out.write("            <div class=\"content-wrapper\">\n");
      out.write("                <!-- Content Header (Page header) -->\n");
      out.write("                <section class=\"content-header\">\n");
      out.write("                    <h1>\n");
      out.write("                        Posts\n");
      out.write("                        <small></small>\n");
      out.write("                    </h1>\n");
      out.write("                    <ol class=\"breadcrumb\">\n");
      out.write("                        <li><a href=\"#\"><i class=\"fa fa-dashboard\"></i> Home</a></li>\n");
      out.write("                        <li class=\"active\">Posts</li>\n");
      out.write("                    </ol>\n");
      out.write("\n");
      out.write("                    <!--Content -->\n");
      out.write("                    <section class=\"content\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"nav-tabs-custom\">\n");
      out.write("                                    <ul class=\"nav nav-tabs\">\n");
      out.write("                                        <li class=\"active\"><a href=\"#activity\" data-toggle=\"tab\">Posts</a></li>\n");
      out.write("                                    </ul>\n");
      out.write("                                    <div class=\"tab-content\">\n");
      out.write("                                        <div class=\"active tab-pane\" id=\"activity\">\n");
      out.write("                                            <!-- Posts -->\n");
      out.write("                                            ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      //  c:catch
      org.apache.taglibs.standard.tag.common.core.CatchTag _jspx_th_c_catch_0 = (org.apache.taglibs.standard.tag.common.core.CatchTag) _jspx_tagPool_c_catch_var.get(org.apache.taglibs.standard.tag.common.core.CatchTag.class);
      _jspx_th_c_catch_0.setPageContext(_jspx_page_context);
      _jspx_th_c_catch_0.setParent(null);
      _jspx_th_c_catch_0.setVar("exception");
      int[] _jspx_push_body_count_c_catch_0 = new int[] { 0 };
      try {
        int _jspx_eval_c_catch_0 = _jspx_th_c_catch_0.doStartTag();
        if (_jspx_eval_c_catch_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\n");
            out.write("    ");

        String p = (String) request.getAttribute("pagi");
        int pageNum = p != null ? Integer.parseInt(p) - 1 : 0;
        request.setAttribute("pagi", pageNum);
        request.setAttribute("min", pageNum * 5);
        request.setAttribute("max", (pageNum + 1) * 5);
    
            out.write("\n");
            out.write("\n");
            out.write("    ");
            if (_jspx_meth_c_if_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_catch_0, _jspx_page_context, _jspx_push_body_count_c_catch_0))
              return;
            out.write("\n");
            out.write("\n");
            out.write("    ");
            if (_jspx_meth_c_set_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_catch_0, _jspx_page_context, _jspx_push_body_count_c_catch_0))
              return;
            out.write("\n");
            out.write("    ");
            if (_jspx_meth_sql_query_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_catch_0, _jspx_page_context, _jspx_push_body_count_c_catch_0))
              return;
            out.write("\n");
            out.write("\n");
            out.write("    ");
            if (_jspx_meth_c_set_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_catch_0, _jspx_page_context, _jspx_push_body_count_c_catch_0))
              return;
            out.write("\n");
            out.write("    ");

        int pageCount = (Integer) request.getAttribute("pageCount") / 5 + 1;
    
            out.write("\n");
            out.write("    ");
            if (_jspx_meth_c_if_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_catch_0, _jspx_page_context, _jspx_push_body_count_c_catch_0))
              return;
            out.write("\n");
            out.write("\n");
            out.write("    ");
            if (_jspx_meth_c_forEach_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_catch_0, _jspx_page_context, _jspx_push_body_count_c_catch_0))
              return;
            out.write("\n");
            out.write("\n");
            out.write("    <div class=\"box-footer\">\n");
            out.write("        <ul class=\"pagination no-margin pull-right\" id=\"pagination-buttons\">\n");
            out.write("            <li class=\"");
            out.print((pageNum > 1) ? "" : "disable");
            out.write("\"><a href=\"?pagi=");
            out.print(pageNum > 0 ? pageNum : (pageNum + 1));
            out.write("\"><</a></li>\n");
            out.write("            <li class=\"active\"><a href=\"?pagi=1\">1</a></li>\n");
            out.write("\n");
            out.write("            ");

                for (int i = 2; i <= pageCount; i++) {
            
            out.write("\n");
            out.write("            <li><a href=\"?pagi=");
            out.print(i);
            out.write('"');
            out.write('>');
            out.print(i);
            out.write("</a></li>\n");
            out.write("                ");

                    }
                
            out.write("\n");
            out.write("\n");
            out.write("            <li class=\"");
            out.print((pageNum < (pageCount - 1)) ? "" : "disable");
            out.write("\"><a href=\"?pagi=");
            out.print(pageNum < (pageCount - 1) ? (pageNum + 2) : (pageNum + 1));
            out.write("\">></a></li>\n");
            out.write("        </ul>\n");
            out.write("    </div>\n");
            out.write("\n");
            int evalDoAfterBody = _jspx_th_c_catch_0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_catch_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_catch_0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_catch_0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_catch_0.doFinally();
        _jspx_tagPool_c_catch_var.reuse(_jspx_th_c_catch_0);
      }
      out.write("\n");
      out.write("<p>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${exception}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>");
      out.write("\n");
      out.write("                                            <!-- /.posts -->\n");
      out.write("                                        </div>\n");
      out.write("                                        <!-- /.tab-pane -->\n");
      out.write("\n");
      out.write("\n");
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
      out.write("<script src='resources/plugins/tinymce/tinymce.min.js'></script>\n");
      out.write("<!--<script src='http://cdn.tinymce.com/4/tinymce.min.js'></script>-->\n");
      out.write("<!-- DataTables -->\n");
      out.write("<script src=\"resources/plugins/datatables/jquery.dataTables.min.js\"></script>\n");
      out.write("<script src=\"resources/plugins/datatables/dataTables.bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("    tinymce.init({\n");
      out.write("        selector: 'textarea',\n");
      out.write("        height: 400,\n");
      out.write("        theme: 'modern',\n");
      out.write("        plugins: [\n");
      out.write("            'advlist autolink lists link image charmap print preview hr anchor pagebreak',\n");
      out.write("            'searchreplace wordcount visualblocks visualchars code fullscreen',\n");
      out.write("            'insertdatetime media nonbreaking save table contextmenu directionality',\n");
      out.write("            'emoticons template paste textcolor colorpicker textpattern imagetools codesample'\n");
      out.write("        ],\n");
      out.write("        toolbar1: 'insertfile undo redo | styleselect | bold italic | alignleft aligncenter alignright alignjustify | bullist numlist outdent indent | link image',\n");
      out.write("        toolbar2: 'print preview media | forecolor backcolor emoticons | codesample',\n");
      out.write("        image_advtab: true,\n");
      out.write("        templates: [\n");
      out.write("            {title: 'Test template 1', content: 'Test 1'},\n");
      out.write("            {title: 'Test template 2', content: 'Test 2'}\n");
      out.write("        ],\n");
      out.write("        content_css: [\n");
      out.write("            '//fonts.googleapis.com/css?family=Lato:300,300i,400,400i',\n");
      out.write("            '//www.tinymce.com/css/codepen.min.css'\n");
      out.write("        ]\n");
      out.write("    });\n");
      out.write("    \n");
      out.write("    $(function () {\n");
      out.write("    $(\"#example1\").DataTable();\n");
      out.write("    $('#example2').DataTable({\n");
      out.write("      \"paging\": true,\n");
      out.write("      \"lengthChange\": false,\n");
      out.write("      \"searching\": false,\n");
      out.write("      \"ordering\": true,\n");
      out.write("      \"info\": true,\n");
      out.write("      \"autoWidth\": false\n");
      out.write("    });\n");
      out.write("  });\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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

  private boolean _jspx_meth_c_if_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_catch_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_catch_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_catch_0);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pagi} != null", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("        ");
        if (_jspx_meth_fmt_parseNumber_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context, _jspx_push_body_count_c_catch_0))
          return true;
        out.write("\n");
        out.write("    ");
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

  private boolean _jspx_meth_fmt_parseNumber_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_catch_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:parseNumber
    org.apache.taglibs.standard.tag.rt.fmt.ParseNumberTag _jspx_th_fmt_parseNumber_0 = (org.apache.taglibs.standard.tag.rt.fmt.ParseNumberTag) _jspx_tagPool_fmt_parseNumber_var_value_integerOnly_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.ParseNumberTag.class);
    _jspx_th_fmt_parseNumber_0.setPageContext(_jspx_page_context);
    _jspx_th_fmt_parseNumber_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_fmt_parseNumber_0.setIntegerOnly(true);
    _jspx_th_fmt_parseNumber_0.setVar("page");
    _jspx_th_fmt_parseNumber_0.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pagi}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_fmt_parseNumber_0 = _jspx_th_fmt_parseNumber_0.doStartTag();
    if (_jspx_th_fmt_parseNumber_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_parseNumber_var_value_integerOnly_nobody.reuse(_jspx_th_fmt_parseNumber_0);
      return true;
    }
    _jspx_tagPool_fmt_parseNumber_var_value_integerOnly_nobody.reuse(_jspx_th_fmt_parseNumber_0);
    return false;
  }

  private boolean _jspx_meth_c_set_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_catch_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_catch_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_0.setPageContext(_jspx_page_context);
    _jspx_th_c_set_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_catch_0);
    _jspx_th_c_set_0.setVar("draft");
    _jspx_th_c_set_0.setValue(new String("Drafted"));
    int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
    if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
    return false;
  }

  private boolean _jspx_meth_sql_query_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_catch_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_catch_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:query
    org.apache.taglibs.standard.tag.rt.sql.QueryTag _jspx_th_sql_query_0 = (org.apache.taglibs.standard.tag.rt.sql.QueryTag) _jspx_tagPool_sql_query_var_dataSource.get(org.apache.taglibs.standard.tag.rt.sql.QueryTag.class);
    _jspx_th_sql_query_0.setPageContext(_jspx_page_context);
    _jspx_th_sql_query_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_catch_0);
    _jspx_th_sql_query_0.setDataSource(new String("jdbc/Lab5_DB"));
    _jspx_th_sql_query_0.setVar("result");
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
          out.write("        SELECT * FROM (\n");
          out.write("        SELECT *, ROW_NUMBER() OVER (ORDER BY published_time DESC) as row FROM posts where author = '");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("' OR state != '");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${draft}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("'\n");
          out.write("        )newTable  WHERE row BETWEEN ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${min}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" AND ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${max}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(";\n");
          out.write("    ");
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

  private boolean _jspx_meth_c_set_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_catch_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_catch_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_1 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_scope_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_1.setPageContext(_jspx_page_context);
    _jspx_th_c_set_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_catch_0);
    _jspx_th_c_set_1.setVar("pageCount");
    _jspx_th_c_set_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${result.rowCount}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_set_1.setScope("request");
    int _jspx_eval_c_set_1 = _jspx_th_c_set_1.doStartTag();
    if (_jspx_th_c_set_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_scope_nobody.reuse(_jspx_th_c_set_1);
      return true;
    }
    _jspx_tagPool_c_set_var_value_scope_nobody.reuse(_jspx_th_c_set_1);
    return false;
  }

  private boolean _jspx_meth_c_if_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_catch_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_catch_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_catch_0);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${page} < ${pageCount} || ${page} > ${pageCount}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("        ");
        if (_jspx_meth_c_set_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_1, _jspx_page_context, _jspx_push_body_count_c_catch_0))
          return true;
        out.write("\n");
        out.write("        ");
        if (_jspx_meth_c_redirect_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_1, _jspx_page_context, _jspx_push_body_count_c_catch_0))
          return true;
        out.write("\n");
        out.write("    ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }

  private boolean _jspx_meth_c_set_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_catch_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_2 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_2.setPageContext(_jspx_page_context);
    _jspx_th_c_set_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_1);
    _jspx_th_c_set_2.setVar("pagi");
    _jspx_th_c_set_2.setValue(new String("null"));
    int _jspx_eval_c_set_2 = _jspx_th_c_set_2.doStartTag();
    if (_jspx_th_c_set_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_2);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_2);
    return false;
  }

  private boolean _jspx_meth_c_redirect_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_catch_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:redirect
    org.apache.taglibs.standard.tag.rt.core.RedirectTag _jspx_th_c_redirect_0 = (org.apache.taglibs.standard.tag.rt.core.RedirectTag) _jspx_tagPool_c_redirect_nobody.get(org.apache.taglibs.standard.tag.rt.core.RedirectTag.class);
    _jspx_th_c_redirect_0.setPageContext(_jspx_page_context);
    _jspx_th_c_redirect_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_1);
    int _jspx_eval_c_redirect_0 = _jspx_th_c_redirect_0.doStartTag();
    if (_jspx_th_c_redirect_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_redirect_nobody.reuse(_jspx_th_c_redirect_0);
      return true;
    }
    _jspx_tagPool_c_redirect_nobody.reuse(_jspx_th_c_redirect_0);
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_catch_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_catch_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_catch_0);
    _jspx_th_c_forEach_0.setVar("row");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${result.rows}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("        <div class=\"post\">\n");
          out.write("            <div class=\"user-block\">\n");
          out.write("                <!--<img class=\"img-circle img-bordered-sm\" src=\"resources/dist/img/manager-512.png\" alt=\"user image\">-->\n");
          out.write("                <span class=\"username\">\n");
          out.write("                    <!--Title -->\n");
          out.write("                    <a href=\"postDetail.jsp?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.post_id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.title}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a>\n");
          out.write("                    ");
          if (_jspx_meth_c_if_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\n");
          out.write("                </span>\n");
          out.write("                <!--User & published time -->\n");
          out.write("                <span class=\"description\">by ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.author}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" - ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.state}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" at ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.published_time}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</span>\n");
          out.write("            </div>\n");
          out.write("            <!-- /.user-block -->\n");
          out.write("            <!--        <p>\n");
          out.write("            ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.content}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\n");
          out.write("        </p>-->\n");
          out.write("\n");
          out.write("        </div>\n");
          out.write("    ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.author} == ${username}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                        <a href=\"editPost.jsp?id=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.post_id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" class=\"pull-right btn-box-tool\" ><i class=\"fa fa-fw fa-edit\"></i></a>\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_c_if_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
    return false;
  }
}
