<%-- 
    Document   : editProfileContent
    Created on : Nov 28, 2016, 11:57:01 PM
    Author     : Tran Minh Quang
--%>
<section class="content">
    <div class="row">

        <div class="col-md-9">
            <div class="nav-tabs-custom">
                <ul class="nav nav-tabs">
                    <li class="active"><a href="#basic" data-toggle="tab">Basic Information</a></li>
                    <li><a href="#cv" data-toggle="tab">Work Profile</a></li>
                </ul>
                <div class="tab-content">
                    
                    <!-- /.tab-pane -->
                    <div class="tab-pane active" id="basic">
                        <form class="form-horizontal" action="EditProfile" method="post">
                            <div class="form-group">
                                <label for="inputName" class="col-sm-2 control-label">Name</label>

                                <div class="col-sm-10">
                                    <input type="text" required class="form-control" id="inputName" name="name" placeholder="Name">
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="birthday" class="col-sm-2 control-label">Date of Birth</label>

                                <div class="col-sm-10">
                                    <input type="date" required class="form-control" name="birthdate" id="birthday">
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="inputPhone" class="col-sm-2 control-label">Name</label>

                                <div class="col-sm-10">
                                    <input type="text"  required class="form-control" id="inputPhone" name="phone" placeholder="Phone Number">
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="inputCity" class="col-sm-2 control-label">City</label>

                                <div class="col-sm-10">
                                    <input type="text"  required class="form-control" id="inputCity" name="city" placeholder="City">
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="indentNum" class="col-sm-2 control-label">Identification Number</label>

                                <div class="col-sm-10">
                                    <input type="text"  required class="form-control" id="indentNum" name="indentNum" placeholder="Identification Number">
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="address" class="col-sm-2 control-label">Address</label>

                                <div class="col-sm-10">
                                    <input type="text"  required class="form-control" id="address" name="address" placeholder="Address">
                                </div>
                            </div>
                            <div class="form-group">
                                <div class="col-sm-offset-2 col-sm-10">
                                    <button type="submit" class="btn btn-github">Save</button>
                                </div>
                            </div>
                        </form>
                    </div>
                    <!-- /.tab-pane -->

                    <div class="tab-pane" id="cv">
                        <form class="form-horizontal">
                            <div class="form-group">
                                <label for="inputName" class="col-sm-2 control-label">Name</label>

                                <div class="col-sm-10">
                                    <input type="email" class="form-control" id="inputName" placeholder="Name">
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="inputEmail" class="col-sm-2 control-label">Email</label>

                                <div class="col-sm-10">
                                    <input type="email" class="form-control" id="inputEmail" placeholder="Email">
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="inputName" class="col-sm-2 control-label">Name</label>

                                <div class="col-sm-10">
                                    <input type="text" class="form-control" id="inputName" placeholder="Name">
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="inputExperience" class="col-sm-2 control-label">Experience</label>

                                <div class="col-sm-10">
                                    <textarea class="form-control" id="inputExperience" placeholder="Experience"></textarea>
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="inputSkills" class="col-sm-2 control-label">Skills</label>

                                <div class="col-sm-10">
                                    <input type="text" class="form-control" id="inputSkills" placeholder="Skills">
                                </div>
                            </div>
                            <div class="form-group">
                                <div class="col-sm-offset-2 col-sm-10">
                                    <div class="checkbox">
                                        <label>
                                            <input type="checkbox"> I agree to the <a href="#">terms and conditions</a>
                                        </label>
                                    </div>
                                </div>
                            </div>
                            <div class="form-group">
                                <div class="col-sm-offset-2 col-sm-10">
                                    <button type="submit" class="btn btn-danger">Submit</button>
                                </div>
                            </div>
                        </form>
                    </div>
                    <!-- /.tab-pane -->
                </div>
                <!-- /.tab-content -->
            </div>
            <!-- /.nav-tabs-custom -->
        </div>

    </div>
</section>