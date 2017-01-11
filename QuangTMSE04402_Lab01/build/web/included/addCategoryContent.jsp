<%-- 
    Document   : addCategoryContent
    Created on : Nov 14, 2016, 7:17:54 PM
    Author     : Tran Minh Quang
--%>

<form name="addCategory" method="POST" action="AddCategory" class="form-horizontal">
    <p style="color:red">${message}</p>
    <div class="form-group">
        <label for="name" class="col-sm-2 control-label">Category </label>
        <div class="col-sm-10">
            <input type="text" name="category" class="form-control" id="name">
        </div>
    </div>
    <div class="form-group">
        <div class="col-sm-offset-1 col-sm-10">
            <button class="btn btn-github" type="submit">Add Category</button>
        </div>
    </div>
</form>
