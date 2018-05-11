<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="../css/bootstrap.min.css"/>
<link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css">
</head>
<body>
<div class="table-responsive">
<table class="table table-bordered table-striped table-hover">
	<thead>
     <tr class="info">
       <th>用户信息修改</th>
     </tr>
   </thead>
   <tbody>
     <tr>
       <td>用户名</td>
     </tr>
     <tr>
       <td><input type="text" value="${user.uname }"/></td>
     </tr>
     <tr>
       <td>密码</td>
     </tr>
     <tr>
		<td><input type="password" value="${user.upwd }"></td>
	<tr/>
	<tr>
       <td>城市</td>
     </tr>
	<tr>
		<td><input type="text" value="${user.city }"/></td>
	</tr>
	<tr>
       <td>生日</td>
    </tr>
    <tr>
		<td>
			<input type="text" value="<fmt:formatDate value="${user.birth }" pattern='yyyy-MM-dd'/>"/>
		</td>
	</tr>
	<tr>
		<td>
			<input class="btn btn-info" type="submit" value="修改"/>
		</td>
	</tr>
   </tbody>
 </table>
 </div>
</body>

</html>