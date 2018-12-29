<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
	<title>View Employees</title>
	<style>
		table{
			margin-left:350px;
			width: 50%;
			cellpadding: 2;
			border: 2px solid black;
			color:white;
		}
	</style>
</head>
<body style="background-color:midnightblue">

	<h1>Employees List</h1>
	<table border="2">
		<tr>
			<th>Id</th><th>UserName</th><th>Password</th><th>DOJ</th><th>Email</th><th>Role</th><th>Project Id</th>
		</tr>
		
		<c:forEach var="u" items="${list1}">
			<tr>
				<td>${u.userId}</td>
				<td>${u.username}</td>
				<td>${u.password}</td>
				<td>${u.doj}</td>
				<td>${u.email}</td>
				<td>${u.role}</td>
				<td>${u.projectId}</td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>