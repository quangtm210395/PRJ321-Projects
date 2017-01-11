package org.apache.jsp.included;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Map;
import java.sql.Timestamp;
import java.util.TreeMap;
import java.sql.ResultSet;
import JDBC.DBContext;

public final class postContents_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

    DBContext db = new DBContext();
    String sql = "SELECT * from Posts order by published_time DESC";
    ResultSet rs;
    String username = (String) session.getAttribute("username");
    String p = (String) request.getParameter("pagi");
    System.out.println("pagi = " + p);
    int pagi = p != null ? Integer.parseInt(p) - 1 : 0;
    System.out.println(pagi);

    try {
        rs = db.executeQuery(sql);
        int size = 0;
        while (rs.next()) {
            String author = rs.getString(4);
            if (!(rs.getString(6).equals("Drafted") && !author.equals(username))) {
                size++;
            }
        }
        rs.beforeFirst();
        int pageCount = size / 5 + 1;
        if (pagi < 0 || pagi > pageCount) {
            request.setAttribute("pagi", null);
            response.sendRedirect("index.jsp");
        }
        if (pagi > 0) {
            for (int i = 0; i < 5 * pagi; i++) {
                if (rs.next()) {
                    if (rs.getString(6).equals("Drafted") && !rs.getString(4).equals(username)) {
                        i--;
                    }
                    continue;
                } else {
                    break;
                }
            }
        }

        for (int i = 0; i < 5; i++) {
            if (rs.next()) {
                String author = rs.getString(4);
                if (!(rs.getString(6).equals("Drafted") && !author.equals(username))) {


      out.write("\n");
      out.write("\n");
      out.write("<div class=\"post\">\n");
      out.write("    <div class=\"user-block\">\n");
      out.write("        <!--<img class=\"img-circle img-bordered-sm\" src=\"resources/dist/img/manager-512.png\" alt=\"user image\">-->\n");
      out.write("        <span class=\"username\">\n");
      out.write("            <!--Title -->\n");
      out.write("            <a href=\"postDetail.jsp?id=");
      out.print(rs.getInt(1));
      out.write('"');
      out.write('>');
      out.print(rs.getString(2));
      out.write("</a>\n");
      out.write("            ");

                if (author.equals(username)) {
            
      out.write("\n");
      out.write("            <a href=\"editPost.jsp?id=");
      out.print(rs.getInt(1));
      out.write("\" class=\"pull-right btn-box-tool\" ><i class=\"fa fa-fw fa-edit\"></i></a>\n");
      out.write("                ");

                    }
                
      out.write("\n");
      out.write("        </span>\n");
      out.write("        <!--User & published time -->\n");
      out.write("        <span class=\"description\">by ");
      out.print(rs.getString(4));
      out.write(" - ");
      out.print(rs.getString(6));
      out.write(" at ");
      out.print(rs.getTimestamp(5));
      out.write("</span>\n");
      out.write("    </div>\n");
      out.write("    <!-- /.user-block -->\n");
      out.write("    <!--    <p>\n");
      out.write("    ");
      out.print(rs.getString(3));
      out.write("\n");
      out.write("</p>-->\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");

            } else
                i--;
        } else
            break;
    }
    rs.close();

      out.write("\n");
      out.write("<div class=\"box-footer\">\n");
      out.write("    <ul class=\"pagination no-margin pull-right\" id=\"pagination-buttons\">\n");
      out.write("        <li><a href=\"?pagi=");
      out.print((pagi + 1) > 1 ? pagi : (pagi + 1));
      out.write("\"><</a></li>\n");
      out.write("        <li class=\"active\"><a href=\"?pagi=1\">1</a></li>\n");
      out.write("            ");

                for (int i = 2; i <= pageCount; i++) {
            
      out.write("\n");
      out.write("        <li><a href=\"?pagi=");
      out.print(i);
      out.write('"');
      out.write('>');
      out.print(i);
      out.write("</a></li>\n");
      out.write("            ");

                }
            
      out.write("\n");
      out.write("        <li><a href=\"?pagi=");
      out.print((pagi + 1) < pageCount ? (pagi + 2) : (pagi + 1));
      out.write("\">></a></li>\n");
      out.write("    </ul>\n");
      out.write("</div>\n");

    } catch (Exception e) {
        e.printStackTrace();
    } finally {
        db.close();
    }

      out.write('\n');
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
