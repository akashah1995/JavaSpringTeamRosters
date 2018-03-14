<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action = '/TeamRoster/Create' method = 'POST'>
		<h3> Create a New Team </h3>
		Team Name: <input type = "text" name = "teamname">
		<input type = "submit" value = "Create">
	</form>
</body>
</html>