<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login</title>
</head>
<body>
<h2>My Login Form</h2>
<form id="loginForm" method="post" action="/login">
<label>id</label>
<input type="text" name="id">

<label>password</label>
<input type="text">

<br>
<input type="submit" name="登录">
<input type="reset"  name="清除">

</form>
</body>
</html>