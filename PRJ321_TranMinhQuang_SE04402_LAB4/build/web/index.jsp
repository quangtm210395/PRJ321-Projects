<%
    Object obj = session.getAttribute("username");
//    if (obj == null) {
//        response.sendRedirect("index.jsp");
//    }
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>

        <%@include file="included/headerScript.jsp" %>
        <title>My Page</title>

    </head>
    <body id="page-top" class="index">

        <!-- Navigation -->
        <nav id="mainNav" class="navbar navbar-default navbar-custom navbar-fixed-top">
            <div class="container">
                <!-- Brand and toggle get grouped for better mobile display -->
                <div class="navbar-header page-scroll">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                        <span class="sr-only">Toggle navigation</span> Menu <i class="fa fa-bars"></i>
                    </button>
                    <a class="navbar-brand page-scroll" href="#page-top">Home page</a>
                </div>
                <!-- Collect the nav links, forms, and other content for toggling -->
                <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                    <ul class="nav navbar-nav navbar-right">
                        <li class="hidden">
                            <a href="#page-top"></a>
                        </li>
                        <%
                            if (obj == null) {
                        %>
                        <li><a class="page-scroll" href="login.jsp">Login</a></li>
                            <%
                            } else {
                            %>
                        <li><a class="page-scroll"><%= (String) obj%></a></li>
                        <li><a class="page-scroll" href="logout.jsp">Log out</a></li>
                            <%
                                }
                            %>


                    </ul>
                </div>
                <!-- /.navbar-collapse -->
            </div>
            <!-- /.container-fluid -->
        </nav>

        <!-- Header -->
        <header>
            <div class="container">
                <div class="intro-text">
                    <%
                        if (session.getAttribute("first") == null) {
                    %>
                    <div class="intro-lead-in">Welcome to the board</div>
                    <%
                        session.setAttribute("first", "abc");
                    } else {
                    %>
                    <div class="intro-lead-in">Welcome back</div>
                    <%
                        }
                    %>

                    <div class="intro-heading">Tran Minh Quang</div>
                    <%                        
                        if (obj != null) {
                    %>
                    <a href="profile.jsp"><div class="intro-lead-in">Click here to see user information</div></a>
                    <a href="userCounter.jsp"><div class="intro-lead-in">Click here to see all logged in users</div></a>
                    <%
                        } else {
                    %>
                    <div class="intro-lead-in">You must login first</div>
                    <%
                        }
                    %>
                    <!--<a href="#services" class="page-scroll btn btn-xl">Tell Me More</a>-->
                </div>
            </div>
        </header>

        <%@include file="included/footer.jsp" %>
    </body>
</html>