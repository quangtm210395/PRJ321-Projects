
<section id="portfolio" class="bg-light-gray">
    <div class="container">
        <div class="row">
            <div class="col-lg-12 text-center">
                <h2 class="section-heading">Login</h2>
                <h3 class="section-subheading text-muted">Enter your username and password</h3>
            </div>
        </div>
        <div class="row">
            <div class="form">
                <form class="register-form" action="LoginControllerServlet" method="post">
                    <input type="text" placeholder="name">
                    <input type="password" placeholder="password">
                    <input type="text" placeholder="email address">
                    <button type="submit">create</button>
                    <p class="message">Already registered? <a href="#">Sign In</a></p>
                </form>
                
                <form class="login-form" action="LoginControllerServlet" method="post">
                    <p>${message}</p>
                    <input type="text" placeholder="username" name="username">
                    <input type="password" placeholder="password" name="password">
                    <button type="submit">login</button>
                    <p class="message">Not registered? <a href="#">Create an account</a></p>
                </form>
            </div>
        </div>
    </div>
</section>
