<%-- 
    Document   : body
    Created on : Dec 2, 2016, 1:55:37 AM
    Author     : WindyKiss
--%>


</head>
<%
    String usName = "";
    if (session.getAttribute("fullName") != null) {
        usName = (String) session.getAttribute("fullName");
        usName = usName.substring(0, usName.indexOf(" "));
    }
%>
<body>
    <div class="page">
        <div id="spinner">
            <div class="spinner-img"> <img alt="Opportunities Preloader" src="images/loader.gif" />
                <h2>Please Wait.....</h2>
            </div>
        </div>
        <nav id="menu-1" class="mega-menu fa-change-black" data-color=""> 
            <section class="menu-list-items container"> 
                <ul class="menu-logo">
                    <li> <a href="index.jsp"> <img src="images/logo.png" alt="logo" class="img-responsive"> </a> </li>
                </ul>
                <ul class="menu-links pull-right">
                    <li class="no-bg"><a href="postJob.jsp" class="p-job"><i class="fa fa-plus-square"></i> Post a Job</a></li>
                        <%
                            if (session.getAttribute("userID") == null) {


                        %>
                    <li class="no-bg login-btn-no-bg"><a href="login.jsp" class="login-header-btn"><i class="fa fa-sign-in"></i> Log in</a></li>
                        <%                    } else {

                        %>
                    <li class="profile-pic">
                        <a href="javascript:void(0)"> <img src="images/admin.jpg" alt="user-img" class="img-circle" width="36"><span class="hidden-xs hidden-sm"><%=usName%> </span><i class="fa fa-angle-down fa-indicator"></i> </a>
                        <ul class="drop-down-multilevel left-side">
                            <li><a href="userInfomation.jsp"><i class="fa fa-user"></i> My Profile</a></li>
                            <li><a href="jobGotOffer.jsp"><i class="fa fa-mail-forward"></i> Your Job got Offered</a></li>
                            <li><a href="LogoutServlet"><i class="fa fa-power-off"></i> Logout</a></li>
                        </ul>
                    </li>
                    <%                        }
                    %>
                </ul>
            </section>
        </nav>
        <div class="clearfix"></div>

