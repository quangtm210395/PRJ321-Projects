package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Enumeration;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Tran Minh Quang</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            for(int i = 1; i <= 10; i++) {
                out.println(i + " ");
            }
        
      out.write("\n");
      out.write("        <hr />\n");
      out.write("        ");

            for(int j = 1; j <= 10; j++) {
                out.println(j*j + " ");
            }
        
      out.write("\n");
      out.write("        <hr />\n");
      out.write("        ");

            String left = "1<sup>2</sup>";
            String right = "1";
            int result = 1;
        
      out.write("\n");
      out.write("            <p style =\"color: rgb( ");
      out.print( new Random().nextInt(255));
      out.write(',');
      out.write(' ');
      out.print( new Random().nextInt(255));
      out.write(',');
      out.write(' ');
      out.print( new Random().nextInt(255));
      out.write(" );\">\n");
      out.write("                ");
      out.print(left);
      out.write(" = ");
      out.print(right);
      out.write(" = ");
      out.print(result);
      out.write(" </p>\n");
      out.write("        ");

            for(int k = 2; k <= 10; k ++) {
                left += "+ " + Integer.toString(k) + "<sup>2</sup>";
                right += "+ " + Integer.toString(k*k);
                result+= k*k;
        
      out.write("\n");
      out.write("        <p style =\"color: rgb( ");
      out.print( new Random().nextInt(255));
      out.write(',');
      out.write(' ');
      out.print( new Random().nextInt(255));
      out.write(',');
      out.write(' ');
      out.print( new Random().nextInt(255));
      out.write(" );\">\n");
      out.write("                ");
      out.print(left);
      out.write(" = ");
      out.print(right);
      out.write(" = ");
      out.print(result);
      out.write(" </p>\n");
      out.write("        ");

            }
        
      out.write("\n");
      out.write("        <hr />\n");
      out.write("        \n");
      out.write("        <p>\n");
      out.write("            Current Date: ");
      out.print(new Date());
      out.write("\n");
      out.write("        </p>\n");
      out.write("        <hr />\n");
      out.write("        \n");
      out.write("        <p>\n");
      out.write("            Current Date: ");
      out.print(new SimpleDateFormat("dd/MM/yy HH:mm").format(new Date()));
      out.write("\n");
      out.write("        </p>\n");
      out.write("        \n");
      out.write("        ");

            String agent = request.getHeader("User-Agent");
            Enumeration<String> headers = request.getHeaderNames();
        
      out.write("\n");
      out.write("        <p>You are accessing using ");
      out.print( agent );
      out.write("</p>\n");
      out.write("        ");

            while(headers.hasMoreElements()){
                String headerName = headers.nextElement();
                out.println("Header: " + headerName);
                out.println("Value: " + request.getHeader(headerName));
                out.println("<br />");
            }
        
      out.write("\n");
      out.write("        \n");
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
