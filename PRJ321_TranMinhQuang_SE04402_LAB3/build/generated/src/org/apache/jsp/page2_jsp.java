package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class page2_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(4);
    _jspx_dependants.add("/included/headerScript.jsp");
    _jspx_dependants.add("/included/header.jsp");
    _jspx_dependants.add("/included/colapse_navbar.jsp");
    _jspx_dependants.add("/included/footer.jsp");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("\n");
      out.write("        ");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<meta name=\"description\" content=\"\">\n");
      out.write("<meta name=\"author\" content=\"\">\n");
      out.write("\n");
      out.write("<!-- Bootstrap Core CSS -->\n");
      out.write("<link href=\"resources/vendor/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("<!-- Custom Fonts -->\n");
      out.write("<link href=\"resources/vendor/font-awesome/css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("<link href=\"https://fonts.googleapis.com/css?family=Montserrat:400,700\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("<link href='https://fonts.googleapis.com/css?family=Kaushan+Script' rel='stylesheet' type='text/css'>\n");
      out.write("<link href='https://fonts.googleapis.com/css?family=Droid+Serif:400,700,400italic,700italic' rel='stylesheet' type='text/css'>\n");
      out.write("<link href='https://fonts.googleapis.com/css?family=Roboto+Slab:400,100,300,700' rel='stylesheet' type='text/css'>\n");
      out.write("\n");
      out.write("<!-- Theme CSS -->\n");
      out.write("<link href=\"resources/css/agency.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" href=\"resources/css/style.css\">\n");
      out.write("\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js\"></script>\n");
      out.write("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>");
      out.write("\n");
      out.write("        <title>Home Page</title>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body id=\"page-top\" class=\"index\">\n");
      out.write("        \n");
      out.write("        ");
      out.write("\n");
      out.write("<!-- Navigation -->\n");
      out.write("        <nav id=\"mainNav\" class=\"navbar navbar-default navbar-custom navbar-fixed-top\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <!-- Brand and toggle get grouped for better mobile display -->\n");
      out.write("                <div class=\"navbar-header page-scroll\">\n");
      out.write("                    <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\">\n");
      out.write("                        <span class=\"sr-only\">Toggle navigation</span> Menu <i class=\"fa fa-bars\"></i>\n");
      out.write("                    </button>\n");
      out.write("                    <a class=\"navbar-brand1 page-scroll\" href=\"#page-top\">Home page</a>\n");
      out.write("                </div>\n");
      out.write("                ");
      out.write("<!-- Collect the nav links, forms, and other content for toggling -->\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\n");
      out.write("                    <ul class=\"nav navbar-nav1 navbar-right\">\n");
      out.write("                        <li class=\"hidden\">\n");
      out.write("                            <a href=\"#page-top\"></a>\n");
      out.write("                        </li>\n");
      out.write("<!--                        <li>\n");
      out.write("                            <a class=\"page-scroll\" href=\"#services\">Services</a>\n");
      out.write("                        </li>-->\n");
      out.write("                        <li>\n");
      out.write("                            <a class=\"page-scroll\" href=\"#portfolio\">Login</a>\n");
      out.write("                        </li>\n");
      out.write("<!--                        <li>\n");
      out.write("                            <a class=\"page-scroll\" href=\"#about\">About</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a class=\"page-scroll\" href=\"#team\">Team</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a class=\"page-scroll\" href=\"#contact\">Contact</a>\n");
      out.write("                        </li>-->\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                <!-- /.navbar-collapse -->");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <!-- /.container-fluid -->\n");
      out.write("        </nav>\n");
      out.write("\n");
      out.write("        \n");
      out.write("        <!-- Header -->\n");
      out.write("        <header>\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"intro-text\">\n");
      out.write("                    <div class=\"intro-lead-in\">Login successful</div>\n");
      out.write("                    <div class=\"intro-heading\">Welcome to our site</div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </header>\n");
      out.write("        \n");
      out.write("        ");
      out.write("<aside class=\"clients\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-md-3 col-sm-6\">\n");
      out.write("                <a href=\"#\">\n");
      out.write("                    <img src=\"resources/img/logos/envato.jpg\" class=\"img-responsive img-centered\" alt=\"\">\n");
      out.write("                </a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-3 col-sm-6\">\n");
      out.write("                <a href=\"#\">\n");
      out.write("                    <img src=\"resources/img/logos/designmodo.jpg\" class=\"img-responsive img-centered\" alt=\"\">\n");
      out.write("                </a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-3 col-sm-6\">\n");
      out.write("                <a href=\"#\">\n");
      out.write("                    <img src=\"resources/img/logos/themeforest.jpg\" class=\"img-responsive img-centered\" alt=\"\">\n");
      out.write("                </a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-3 col-sm-6\">\n");
      out.write("                <a href=\"#\">\n");
      out.write("                    <img src=\"resources/img/logos/creative-market.jpg\" class=\"img-responsive img-centered\" alt=\"\">\n");
      out.write("                </a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</aside>\n");
      out.write("\n");
      out.write("<!-- jQuery -->\n");
      out.write("<script src=\"resources/vendor/jquery/jquery.min.js\"></script>\n");
      out.write("\n");
      out.write("<!-- Bootstrap Core JavaScript -->\n");
      out.write("<script src=\"resources/vendor/bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("<!-- Plugin JavaScript -->\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.3/jquery.easing.min.js\"></script>\n");
      out.write("\n");
      out.write("<!-- Contact Form JavaScript -->\n");
      out.write("<script src=\"resources/js/jqBootstrapValidation.js\"></script>\n");
      out.write("<script src=\"resources/js/contact_me.js\"></script>\n");
      out.write("\n");
      out.write("<!-- Theme JavaScript -->\n");
      out.write("<script src=\"resources/js/agency.min.js\"></script>\n");
      out.write("<script src=\"resources/js/index.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>");
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
