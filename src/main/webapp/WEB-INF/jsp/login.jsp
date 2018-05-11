<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
    <meta name="viewport" content="width=device-width, initial-scale=1"/>
	<link rel="stylesheet" href="../css/bootstrap.min.css"/>
    <title>login</title>
</head>
<body>
<div class="container">
      <form class="form-horizontal" action="../user/check" method="post">
      			<div class="row">
		        	<div class="col-md-3 col-md-offset-4">
		        		<h2 class="form-signin-heading">Please sign in</h2>
		        	</div>
		        </div>
		        <div class="row">
		        	<div class="col-md-3 col-md-offset-4">
		        		<input type="text" name="name" class="form-control" placeholder="userName" required autofocus>
		        	</div>
		        </div>
		        <div class="row">
		        	<div class="col-md-3 col-md-offset-4">
		        		<input type="password" name="pwd" class="form-control" placeholder="Password" required>
		        	</div>
		        </div>
		        
		        <div class="row">
		        	<div class="col-md-3 col-md-offset-4">
		        		<div class="checkbox">
				          <label>
				            <input type="checkbox" value="remember-me"> Remember me
				          </label>
				        </div>
		        	</div>
		        </div>
		        <div class="row">
		        	<div class="col-md-3 col-md-offset-4">
		        		<button class="btn btn-lg btn-primary btn-block" type="submit">登录</button>
		        	</div>
		        </div>
		        
      </form>
</div>
</body>
</html>