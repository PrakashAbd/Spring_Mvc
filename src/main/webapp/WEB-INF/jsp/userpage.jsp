<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Creation</title>
<style>
form {
	text-align: left;
	width: 400px;
	height: 100px;
	padding-left: 38em;
}

td {
	width: 200px;
}

body {
	background-color: midnightblue;
	color: white;
	font-family: 'Franklin Gothic Medium', 'Arial Narrow', Arial, sans-serif;
}
</style>
</head>
<body>
	<form action="validate" >
		<fieldset>
			<legend>UserDetails</legend>
			<table>
				<tr>
					<td>User Id :</td>
					<td><input type="text" name="userId" /></td>
				</tr>
				<tr>
					<td>UserName :</td>
					<td><input type="text" name="username" /></td>
				</tr>
				<tr>
					<td>Password :</td>
					<td><input type="password" name="password" /></td>
				</tr>
				<tr>
					<td>Date-Of-Joining :</td>
					<td><input type="text" name="doj" /></td>
				</tr>
				<tr>
					<td>Email :</td>
					<td><input type="email" name="email" /></td>
				</tr>
				<tr>
					<td>Role :</td>
					<td><input type="text" name="role" /></td>
				</tr>
				<tr>
					<td>ProjectId :</td>
					<td><input type="text" name="projectId" /></td>
				</tr>
				<tr>
					<td><input type="submit" value="SUBMIT" /></td>
				</tr>
			</table>
			</fieldset>
	</form>

</body>
</html>