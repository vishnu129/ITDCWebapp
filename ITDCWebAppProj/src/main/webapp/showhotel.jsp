<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hotel</title>
<style>
    .wrapper{
        display: grid;
        grid-template-columns:repeat(2, 50%);
        grid-template-rows:repeat(2, 2 fr);
        grid-gap:1em;

    }
    .hotel{
        margin-top: 30px;
        background-color: white;
        text-align: center;
        border-radius: 10px;
    }
    .image{
    padding:20px 20px;

    }
    .map
    {
    padding:20px 20px;
    }
   
    body{
        background-color: black;
    }
</style>
</head>
<body>
<div class="wrapper">
    <div class="image">
        <img alt="hotelimage" src= "${hotel.getImage()}" style="width:570px;height:470px;">
        </div>

<div class="hotel">
<form action = "bookhotel">
			<input type="hidden" name="id" value="${hotel.getId()}">
			<h2>${hotel.getName()}</h2>
			<h4>State : ${hotel.getState()}</h4>
			<h4>District : ${hotel.getDistrict()}</h4>
			<h4>Zip : ${hotel.getZip()}</h4>
			<h4>Rooms : ${hotel.getRoom()}</h4>
			<h4>Cost Per Night : ${hotel.getCost()} Rs</h4>
			<h4>Rating : ${hotel.getRating()}/5</h4>
			
			
		</form> 
</div>

<div class="map">
<iframe src="${hotel.getMap()}" 
        width="570" height="470" frameborder="0" style="border:0;"
         allowfullscreen="" aria-hidden="false" tabindex="0">
        </iframe>
</div>
</div>

</body>
</html>