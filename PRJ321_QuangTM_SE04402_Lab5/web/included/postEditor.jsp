<%-- 
    Document   : postEditor
    Created on : Nov 10, 2016, 11:30:49 PM
    Author     : Tran Minh Quang
--%>


<form class="form-horizontal" action="PostSubmitProcess" method="post">
    <div class="form-group">
        <p class="login-box-msg">${message}</p>
        <label for="inputName" class="col-sm-2 control-label" >Title</label>

        <div class="col-sm-10">
            <input type="text" class="form-control" id="inputName" placeholder="Title" name="title">
        </div>
    </div>
    
    <div class="form-group">
        <label for="inputExperience" class="col-sm-2 control-label">Content</label>

        <div class="col-sm-10">
            <textarea class="form-control" id="inputExperience" name="content"></textarea>
        </div>
    </div>
    <div class="form-group">
        <label for="inputExperience" class="col-sm-2 control-label">State</label>
        <div class="col-sm-10">
            <select class="form-control select2 select2-hidden-accessible" id="inputExperience" name="state" style="width: 100%;" tabindex="-1" aria-hidden="true">
                <option selected="selected" value="Published">Publish</option>
                <option value="Drafted">Draft</option>
            </select>
        </div>
    </div>
    <div class="form-group">
        <div class="col-sm-offset-2 col-sm-10">
            <button type="submit" class="btn btn-danger">Submit</button>
        </div>
    </div>
</form>