<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Bill</title>
<style>
    .bill{
        text-align: center;
        border: 1px solid black;
        margin: 100px 400px;
        border-radius: 10px;
        background-color: rgb(129, 153, 221);
    }
    
</style>
</head>
<body style="background-image: url(images/bg.jpg);">
<div class="bill">
    
<h1>Room booked</h1>
<h2>Hotel ID: ${details.getHotelid()}</h2>
<h2>No of Rooms: ${details.getRooms()}</h2>
<h2>CheckIn Date: ${details.getSdate()}</h2>
<h2>CheckOut Date: ${details.getEdate()}</h2>
<h2>Amount: ${bill} Rs</h2>
</div>
</body>
</html>