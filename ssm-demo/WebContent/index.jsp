<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>首页</title>
<link href="css/style.css" rel="stylesheet" type="text/css"/>
</head>
<body>
<div id="div1">
	<p>添加学生</p>
	<form id="f1" action="add" method="post">
		<input type="text" name="name" placeholder="输入姓名" />
		<br />
		<input type="text" name="hobby" placeholder="输入爱好" />
		<br>
		<input type="submit" value="提交" id="submit">
		<br>
	</form>
</div>
<div id="div2">
	<p>查询全部</p>
	<form action="findAll" method="post">
		<input type="submit" value="查询" />
	</form>
</div>
</body>
</html>