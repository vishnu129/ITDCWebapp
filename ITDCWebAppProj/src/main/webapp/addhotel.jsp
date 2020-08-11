<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Hotel</title>
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
    <form action="addhotel">
		<table>
		<tr><td>
		Hotel Id: </td><td><input type="text" name="id" required></td>
		</tr>
		<tr>
		<td>
		Hotel Name: </td><td><input type="text" name="name" required></td>
		</tr>
		<tr><td>
		State: </td><td><input type="text" name="state" required></td>
		</tr>
		<tr><td>
		District: </td><td><input type="text" name="district" required></td>
		</tr>
		<tr><td>
		Zip Code: </td><td><input type="text" name="zip" required></td>
		</tr>
		<tr><td>
		Rooms Available: </td><td><input type="text" name="room" required></td>
		</tr>
		<tr><td>
		Cost: </td><td><input type="text" name="cost" required></td>
		</tr>
		<tr><td>
		Rating: </td><td><input type="text" name="rating" required></td>
		</tr>
		<tr><td>
		Image: </td><td><input type="text" name="image"></td>
		</tr>
		<tr><td>
		Map: </td><td><input type="text" name="map"></td>
		</tr>
        </table>
        <div class="btn">
		<input type="submit" value="Add">
    </div>    
    </form>
    </div>

</body>
</html>