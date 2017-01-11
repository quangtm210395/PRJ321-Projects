package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class editInfomation_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');
      out.write('\n');
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

                            if (session.getAttribute("userName") == null) {


                        
      out.write("\n");
      out.write("                    <li class=\"no-bg login-btn-no-bg\"><a href=\"login.jsp\" class=\"login-header-btn\"><i class=\"fa fa-sign-in\"></i> Log in</a></li>\n");
      out.write("                        ");
                    } else {

                        
      out.write("\n");
      out.write("                    <li class=\"profile-pic\">\n");
      out.write("                        <a href=\"javascript:void(0)\"> <img src=\"images/admin.jpg\" alt=\"user-img\" class=\"img-circle\" width=\"36\"><span class=\"hidden-xs hidden-sm\">Arslan </span><i class=\"fa fa-angle-down fa-indicator\"></i> </a>\n");
      out.write("                        <ul class=\"drop-down-multilevel left-side\">\n");
      out.write("                            <li><a href=\"#\"><i class=\"fa fa-user\"></i> My Profile</a></li>\n");
      out.write("                            <li><a href=\"#\"><i class=\"fa fa-mail-forward\"></i> Inbox</a></li>\n");
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
      out.write("\n");
      out.write("\n");
      out.write("<section class=\"job-breadcrumb\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-md-6 col-sm-7 co-xs-12 text-left\">\n");
      out.write("                <h3>Build Resume</h3>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-6 col-sm-5 co-xs-12 text-right\">\n");
      out.write("                <div class=\"bread\">\n");
      out.write("                    <ol class=\"breadcrumb\">\n");
      out.write("                        <li><a href=\"#\">Home</a> </li>\n");
      out.write("                        <li class=\"active\">Build Resume</li>\n");
      out.write("                    </ol>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</section>\n");
      out.write("<section class=\"dashboard-body\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-md-12 col-sm-12 col-xs-12\">\n");
      out.write("                <div class=\"col-md-4 col-sm-4 col-xs-12\">\n");
      out.write("                    <div class=\"profile-card\">\n");
      out.write("                        <div class=\"banner\">\n");
      out.write("                            <img src=\"images/building.jpg\" alt=\"\" class=\"img-responsive\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"user-image\">\n");
      out.write("                            <img src=\"images/users/profile-avatar.jpg\" class=\"img-responsive img-circle\" alt=\"\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"card-body\">\n");
      out.write("                            <h3>Mrs. Emilly Copper</h3>\n");
      out.write("                            <span class=\"title\">A web Designer</span>\n");
      out.write("                        </div>\n");
      out.write("                        <ul class=\"social-network social-circle onwhite\">\n");
      out.write("                            <li><a href=\"#\" class=\"icoFacebook\" title=\"Facebook\"><i class=\"fa fa-facebook\"></i></a></li>\n");
      out.write("                            <li><a href=\"#\" class=\"icoTwitter\" title=\"Twitter\"><i class=\"fa fa-twitter\"></i></a></li>\n");
      out.write("                            <li><a href=\"#\" class=\"icoGoogle\" title=\"Google +\"><i class=\"fa fa-google-plus\"></i></a></li>\n");
      out.write("                            <li><a href=\"#\" class=\"icoLinkedin\" title=\"Linkedin +\"><i class=\"fa fa-linkedin\"></i></a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"profile-nav\">\n");
      out.write("                        <div class=\"panel\">\n");
      out.write("                            <ul class=\"nav nav-pills nav-stacked\">\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"user-dashboard.html\"> <i class=\"fa fa-user\"></i> Profile</a>\n");
      out.write("                                </li>\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"user-edit-profile.html\"> <i class=\"fa fa-edit\"></i> Edit Profile</a>\n");
      out.write("                                </li>\n");
      out.write("                                <li class=\"active\">\n");
      out.write("                                    <a href=\"user-resume-build.html\"> <i class=\"fa fa-file-o\"></i>Build Resume </a>\n");
      out.write("                                </li>\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"user-resume.html\"> <i class=\"fa fa-file-o\"></i>Saved Resume </a>\n");
      out.write("                                </li>\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"user-job-applied.html\"> <i class=\"fa  fa-list-ul\"></i> Jobs Applied</a>\n");
      out.write("                                </li>\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"user-followed-companies.html\"> <i class=\"fa  fa-bookmark-o\"></i> Followed Companies </a>\n");
      out.write("                                </li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-8 col-sm-8 col-xs-12\">\n");
      out.write("                    <div class=\"heading-inner first-heading\">\n");
      out.write("                        <p class=\"title\">Educational Detail</p>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-12 col-sm-12 col-xs-12 nopadding\">\n");
      out.write("                        <div class=\"profile-edit row\">\n");
      out.write("                            <form>\n");
      out.write("                                <div class=\"col-md-12 col-sm-12\">\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label>Degree Title <span class=\"required\">*</span></label>\n");
      out.write("                                        <input type=\"text\" placeholder=\"Degree Title\" class=\"form-control\">\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-md-6 col-sm-12\">\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label>Degree start Date <span class=\"required\">*</span></label>\n");
      out.write("                                        <input type=\"text\" placeholder=\"Pick Date\" class=\"form-control\">\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-md-6 col-sm-12\">\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label>Degree End Date <span class=\"required\">*</span></label>\n");
      out.write("                                        <input type=\"text\" placeholder=\" Pick Date\" class=\"form-control\">\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-md-12 col-sm-12 col-xs-12\">\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label>Description</label>\n");
      out.write("                                        <textarea name=\"ckeditor\" id=\"ckeditor\"></textarea>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-md-12 col-sm-12\">\n");
      out.write("                                    <button class=\"btn btn-default pull-right\"> Save Education <i class=\"fa fa-angle-right\"></i></button>\n");
      out.write("                                </div>\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                        <hr class=\"divider\">\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"heading-inner first-heading\">\n");
      out.write("                        <p class=\"title\">Job Experience</p>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-12 col-sm-12 col-xs-12 nopadding\">\n");
      out.write("                        <div class=\"profile-edit row\">\n");
      out.write("                            <form>\n");
      out.write("                                <div class=\"col-md-12 col-sm-12\">\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label>Position <span class=\"required\">*</span></label>\n");
      out.write("                                        <input type=\"text\" placeholder=\"Position Title\" class=\"form-control\">\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-md-6 col-sm-12\">\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label>Job start Date <span class=\"required\">*</span></label>\n");
      out.write("                                        <input type=\"text\" placeholder=\"Pick Date\" class=\"form-control\">\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-md-6 col-sm-12\">\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label>JobEnd Date <span class=\"required\">*</span></label>\n");
      out.write("                                        <input type=\"text\" placeholder=\" Pick Date\" class=\"form-control\">\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-md-12 col-sm-12 col-xs-12\">\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label>Description</label>\n");
      out.write("                                        <textarea name=\"ckeditor\" id=\"ckeditor-experience\"></textarea>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-md-12 col-sm-12\">\n");
      out.write("                                    <button class=\"btn btn-default pull-right\"> Save Experience <i class=\"fa fa-angle-right\"></i></button>\n");
      out.write("                                </div>\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                        <hr class=\"divider\">\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"heading-inner first-heading\">\n");
      out.write("                        <p class=\"title\">Add Skills</p>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-12 col-sm-12 col-xs-12 nopadding\">\n");
      out.write("                        <div class=\"profile-edit row\">\n");
      out.write("                            <form>\n");
      out.write("                                <div class=\"col-md-8 col-sm-12\">\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label>Skill Name <span class=\"required\">*</span></label>\n");
      out.write("                                        <input type=\"text\" placeholder=\"Skill Name\" class=\"form-control\">\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-md-4 col-sm-12\">\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label>Add Percentage (%) <span class=\"required\">*</span></label>\n");
      out.write("                                        <input type=\"text\" placeholder=\"Percentage %\" class=\"form-control\">\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-md-12 col-sm-12\">\n");
      out.write("                                    <button class=\"btn btn-default pull-right\"> Save Skills <i class=\"fa fa-angle-right\"></i></button>\n");
      out.write("                                </div>\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                        <hr class=\"divider\">\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"heading-inner first-heading\">\n");
      out.write("                        <p class=\"title\">Social Links</p>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-12 col-sm-12 col-xs-12 nopadding\">\n");
      out.write("                        <div class=\"profile-edit row\">\n");
      out.write("                            <form>\n");
      out.write("                                <div class=\"col-md-6 col-sm-12\">\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label>Face Book <span class=\"required\">*</span></label>\n");
      out.write("                                        <input type=\"text\" placeholder=\"Profile URL\" class=\"form-control\">\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-md-6 col-sm-12\">\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label>Twitter <span class=\"required\">*</span></label>\n");
      out.write("                                        <input type=\"text\" placeholder=\"Profile URL\" class=\"form-control\">\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-md-6 col-sm-12\">\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label>LinkedIn <span class=\"required\">*</span></label>\n");
      out.write("                                        <input type=\"text\" placeholder=\"Profile URL\" class=\"form-control\">\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-md-6 col-sm-12\">\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label>Google Pluse <span class=\"required\">*</span></label>\n");
      out.write("                                        <input type=\"text\" placeholder=\"Profile URL\" class=\"form-control\">\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-md-12 col-sm-12\">\n");
      out.write("                                    <button class=\"btn btn-default pull-right\"> Save Profiles Links <i class=\"fa fa-angle-right\"></i></button>\n");
      out.write("                                </div>\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</section>\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"fixed-footer\">\n");
      out.write("    <footer class=\"footer\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-sm-6 col-md-3 col-xs-12\">\n");
      out.write("                    <div class=\"footer_block\">\n");
      out.write("                        <a href=\"index.html\" class=\"f_logo\"><img src=\"images/logo.png\" class=\"img-responsive\" alt=\"logo\"></a>\n");
      out.write("                        <p>Aoluptas sit aspernatur aut odit aut fugit, sed elits quias horisa hinoe magni  magni dolores eos qui ratione volust luptatem sequised .</p>\n");
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
      out.write("                <div class=\"col-sm-6 col-md-2 col-xs-12\">\n");
      out.write("                    <div class=\"footer_block\">\n");
      out.write("                        <h4>Hot Links</h4>\n");
      out.write("                        <ul class=\"footer-links\">\n");
      out.write("                            <li> <a href=\"#\">Home</a> </li>\n");
      out.write("                            <li> <a href=\"#\">Jobs</a> </li>\n");
      out.write("                            <li> <a href=\"#\">About Us</a> </li>\n");
      out.write("                            <li> <a href=\"#\">Privacy</a> </li><li> <a href=\"#\">Contact Us</a> </li>\n");
      out.write("                            <li> <a href=\"#\">Term & Conditions</a> </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-6 col-md-4 col-xs-12\">\n");
      out.write("                    <div class=\"footer_block dark_gry\">\n");
      out.write("                        <h4>Recent Posts</h4>\n");
      out.write("                        <ul class=\"recentpost\">\n");
      out.write("                            <li> <span><a class=\"plus\" href=\"#\"><img src=\"images/footer/1.png\" alt=\"\" /><i>+</i></a></span>\n");
      out.write("                                <p><a href=\"#\">Fusce gravida tortor felis, ac dictum risus sagittis</a></p>\n");
      out.write("                                <h3>Sep 15, 2016</h3>\n");
      out.write("                            </li>\n");
      out.write("                            <li> <span><a class=\"plus\" href=\"#\"><img src=\"images/footer/2.png\" alt=\"\" /><i>+</i></a></span>\n");
      out.write("                                <p><a href=\"#\">Fusce gravida tortor felis, ac dictum risus sagittis</a></p>\n");
      out.write("                                <h3>Fab 10, 2016</h3>\n");
      out.write("                            </li>\n");
      out.write("                            <li> <span><a class=\"plus\" href=\"#\"><img src=\"images/footer/2.png\" alt=\"\" /><i>+</i></a></span>\n");
      out.write("                                <p><a href=\"#\">Fusce gravida tortor felis, ac dictum risus sagittis</a></p>\n");
      out.write("                                <h3>Fab 10, 2016</h3>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-6 col-md-3 col-xs-12\">\n");
      out.write("                    <div class=\"footer_block\">\n");
      out.write("                        <h4>Contact Information</h4>\n");
      out.write("                        <ul class=\"personal-info\">\n");
      out.write("                            <li><i class=\"fa fa-map-marker\"></i> 3rd Floor,Link Arcade Model Town, BBL, USA.</li>\n");
      out.write("                            <li><i class=\"fa fa-envelope\"></i> Support@domain.com</li>\n");
      out.write("                            <li><i class=\"fa fa-phone\"></i> (0092)+ 124 45 78 678 </li>\n");
      out.write("                            <li><i class=\"fa fa-clock-o\"></i> Mon - Sun: 8:00 - 16:00</li>\n");
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
      out.write("                                    <p>Copyright ©2016 - Opportunities A Mega Job Board Template - All rights Reserved. Made By <a href=\"http://themeforest.net/user/scriptsbundle\"> ScriptsBundle </a></p>\n");
      out.write("                                    <p>Reproduction of material from scriptsBundle without permission is strictly prohibited. </p>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-md-12 col-sm-12 col-xs-12 hidden-xs hidden-sm\">\n");
      out.write("                                    <ul class=\"footer-menu\">\n");
      out.write("                                        <li> <a href=\"#\">Jobs in australia</a> </li>\n");
      out.write("                                        <li> <a href=\"#\">Jobs in malaysia</a> </li>\n");
      out.write("                                        <li> <a href=\"#\">Jobs in england</a> </li>\n");
      out.write("                                        <li> <a href=\"#\">Jobs in saudi arabia</a> </li>\n");
      out.write("                                        <li> <a href=\"#\">Jobs in south africa</a> </li>\n");
      out.write("                                        <li> <a href=\"#\">Jobs in saudi Pakistan</a> </li>\n");
      out.write("                                    </ul>\n");
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
      out.write("        \n");
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
