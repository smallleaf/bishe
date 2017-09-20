<#assign ctx=request.contextPath/>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>上传毕业设计</title>

    <link   href="${ctx}/libs/bootstrap/css/bootstrap.min.css" rel="stylesheet"/>

</head>
<body>

<#--<form>-->
    <#--<div class="form-group">-->
        <#--<label >标题</label>-->
        <#--<input type="email" class="form-control" name="title">-->
    <#--</div>-->
    <#--<div class="form-group">-->
        <#--<label for="exampleInputPassword1">Password</label>-->
        <#--<input type="password" class="form-control" id="exampleInputPassword1" placeholder="Password">-->
    <#--</div>-->
    <#--<div class="form-group">-->
        <#--<label for="exampleInputFile">File input</label>-->
        <#--<input type="file" id="exampleInputFile">-->
        <#--<p class="help-block">Example block-level help text here.</p>-->
    <#--</div>-->
    <#--<div class="checkbox">-->
        <#--<label>-->
            <#--<input type="checkbox"> Check me out-->
        <#--</label>-->
    <#--</div>-->
    <#--<button type="submit" class="btn btn-default">Submit</button>-->
<#--</form>-->

<form enctype="multipart/form-data" method="post" action="/upload">
    图片<input type="file" name="file"/>
    <input type="submit" value="上传"/>
</form>
    <script src="${ctx}/libs/jquery/jquery-2.2.4.min.js"/>
    <script src="${ctx}/libs/bootstrap/js/bootstrap.min.js"/>
</body>
</html>