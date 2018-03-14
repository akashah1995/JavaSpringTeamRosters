<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Roster</title>
</head>
<body>
<%@ page import="java.util.*" %>
<%@ page import = "com.codingdojo.teamroster.models.*" %>
	<h3>Prototype Roster</h3>
	<a href = '/TeamRoster/NewTeam'>New Team</a>
	<table>
		<tr>
			<th>Team</th>
			<th>Players</th>
			<th>Action</th>
		<tr>
		<% if (session.getAttribute("teaminfo") != null){ %>
		<% ArrayList <Team> teaminfo = (ArrayList <Team>) session.getAttribute("teaminfo");%>
		<% int teamcount = teaminfo.size(); %>
		<% for (int i = 0; i  < teamcount; i++){ %>
			<tr>
			<td>  ${sessionScope.teaminfo.get(i).getName()} </td>
				  <% System.out.println(teaminfo.get(i).getName()); %>
			<td>  ${sessionScope.teaminfo.get(i).getPlayers().size() } </td>
			<td> 
				<form action = '/TeamRoster/DeleteTeam' method = 'POST'>
					<input type = "hidden" name = "teamid" value = "${teaminfo.get(i).getId()}" >
					<input type = "submit" value = "delete">
				</form>
			
			 </td>
			</tr>
		<% } %>
		<% } %>
			
	</table>

</body>
</html>