<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
	<title>Login Details</title>
	<style>
		table{
			margin-left:350px;
			width: 50%;
			cellpadding: 2;
			border: 2px solid white;
		}
	</style>
</head>
<body style="background-color:midnightblue">

	<h1>Login Details</h1>
	<table border="2">
		<tr>
			<th>UserName</th><th>Password</th>
		</tr>
		
		<c:forEach var="u" items="${list}">
			<tr>
				<td>${u.username}</td>
				<td>${u.password}</td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>