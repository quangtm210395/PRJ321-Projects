package org.apache.jsp.included;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class postDetailContents_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<form class=\"form-horizontal\">\n");
      out.write("    <div class=\"form-group\">\n");
      out.write("        <label for=\"inputName\" class=\"col-sm-2 control-label\" >Title</label>\n");
      out.write("\n");
      out.write("        <div class=\"col-sm-10\">\n");
      out.write("            <input type=\"email\" class=\"form-control\" id=\"inputName\" readonly>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"form-group\">\n");
      out.write("        <label for=\"inputEmail\" class=\"col-sm-2 control-label\">Author</label>\n");
      out.write("\n");
      out.write("        <div class=\"col-sm-10\">\n");
      out.write("            <input type=\"email\" class=\"form-control\" id=\"inputEmail\" readonly>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"form-group\">\n");
      out.write("        <label for=\"inputName\" class=\"col-sm-2 control-label\">Time</label>\n");
      out.write("\n");
      out.write("        <div class=\"col-sm-10\">\n");
      out.write("            <input type=\"text\" class=\"form-control\" id=\"inputName\" readonly>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"form-group\">\n");
      out.write("        <label for=\"inputExperience\" class=\"col-sm-2 control-label\">Experience</label>\n");
      out.write("\n");
      out.write("        <div class=\"col-sm-10\">\n");
      out.write("            <textarea class=\"form-control\" id=\"inputExperience\" readonly></textarea>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"form-group\">\n");
      out.write("        <label for=\"inputSkills\" class=\"col-sm-2 control-label\">Skills</label>\n");
      out.write("\n");
      out.write("        <div class=\"col-sm-10\">\n");
      out.write("            <input type=\"text\" class=\"form-control\" id=\"inputSkills\" readonly>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"form-group\">\n");
      out.write("        <div class=\"col-sm-offset-2 col-sm-10\">\n");
      out.write("            <div class=\"checkbox\">\n");
      out.write("                <label>\n");
      out.write("                    <input type=\"checkbox\"> I agree to the <a href=\"#\">terms and conditions</a>\n");
      out.write("                </label>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"form-group\">\n");
      out.write("        <div class=\"col-sm-offset-2 col-sm-10\">\n");
      out.write("            <button type=\"submit\" class=\"btn btn-danger\">Submit</button>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</form>");
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
