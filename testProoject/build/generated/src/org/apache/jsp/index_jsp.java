package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import jdbc.DbContext;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/included/header.jsp");
    _jspx_dependants.add("/included/body.jsp");
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
      out.write("    <title>QKHFreelancer</title>\n");
      out.write("    <link rel=\"icon\" href=\"images/icon.png\" type=\"image/x-icon\">\n");
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
      out.write("    <link rel=\"stylesheet\" href=\"css/jquery.tagsinput.min.css\">\n");
      out.write("\n");
      out.write("    <!-- FONT AWESOME -->\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.5.0/css/font-awesome.min.css\">\n");
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
      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</head>\n");

    String usName = "";
    if (session.getAttribute("fullName") != null) {
        usName = (String) session.getAttribute("fullName");
        usName = usName.substring(0, usName.indexOf(" "));
    }

      out.write("\n");
      out.write("<body>\n");
      out.write("    <div class=\"page\">\n");
      out.write("        <!--        <div id=\"spinner\">\n");
      out.write("                    <div class=\"spinner-img\"> <img alt=\"Opportunities Preloader\" src=\"images/loader.gif\" />\n");
      out.write("                        <h2>Please Wait.....</h2>\n");
      out.write("                    </div>\n");
      out.write("                </div>-->\n");
      out.write("        <nav id=\"menu-1\" class=\"mega-menu fa-change-black\" data-color=\"\"> \n");
      out.write("            <section class=\"menu-list-items container\"> \n");
      out.write("                <ul class=\"menu-logo\">\n");
      out.write("                    <li> <a href=\"index.jsp\"> <img src=\"images/logo.png\" alt=\"logo\" class=\"img-responsive\"> </a> </li>\n");
      out.write("                </ul>\n");
      out.write("                <ul class=\"menu-links pull-right\">\n");
      out.write("                    <li class=\"no-bg\"><a href=\"postJob.jsp\" class=\"p-job\"><i class=\"fa fa-plus-square\"></i> Post a Job</a></li>\n");
      out.write("                        ");

                            if (session.getAttribute("userID") == null) {


                        
      out.write("\n");
      out.write("                    <li class=\"no-bg login-btn-no-bg\"><a href=\"login.jsp\" class=\"login-header-btn\"><i class=\"fa fa-sign-in\"></i> Log in</a></li>\n");
      out.write("                        ");
                    } else {

                        
      out.write("\n");
      out.write("                    <li class=\"profile-pic\">\n");
      out.write("                        <a href=\"javascript:void(0)\"> <img src=\"images/admin.jpg\" alt=\"user-img\" class=\"img-circle\" width=\"36\"><span class=\"hidden-xs hidden-sm\">");
      out.print(usName);
      out.write(" </span><i class=\"fa fa-angle-down fa-indicator\"></i> </a>\n");
      out.write("                        <ul class=\"drop-down-multilevel left-side\">\n");
      out.write("                            <li><a href=\"userInfomation.jsp\"><i class=\"fa fa-user\"></i> My Profile</a></li>\n");
      out.write("                            <li><a href=\"jobGotOffer.jsp\"><i class=\"fa fa-mail-forward\"></i> Your Job got Offered</a></li>\n");
      out.write("                            <li><a href=\"#\"><i class=\"fa fa-gear\"></i> Account Setting</a></li>\n");
      out.write("                            <li><a href=\"LogoutServlet\"><i class=\"fa fa-power-off\"></i> Logout</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                    ");
                        }
                    
      out.write("\n");
      out.write("                </ul>\n");
      out.write("            </section>\n");
      out.write("        </nav>\n");
      out.write("        <div class=\"clearfix\"></div>\n");
      out.write("\n");
      out.write('\n');
    int countWeb = 0;
    int countDesktop = 0;
    int countMobile = 0;

    String tmpQuery = "WITH T AS (SELECT *,ROW_NUMBER() OVER (ORDER BY title ASC) AS SNO FROM InOrderJob WHERE category LIKE '%Web Applications%') SELECT MAX(SNO) FROM T";
    DbContext db = new DbContext();
    try {
        ResultSet rs = db.executeQuery(tmpQuery);

        while (rs.next()) {
            countWeb = rs.getInt(1);
        }
        db.close();
    } catch (Exception e) {
    }

    tmpQuery = "WITH T AS (SELECT *,ROW_NUMBER() OVER (ORDER BY title ASC) AS SNO FROM InOrderJob WHERE category LIKE '%Desktop Applications%') SELECT MAX(SNO) FROM T";
    db = new DbContext();
    try {
        ResultSet rs = db.executeQuery(tmpQuery);

        while (rs.next()) {
            countDesktop = rs.getInt(1);
        }
        db.close();
    } catch (Exception e) {
    }

    tmpQuery = "WITH T AS (SELECT *,ROW_NUMBER() OVER (ORDER BY title ASC) AS SNO FROM InOrderJob WHERE category LIKE '%Mobile Applications%') SELECT MAX(SNO) FROM T";
    db = new DbContext();
    try {
        ResultSet rs = db.executeQuery(tmpQuery);

        while (rs.next()) {
            countMobile = rs.getInt(1);
        }
        db.close();
    } catch (Exception e) {
    }
    

      out.write("\n");
      out.write("<div class=\"clearfix\"></div>\n");
      out.write("<section class=\"main-section parallex\">\n");
      out.write("    <div class=\"container-fluid\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-md-8 col-sm-12 col-md-offset-2 col-xs-12 nopadding\">\n");
      out.write("                <div class=\"search-form-contaner\">\n");
      out.write("                    <h1 class=\"search-main-title\"> One million success stories. Start yours today </h1>\n");
      out.write("                    <form class=\"form-inline\" action=\"joblist.jsp\">\n");
      out.write("                        <div class=\"col-md-7 col-sm-4 col-xs-12 nopadding\">\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("\n");
      out.write("                                <input type=\"text\" class=\"form-control\" name=\"tags\" placeholder=\"Search Keyword\" value=\"\">\n");
      out.write("                                <i class=\"icon-magnifying-glass\"></i>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-3 col-sm-3 col-xs-12 nopadding\">\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <select class=\"select-category form-control\" name=\"category\" required>\n");
      out.write("                                    <option label=\"Select Option\"></option>\n");
      out.write("                                    <option value=\"Web Applications\">Web Applications</option>\n");
      out.write("                                    <option value=\"Desktop Applications\">Desktop Applications</option>\n");
      out.write("                                    <option value=\"Mobile Applications\">Mobile Applications</option>\n");
      out.write("                                </select>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-2 col-sm-2 col-xs-12 nopadding\">\n");
      out.write("                            <div class=\"form-group form-action\">\n");
      out.write("                                <button type=\"submit\" class=\"btn btn-primary btn-search-submit\">Search</button>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</section>\n");
      out.write("<section class=\"advance-search light-blue\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-md-12 col-sm-12 col-xs-12 nopadding\">\n");
      out.write("                <form class=\"form-inline\" action=\"jobList2.jsp\">\n");
      out.write("                    <div class=\"col-md-4 col-sm-3 col-xs-12\">\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label>Select Location</label>\n");
      out.write("                            <select class=\"select-location form-control\" name=\"loctaion\">\n");
      out.write("                                <option value=\"\">&nbsp;</option>\n");
      out.write("                                <option value=\"Ha Noi\">Ha Noi</option>\n");
      out.write("                                <option value=\"Hai Phong\">Hai Phong</option>\n");
      out.write("                                <option value=\"Hue\">Hue</option>\n");
      out.write("                                <option value=\"Da Nang\">Da Nang</option>\n");
      out.write("                                <option value=\"Ho Chi Minh City\">Ho Chi Minh City</option>\n");
      out.write("                            </select>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-4 col-sm-3 col-xs-12\">\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label>Select Category</label>\n");
      out.write("                            <select class=\"select-category form-control\" name=\"category\">\n");
      out.write("                                <option label=\"Select Option\"></option>\n");
      out.write("                                <option value=\"\">&nbsp;</option>\n");
      out.write("                                <option value=\"Web Applications\">Web Applications</option>\n");
      out.write("                                <option value=\"Desktop Applications\">Desktop Applications</option>\n");
      out.write("                                <option value=\"Mobile Applications\">Mobile Applications</option>\n");
      out.write("                            </select>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-4 col-sm-3 col-xs-12\">\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label>Job Type</label>\n");
      out.write("                            <select class=\"select-category form-control\" name=\"jobType\">\n");
      out.write("                                <option value=\"\">&nbsp;</option>\n");
      out.write("                                <option value=\"Full Time\">Full Time</option>\n");
      out.write("                                <option value=\"Part Time\">Part Time</option>\n");
      out.write("                                <option value=\"Remote\">Remote</option>\n");
      out.write("                                <option value=\"Freelancer\">Freelancer</option>\n");
      out.write("                            </select>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-4 col-sm-3 col-xs-12\">\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label>Job Experience</label>\n");
      out.write("                            <select class=\"questions-category form-control\" name=\"experience\">\n");
      out.write("                                <option value=\"\">&nbsp;</option>\n");
      out.write("                                <option value=\"Fresher\">Fresher</option>\n");
      out.write("                                <option value=\"1 Year\">1 Year</option>\n");
      out.write("                                <option value=\"2 Years\">2 Years</option>\n");
      out.write("                                <option value=\"3 Years\">3 Years</option>\n");
      out.write("                                <option value=\"4 Years\">4 Years</option>\n");
      out.write("                                <option value=\"5 Years\">5 Years</option>\n");
      out.write("                                <option value=\"6+ Years\">6+ Years</option>\n");
      out.write("                            </select>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-4 col-sm-3 col-xs-12\">\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label>Salary</label>\n");
      out.write("                            <select class=\"questions-category form-control\" name=\"salary\">\n");
      out.write("                                <option value=\"\">&nbsp;</option>\n");
      out.write("                                <option value=\"Less than 100$\">Less than 100$</option>\n");
      out.write("                                <option value=\"100$+\">100$+</option>\n");
      out.write("                                <option value=\"500$+\">500$+</option>\n");
      out.write("                                <option value=\"1,000$+\">1,000$+</option>\n");
      out.write("                                <option value=\"5,000$+\">5,000$+</option>\n");
      out.write("                                <option value=\"10,000$+\">10,000$+</option>\n");
      out.write("                                <option value=\"100,000$+\">100,000$+</option>\n");
      out.write("                                <option value=\"Negotiable\">Negotiable</option>\n");
      out.write("                            </select>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"col-md-4 col-sm-3 col-xs-12\">\n");
      out.write("                        <div class=\"form-group form-action\">\n");
      out.write("                            <button type=\"submit\" class=\"btn btn-default btn-block\"><i class=\"fa fa-search\"></i>Search Job</button>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</section>\n");
      out.write("\n");
      out.write("<section class=\"call-to-action-1\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-md-12 col-sm-12 col-xs-12\">\n");
      out.write("                <div class=\"col-md-10 col-sm-10 col-xs-12\">\n");
      out.write("                    <i class=\"icon-trophy\"></i>\n");
      out.write("                    <div class=\"heading-detail\">\n");
      out.write("                        <h3>World?s Best Job Portal Website</h3>\n");
      out.write("                        <p>Where you can find a lot of hot jobs in Viet Nam.</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-2 col-sm-2 col-xs-12\">\n");
      out.write("                    <a class=\"btn btn-default btn-block\" href=\"postJob.jsp\">Post Now</a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</section>\n");
      out.write("\n");
      out.write("<section class=\"category-section-3 light-grey\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-md-12 col-sm-12 col-xs-12\">\n");
      out.write("                <div class=\"Heading-title black\">\n");
      out.write("                    <h1>Browse Categories</h1>\n");
      out.write("                    <p>Choose one of the hottest Categories.</p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-12 col-sm-12 col-xs-12\">\n");
      out.write("                <div class=\"col-md-4 col-sm-6 col-xs-12\">\n");
      out.write("                    <div class=\"category-section-3-box\">\n");
      out.write("                        <div class=\"category-section-3-box-inner\"> <i class=\"icon-browser\"></i>\n");
      out.write("                            <h4> Web Applications </h4>\n");
      out.write("                            <span>( ");
      out.print(countWeb);
      out.write(" )</span> </div>\n");
      out.write("                        <div class=\"category-section-3-box-over-text animated fadeIn\">\n");
      out.write("                            <h4>Front End</h4>\n");
      out.write("                            <h4>back End</h4>\n");
      out.write("                            <h4>Core Programing</h4>\n");
      out.write("                            <p><a href=\"joblist.jsp?tags=&category=Web+Applications\"> See All </a></p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"col-md-4 col-sm-6 col-xs-12\">\n");
      out.write("                    <div class=\"category-section-3-box\">\n");
      out.write("                        <div class=\"category-section-3-box-inner\"> <i class=\" icon-tablet\"></i>\n");
      out.write("                            <h4> Mobile Applications </h4>\n");
      out.write("                            <span>( ");
      out.print(countMobile);
      out.write(" )</span> </div>\n");
      out.write("                        <div class=\"category-section-3-box-over-text animated fadeIn\">\n");
      out.write("                            <h4>iOS APP</h4>\n");
      out.write("                            <h4>ANDROID</h4>\n");
      out.write("                            <h4>UI/UX DESIGNERS</h4>\n");
      out.write("                            <p><a href=\"joblist.jsp?tags=&category=Mobile+Applications\"> See All </a></p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-4 col-sm-6 col-xs-12\">\n");
      out.write("                    <div class=\"category-section-3-box\">\n");
      out.write("                        <div class=\"category-section-3-box-inner\"> <i class=\"icon-clipboard\"></i>\n");
      out.write("                            <h4> Desktop Applications </h4>\n");
      out.write("                            <span>( ");
      out.print(countDesktop);
      out.write(" )</span> </div>\n");
      out.write("                        <div class=\"category-section-3-box-over-text animated fadeIn\">\n");
      out.write("                            <h4>Window Applications</h4>\n");
      out.write("                            <h4>Unix/Linux</h4>\n");
      out.write("                            <h4>iMac Apps</h4>\n");
      out.write("                            <p><a href=\"joblist.jsp?tags=&category=Desktop+Applications\"> See All </a></p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"col-md-12 col-sm-12 col-xs-12\">\n");
      out.write("                    <div class=\"load-more-btn\">\n");
      out.write("                        <button class=\"btn-default\"> View All <i class=\"fa fa-angle-right\"></i> </button>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</section>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"brand-logo-area clients-bg\">\n");
      out.write("    <div class=\"clients-list\">\n");
      out.write("        <div class=\"client-logo\">\n");
      out.write("            <a href=\"#\"><img src=\"images/clients/client_1.png\" class=\"img-responsive\" alt=\"Brand Image\" /></a>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"client-logo\">\n");
      out.write("            <a href=\"#\"><img src=\"images/clients/client_2.png\" class=\"img-responsive\" alt=\"Brand Image\" /></a>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"client-logo\">\n");
      out.write("            <a href=\"#\"><img src=\"images/clients/client_3.png\" class=\"img-responsive\" alt=\"Brand Image\" /></a>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"client-logo\">\n");
      out.write("            <a href=\"#\"><img src=\"images/clients/client_4.png\" class=\"img-responsive\" alt=\"Brand Image\" /></a>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"client-logo\">\n");
      out.write("            <a href=\"#\"><img src=\"images/clients/client_1.png\" class=\"img-responsive\" alt=\"Brand Image\" /></a>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"client-logo\">\n");
      out.write("            <a href=\"#\"><img src=\"images/clients/client_2.png\" class=\"img-responsive\" alt=\"Brand Image\" /></a>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"client-logo\">\n");
      out.write("            <a href=\"#\"><img src=\"images/clients/client_3.png\" class=\"img-responsive\" alt=\"Brand Image\" /></a>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"client-logo\">\n");
      out.write("            <a href=\"#\"><img src=\"images/clients/client_4.png\" class=\"img-responsive\" alt=\"Brand Image\" /></a>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"fixed-footer\">\n");
      out.write("    <footer class=\"footer\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-sm-6 col-md-4 col-xs-12\">\n");
      out.write("                    <div class=\"footer_block\">\n");
      out.write("                        <a href=\"index.html\" class=\"f_logo\"><img src=\"images/logo.png\" class=\"img-responsive\" alt=\"logo\"></a>\n");
      out.write("                        <p>Demo project by QKHTeam. A Website Where you can Hire freelance programmers, web developers, designers, writers, data entry & more at a fraction of the cost on the World's Largest Outsourcing Marketplace.</p>\n");
      out.write("                        <div class=\"social-bar\">\n");
      out.write("                            <ul>\n");
      out.write("                                <li>\n");
      out.write("                                    <a class=\"fa fa-twitter\" href=\"#\"></a>\n");
      out.write("                                </li>\n");
      out.write("                                <li>\n");
      out.write("                                    <a class=\"fa fa-pinterest\" href=\"#\"></a>\n");
      out.write("                                </li>\n");
      out.write("                                <li>\n");
      out.write("                                    <a class=\"fa fa-facebook\" href=\"#\"></a>\n");
      out.write("                                </li>\n");
      out.write("                                <li>\n");
      out.write("                                    <a class=\"fa fa-behance\" href=\"#\"></a>\n");
      out.write("                                </li>\n");
      out.write("                                <li>\n");
      out.write("                                    <a class=\"fa fa-instagram\" href=\"#\"></a>\n");
      out.write("                                </li>\n");
      out.write("                                <li>\n");
      out.write("                                    <a class=\"fa fa-linkedin\" href=\"#\"></a>\n");
      out.write("                                </li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"col-sm-6 col-md-4 col-xs-12\">\n");
      out.write("                    <div class=\"footer_block dark_gry\">\n");
      out.write("                        <h4>Our Team:</h4>\n");
      out.write("                        <ul class=\"recentpost\">\n");
      out.write("                            <li> <span><a class=\"plus\" href=\"#\"><img src=\"images/users/1.jpg\" alt=\"\" /><i>+</i></a></span>\n");
      out.write("                                <p><a href=\"#\">Trieu Nam Hai</a></p>\n");
      out.write("                                <h3>Back-end Developer</h3>\n");
      out.write("                            </li>\n");
      out.write("                            <li> <span><a class=\"plus\" href=\"#\"><img src=\"images/users/2.jpg\" alt=\"\" /><i>+</i></a></span>\n");
      out.write("                                <p><a href=\"#\">Nguyen Khac Kien</a></p>\n");
      out.write("                                <h3>Database-Tester Developer</h3>\n");
      out.write("                            </li>\n");
      out.write("                            <li> <span><a class=\"plus\" href=\"#\"><img src=\"images/users/3.jpg\" alt=\"\" /><i>+</i></a></span>\n");
      out.write("                                <p><a href=\"#\">Tran Minh Quang</a></p>\n");
      out.write("                                <h3>Front-end Developer</h3>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-6 col-md-4 col-xs-12\">\n");
      out.write("                    <div class=\"footer_block\">\n");
      out.write("                        <h4>Contact Information</h4>\n");
      out.write("                        <ul class=\"personal-info\">\n");
      out.write("                            <li><i class=\"fa fa-map-marker\"></i>DomF - FPT University - Lang Hoa Lac - Ha Noi City</li>\n");
      out.write("                            <li><i class=\"fa fa-envelope\"></i> namhai.lsc.ftu@gmail.com</li>\n");
      out.write("                            <li><i class=\"fa fa-phone\"></i> (+84) 1683574189 </li>\n");
      out.write("                            <li><i class=\"fa fa-clock-o\"></i> Mon - Sun: 0:00 - 24:00</li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </footer>\n");
      out.write("    <section class=\"footer-bottom-section\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-12 col-sm-12 col-xs-12\">\n");
      out.write("                    <div class=\"footer-bottom\">\n");
      out.write("                        <div class=\"container\">\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"col-md-12 col-sm-12 col-xs-12\">\n");
      out.write("                                    <p>Copyright ©2016 - All rights Reserved. Made By <a href=\"http://themeforest.net/user/scriptsbundle\"> QKHTeam </a></p>\n");
      out.write("                                    <p>Reproduction of material from QKHTeam without permission is strictly prohibited. </p>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </section>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<a href=\"#\" class=\"scrollup\"><i class=\"fa fa-chevron-up\"></i></a>\n");
      out.write("\n");
      out.write("<!-- JAVASCRIPT JS  -->\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery-2.2.3.min.js\"></script>\n");
      out.write("\n");
      out.write("<!-- BOOTSTRAP CORE JS -->\n");
      out.write("<script type=\"text/javascript\" src=\"js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("<!-- JQUERY SELECT -->\n");
      out.write("<script type=\"text/javascript\" src=\"js/select2.min.js\"></script>\n");
      out.write("\n");
      out.write("<!-- MEGA MENU -->\n");
      out.write("<script type=\"text/javascript\" src=\"js/mega_menu.min.js\"></script>\n");
      out.write("\n");
      out.write("<!-- JQUERY EASING -->\n");
      out.write("<script type=\"text/javascript\" src=\"js/easing.js\"></script>\n");
      out.write("\n");
      out.write("<!-- JQUERY COUNTERUP -->\n");
      out.write("<script type=\"text/javascript\" src=\"js/counterup.js\"></script>\n");
      out.write("\n");
      out.write("<!-- JQUERY WAYPOINT -->\n");
      out.write("<script type=\"text/javascript\" src=\"js/waypoints.min.js\"></script>\n");
      out.write("\n");
      out.write("<!-- JQUERY REVEAL -->\n");
      out.write("<script type=\"text/javascript\" src=\"js/footer-reveal.min.js\"></script>\n");
      out.write("\n");
      out.write("<!-- Owl Carousel -->\n");
      out.write("<script type=\"text/javascript\" src=\"js/owl-carousel.js\"></script>\n");
      out.write("\n");
      out.write("<!-- CORE JS -->\n");
      out.write("<script type=\"text/javascript\" src=\"js/custom.js\"></script>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<!-- CK-EDITOR -->\n");
      out.write("<script src=\"http://cdn.ckeditor.com/4.5.10/standard/ckeditor.js\"></script>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("    CKEDITOR.replace('ckeditor');\n");
      out.write("    CKEDITOR.replace('ckeditor-experience');\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
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
