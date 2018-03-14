<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href = '/TeamRoster/NewPlayer'>New Player</a>
	<table>
		<tr>
			<th>First Name</th>
			<th>Last Name </th>
			<th>Age </th>
			<th>Actions</th>
		<tr>
		<% for (int i = 0; i < (int) request.getAttribute("teamlength"); i++){  %>
			<tr>
				<td> ${team.getPlayer(i).getFirstname()} </td>
				<td> ${team.getPlayer(i).getLastname()} </td>
				<td> ${team.getPlayer(i).getAge()}</td>
				<td>
					<form action = '/TeamRoster/Delete'>
						<input type = "hidden" name = "playerid" value = "${team.getPlayer(i).getId()}" >
						<input type = "submit" value = "delete">
					</form>
				</td>
			</tr>
		<% } %>
	</table>
	<a href = '/TeamRoster/Roster'> Home </a>

</body>
</html>