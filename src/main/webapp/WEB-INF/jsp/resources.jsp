<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class="modal fade"  id="mymodal" >
    <div class="modal-dialog" >
        <div class="modal-content" >
       	   <div class="modal-header">
				<button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">&times;</span><span class="sr-only">Close</span></button>
				<h4 class="modal-title">用户信息修改</h4>
			</div>
			<div class="modal-body">
				
					<form role="form">
						<div class="form-group">
							<input type="text" class="form-control" placeholder="用户名">
						</div>
						<div class="form-group">
							<input type="password" class="form-control" placeholder="密码">
						</div>
						
						<div class="form-group">
						    <label class="radio-inline">
						      <input type="radio"  value="option1" name="sex">男
						    </label>
						    <label class="radio-inline">
						      <input type="radio"  value="option2" name="sex">女
						    </label>
					  	</div>
					  	
					  	<div class="form-group">
					  		<input type="text" class="form-control" placeholder="出生日期"/>
					  	</div>
					  	
					  	<div class="form-group">
					  		<input type="text" class="form-control" placeholder="城市"/>
					  	</div>
					  	
					  	<div class="form-group">
					  		<input type="text" class="form-control" placeholder="部门"/>
					  	</div>
				</form>
				
			</div>
			<div class="modal-footer">
				<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
				<button type="button" class="btn btn-primary">修改</button>
			</div>
        </div>
    </div>
</div>
</body>
</html>