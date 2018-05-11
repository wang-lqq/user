<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
    <meta name="viewport" content="width=device-width, initial-scale=1"/>
	<link rel="stylesheet" href="../css/bootstrap.min.css"/>
	<link rel="stylesheet" href="../css/bootstrap-theme.min.css"/>
    <title>Insert title here</title>
    <link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="http://libs.baidu.com/jquery/1.9.0/jquery.js"></script>
	<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
	<div class="panel panel-default">
		<div class="panel-heading text-center">
			<h2>用户管理</h2>
		</div>
		<div class="row text-center">
			<div class="col-md-12">
				<table class="table table-hover table-bordered table-striped">
				 <thead>
				 	<tr class="text-center info">
				 		<th>编号</th>
				 		<th>用户名</th>
				 		<th>密码</th>
				 		<th>性别</th>
				 		<th>生日</th>
				 		<th>城市</th>
				 		<th>部门</th>
				 		<th>操作</th>
				 	</tr>
				 </thead>
				 <tbody>
				 	<c:forEach items="${pageBean.dataList}" var="User">
				 		<tr>
				 			<td>${User.uuid }</td>
				 			<td>${User.uname }</td>
				 			<td>${User.upwd }</td>
				 			<td>${User.sex }</td>
				 			<td>
				 				<fmt:formatDate value="${User.birth }" pattern="yyyy-MM-dd"/>
				 			</td>
				 			<td>${User.city }</td>
				 			<td>${User.dept.dname }</td>
				 			<td>
				 				<a class="btn btn-info"  href="http://localhost:8080/management/user/modify/${User.uuid }">修改</a>
				 				<a class="btn btn-info" href="javascript:deleteUser(${User.uuid })">删除</a>
				 			</td>
				 		</tr>
				 	</c:forEach>
				 </tbody>
			    </table>
			</div>
		</div>
		<div class="panel-body text-center">
			<a class="btn btn-info" href="./1">首页</a>
			<a class="btn btn-info" href="./${pageBean.pageNow-1 }">上一页</a>
			<a class="btn btn-info" href="./${pageBean.pageNow+1 }">下一页</a>
			<a class="btn btn-info" href="./${pageBean.pageCount }">尾页</a>
		</div>
	</div>
</div>
<script type="text/javascript">
	function enitInfo(uuid){
		alert("error");
	}
	function deleteUser(uuid){
			var u={"uuid":uuid};
			$.ajax({
					async: false,
					type : "post",
					url : "http://localhost:8080/management/user/delete",
					dataType : 'json',
					data:JSON.stringify(u),
					success:function(data) {
						var d=data.deleteCount;
						alert(d);
					},
					error:function(data){
						alert("失败");
					},
				  });
	}
</script>
</body>
</html>