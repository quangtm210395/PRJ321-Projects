
<section id="portfolio" class="bg-light-gray">
    <div class="container">
        <div class="row">
            <div class="col-lg-12 text-center">
                <h2 class="section-heading">Course Registration</h2>
                <h3 class="section-subheading text-muted">Enter your informations</h3>
            </div>
        </div>
        <div class="row">
            <div class="form">
                <form class="login-form" action="CourseControllerServlet" method="post" >
                    <p>${message}</p>
                    <input type="text" placeholder="Your full name" name="fullname">
                    <input type="text" placeholder="Your age" name="age">
                    Country: <select class="form-control" id="country" name="country">
                        <option  value="Vietnam">Vietnam</option>
                        <option value="US">US</option>
                        <option value="UK">UK</option>
                        <option value="Japan">Japan</option>
                        <option value="France">France</option>
                    </select>
                    Course: 
                    <select multiple class="form-control" id="course" name="course">
                        <option  value="C#">C#</option>
                        <option value="Java">Java</option>
                        <option value="C++">C++</option>
                        <option value="Python">Python</option>
                        <option value="Ruby onn rail">Ruby on rail</option>
                    </select>
                    
                    Language: <br>
                    Vietnamese<input type="checkbox" name="language" value="Vietnamese" checked>
                    English<input type="checkbox" name="language" value="English">
                    French<input type="checkbox" name="language" value="French">
                    <button type="submit">Submit</button>
                    <p> </p>
                    <a href="page1.jsp"> <button type="button">Cancel</button> </a>
                </form>
            </div>
        </div>
    </div>
</section>
