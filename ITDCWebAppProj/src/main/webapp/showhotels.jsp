<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hotels</title>
</head>
<style>
</style>

<body style="background-color: black">  
<c:forEach var="hotel" items="${list}">


<div align="center" style="width: 300px; float:left; height:300px; margin:30px;background-color:white">
	
		<form action = "showhotel">
			<input type="hidden" name="id" value="${hotel.getId()}">
			<h2><input type="hidden" name="name" value="${hotel.getName()}">${hotel.getName()}</h2>
			<h4><input type="hidden" name="state" value="${hotel.getState()}"> State : ${hotel.getState()}</h4>
			<h4><input type="hidden" name="district" value="${hotel.getDistrict()}"> District : ${hotel.getDistrict()}</h4>
			<h4><input type="hidden" name="zip" value="${hotel.getZip()}"> Zip : ${hotel.getZip()}</h4>
			<h4><input type="hidden" name="room" value="${hotel.getRoom()}"> Rooms : ${hotel.getRoom()}</h4>
			<h4><input type="hidden" name="cost" value="${hotel.getCost()}"> Cost Per Night : ${hotel.getCost()} Rs</h4>
			<h4><input type="hidden" name="rating" value="${hotel.getRating()}"> Rating : ${hotel.getRating()}/5</h4>
			
			<input type ="submit" value="Show">
		</form>  
	 <br>
	</div>
	
</c:forEach>
		
</body>
</html>