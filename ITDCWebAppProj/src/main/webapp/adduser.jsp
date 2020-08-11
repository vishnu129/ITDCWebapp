<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add User</title>
<style>
    .wrapper{
        background-color: rgba(202, 202, 202, 0.822);
        border-radius: 15px;
        text-align: center;
        margin: 100px 380px;
        padding:50px
    }
    .btn{
        margin:10px;
    }

</style>
</head>
<body style="background-image: url(images/bg.jpg);">
<div class="wrapper">
<form action="adduser">
		<table>
		<tr><td>
		User name: </td><td><input type="text" name="name" required></td>
		</tr>
		<tr><td>
		Email Id: </td><td><input type="email" name="email" required></td>
		</tr>
		<tr>
		<td>
		Password: </td><td><input type="text" name="password" required></td>
		</tr>
		</table>
		<div class="btn">
		<input type="submit" value="Register">
		</div>
		</form>
		</div>
</body>
</html>