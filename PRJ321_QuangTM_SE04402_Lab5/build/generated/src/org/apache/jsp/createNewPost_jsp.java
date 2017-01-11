package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class createNewPost_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(4);
    _jspx_dependants.add("/included/headerScript.jsp");
    _jspx_dependants.add("/included/header.jsp");
    _jspx_dependants.add("/included/postEditor.jsp");
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
      out.write("\n");

    Object user = session.getAttribute("username");
    if (user == null) {
        response.sendRedirect("login.jsp");
    }

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <title>AdminLTE 2 | Dashboard</title>\n");
      out.write("        <!-- Tell the browser to be responsive to screen width -->\n");
      out.write("        <meta content=\"width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no\" name=\"viewport\">\n");
      out.write("        <!-- Bootstrap 3.3.6 -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"resources/bootstrap/css/bootstrap.min.css\">\n");
      out.write("        <!-- Font Awesome -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.5.0/css/font-awesome.min.css\">\n");
      out.write("        <!-- Ionicons -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/ionicons/2.0.1/css/ionicons.min.css\">\n");
      out.write("        <!-- jvectormap -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"resources/plugins/jvectormap/jquery-jvectormap-1.2.2.css\">\n");
      out.write("        <!-- Theme style -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"resources/dist/css/AdminLTE.min.css\">\n");
      out.write("        <!-- AdminLTE Skins. Choose a skin from the css/skins\n");
      out.write("             folder instead of downloading all of them to reduce the load. -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"resources/dist/css/skins/_all-skins.min.css\">\n");
      out.write("\n");
      out.write("        <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->\n");
      out.write("        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\n");
      out.write("        <!--[if lt IE 9]>\n");
      out.write("        <script src=\"https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js\"></script>\n");
      out.write("        <script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>\n");
      out.write("        <![endif]-->\n");
      out.write("    ");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body class=\"hold-transition skin-blue sidebar-mini\">\n");
      out.write("        <div class=\"wrapper\">\n");
      out.write("\n");
      out.write("            <!--Header -->\n");
      out.write("            ");
      out.write('\n');
      out.write('\n');

    Object obj = session.getAttribute("username");
//    if (obj == null) {
//        response.sendRedirect("index.jsp");
//    }

      out.write("\n");
      out.write("<header class=\"main-header\">\n");
      out.write("\n");
      out.write("    <!-- Logo -->\n");
      out.write("    <a href=\"index2.html\" class=\"logo\">\n");
      out.write("        <!-- mini logo for sidebar mini 50x50 pixels -->\n");
      out.write("        <span class=\"logo-mini\"><b>A</b>LT</span>\n");
      out.write("        <!-- logo for regular state and mobile devices -->\n");
      out.write("        <span class=\"logo-lg\"><b>Post</b>Dashboard</span>\n");
      out.write("    </a>\n");
      out.write("\n");
      out.write("    <!-- Header Navbar: style can be found in header.less -->\n");
      out.write("    <nav class=\"navbar navbar-static-top\">\n");
      out.write("        <!-- Sidebar toggle button-->\n");
      out.write("        <!-- Navbar Right Menu -->\n");
      out.write("        <div class=\"navbar-custom-menu\">\n");
      out.write("            <ul class=\"nav navbar-nav\">\n");
      out.write("                <!-- Messages: style can be found in dropdown.less-->\n");
      out.write("                \n");
      out.write("                <!-- User Account: style can be found in dropdown.less -->\n");
      out.write("                <li class=\"dropdown user user-menu\">\n");
      out.write("                    <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\n");
      out.write("                        <img src=\"resources/dist/img/manager-512.png\" class=\"user-image\" alt=\"User Image\">\n");
      out.write("                        <span class=\"hidden-xs\">");
      out.print((String) obj);
      out.write("</span>\n");
      out.write("                    </a>\n");
      out.write("                    <ul class=\"dropdown-menu\">\n");
      out.write("                        <!-- User image -->\n");
      out.write("                        <li class=\"user-header\">\n");
      out.write("                            <img src=\"resources/dist/img/manager-512.png\" class=\"img-circle\" alt=\"User Image\">\n");
      out.write("\n");
      out.write("                            <p>\n");
      out.write("                                ");
      out.print((String) obj);
      out.write(" - Web Developer\n");
      out.write("                                <small>Member since Nov. 2012</small>\n");
      out.write("                            </p>\n");
      out.write("                        </li>\n");
      out.write("                        <!-- Menu Body -->\n");
      out.write("                        <li class=\"user-body\">\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"col-xs-4 text-center\">\n");
      out.write("                                    <a href=\"#\">Followers</a>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-xs-4 text-center\">\n");
      out.write("                                    <a href=\"#\">Sales</a>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-xs-4 text-center\">\n");
      out.write("                                    <a href=\"#\">Friends</a>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <!-- /.row -->\n");
      out.write("                        </li>\n");
      out.write("                        <!-- Menu Footer-->\n");
      out.write("                        <li class=\"user-footer\">\n");
      out.write("                            <div class=\"pull-left\">\n");
      out.write("                                <a href=\"#\" class=\"btn btn-default btn-flat\">Profile</a>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"pull-right\">\n");
      out.write("                                <a href=\"#\" class=\"btn btn-default btn-flat\">Sign out</a>\n");
      out.write("                            </div>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("                <!-- Control Sidebar Toggle Button -->\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </nav>\n");
      out.write("</header>\n");
      out.write("\n");
      out.write('\n');
      out.write("\n");
      out.write("            <!-- Left side column. contains the logo and sidebar -->\n");
      out.write("\n");
      out.write("\n");
      out.write("            <!-- Content Wrapper. Contains page content -->\n");
      out.write("            <div class=\"container\">\n");
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
      out.write("                                        <li class=\"active\"><a href=\"#timeline\" data-toggle=\"tab\">Write a new Post</a></li>\n");
      out.write("                                    </ul>\n");
      out.write("                                    <div class=\"tab-content\">\n");
      out.write("                                        \n");
      out.write("                                        <!-- /.tab-pane -->\n");
      out.write("                                        <div class=\"active tab-pane\" id=\"timeline\">\n");
      out.write("                                            <!-- The writer -->\n");
      out.write("                                            ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<form class=\"form-horizontal\" action=\"PostSubmitProcess\" method=\"post\">\n");
      out.write("    <div class=\"box-body\">\n");
      out.write("        <p class=\"login-box-msg\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${message}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("        <label>Title:</label>\n");
      out.write("        <div class=\"form-group\">\n");
      out.write("            <input type=\"text\" class=\"form-control\" placeholder=\"Title\" name=\"title\">\n");
      out.write("        </div></div>\n");
      out.write("    <textarea name=\"content\">\n");
      out.write("    </textarea>\n");
      out.write("    <p></p>\n");
      out.write("    <div class=\"col-md-2\">\n");
      out.write("        <div class=\"form-group\">\n");
      out.write("            <select class=\"form-control select2 select2-hidden-accessible\" name=\"state\" style=\"width: 100%;\" tabindex=\"-1\" aria-hidden=\"true\">\n");
      out.write("                <option selected=\"selected\">Publish</option>\n");
      out.write("                <option>Draft</option>\n");
      out.write("            </select>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"form-group\">\n");
      out.write("        <button type=\"submit\" class=\"btn btn-danger\">Submit</button>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("</form>\n");
      out.write("\n");
      out.write("                                        </div>\n");
      out.write("                                        <!-- /.tab-pane -->\n");
      out.write("\n");
      out.write("                                        \n");
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
      out.write("\n");
      out.write("<script src='resources/plugins/tinymce/tinymce.min.js'></script>\n");
      out.write("<!--<script src='http://cdn.tinymce.com/4/tinymce.min.js'></script>-->\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("    tinymce.init({\n");
      out.write("        selector: 'textarea',\n");
      out.write("        height: 500,\n");
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
}
