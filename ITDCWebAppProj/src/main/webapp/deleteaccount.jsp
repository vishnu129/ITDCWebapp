<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete Account</title>
<style>
    .wrapper{
        background-color:#A28EDE;
        margin: 100px 300px 400px 300px;
        padding: 20px 20px;
        text-align: center;
        border-radius: 10px;
        font-size: 20px;
    }
    body{
        background-size:cover;                     
    	background-repeat:repeat-y;
    	background-position:center center; 
    	padding-bottom: 100px; 
    }
</style>
</head>
<body style="background-image: url(images/bg2.jpg);">
<div class="wrapper">
<form action="delete">
<h2>Are you sure you want to delete Account?</h2>
<div class="btn"> <input type="submit" value="Delete">
</div>
</form>
</div>
</body>
</html>