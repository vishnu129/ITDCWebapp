<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Login</title>
<style>
	
	header
	{
		background-color: black;
		text-shadow: black;
		size: 100%;
		background-position: center;
		padding-top: 10px;
		padding-bottom: 10px;
		
	}
	header > h1{
		color:white;
		font-size: 50px;
		text-align: center;
		align-items: center;
		font-family:Asap,sams-serif;
		margin-bottom:0;
	}
	.wrapper{
		background-image: url("images/admin.jpg");
		background-size:     cover;                     
    	background-repeat:   no-repeat;
    	background-position: center center; 
    	padding-bottom: 500px; 
	}
	
	.formclass{
		background-color: blanchedalmond;
		border-radius: 20px;
		opacity: 80%;
		margin:0px 450px 20px 450px;
		padding:20px 70px 50px ;
		text-align: center;
	}
	.newuser{
		padding: 5px;
	}
	
	

	
</style>
</head>
<body>
	<header><h1>ITDC Application</h1></header>
	<div class="wrapper">
<br>
<br>
<br>
<br>
<div class="formclass">
<br>
         <h2>LogIn</h2>
		<form action="adminlogin">
		<table>
		<tr><td>
		AdminId: </td><td><input type="text" name="id" placeholder="AdminId" required></td>
		</tr>
		<tr>
		<td>
		Password: </td><td><input type="password" name="password" placeholder="Password" required></td>
		</tr>
		</table>
		<div class="newuser"></div>
		<input type="submit" value="LogIn">
		</form>
		</div>
	</div>
</div>
</body>
</html>