package org.apache.jsp.included;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      response.setContentType("text/html");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta http-equiv=\"content-type\" content=\"text/html;charset=UTF-8\" />\n");
      out.write("    <!--[if IE]>\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("<![endif]-->\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <meta name=\"author\" content=\"ScriptsBundle\">\n");
      out.write("    <title>Opportunities A Mega Job Board Template</title>\n");
      out.write("    <link rel=\"icon\" href=\"images/favicon.ico\" type=\"image/x-icon\">\n");
      out.write("\n");
      out.write("    <!-- BOOTSTRAPE STYLESHEET CSS FILES -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("\n");
      out.write("    <!-- JQUERY MENU -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/mega_menu.min.css\">\n");
      out.write("\n");
      out.write("    <!-- ANIMATION -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/animate.min.css\">\n");
      out.write("\n");
      out.write("    <!-- OWl  CAROUSEL-->\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/owl.carousel.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/owl.style.css\">\n");
      out.write("\n");
      out.write("    <!-- TEMPLATE CORE CSS -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("\n");
      out.write("    <!-- FOR THIS PAGE ONLY -->\n");
      out.write("    <link href=\"css/select2.min.css\" rel=\"stylesheet\" />\n");
      out.write("\n");
      out.write("    <!-- FONT AWESOME -->\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"http://templates.scriptsbundle.com/opportunities/demo/css/font-awesome.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/et-line-fonts.css\" type=\"text/css\">\n");
      out.write("    \n");
      out.write("\n");
      out.write("    <!-- Google Fonts -->\n");
      out.write("    <link href=\"http://fonts.googleapis.com/css?family=Source+Sans+Pro:400,600,700,900,300\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css?family=Open+Sans:400,600,700\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("    <!-- JavaScripts -->\n");
      out.write("    <script src=\"js/modernizr.js\"></script>\n");
      out.write("    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->\n");
      out.write("    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\n");
      out.write("    <!--[if lt IE 9]>\n");
      out.write("        <script src=\"https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js\"></script>\n");
      out.write("        <script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>\n");
      out.write("<![endif]-->");
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
