<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>查询全部</title>
<link href="">
</head>
<body>
	<div id="div1">
		<header>结果列表</header>
		<table border="1">
			<tr>
				<td>编号</td>
				<td>姓名</td>
				<td>爱好</td>
			</tr>
			<c:forEach items="${stuLists }" var="stu">
				<tr>
					<td>${stu.id }</td>
					<td>${stu.name }</td>
					<td>${stu.hobby }</td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>