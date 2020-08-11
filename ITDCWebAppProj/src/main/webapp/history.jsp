<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>History</title>
<style type="text/css">
table, th, td {
border:2px solid black;
width:auto;
border-collapse:collapse;
text-align:center;
}
</style>
</head>
<body bgcolor="white">


<h3>
<table>
<tr>
<th>Hotel id</th>
<th>Rooms</th>
<th>CheckIn Date</th>
<th>CheckOut Date</th>
<th>Status</th>
</tr>
<c:forEach var="h" items="${history}">
    <tr>
    <td style="width:20%"><c:out value="${h.getHotelid()}  "></c:out></td>
    <td style="width:20%"><c:out value="${h.getRooms()}  "></c:out></td>
    <td style="width:20%"><c:out value="${h.getStartdate()} "></c:out></td>
    <td style="width:20%"><c:out value="${h.getEnddate()} "></c:out></td>
    <c:if test="${h.getStatus()==1}">
    <td style="width:20%; background-color:#62FA0F"><c:out value="Booked"></c:out></td>
    <td> <form action="cancel"> <input type="hidden" name="id" value="${h.getId()}"><input type="submit" value="Cancel"> </form></td>
    </c:if>
    <c:if test="${h.getStatus()==2}">
    <td style="width:20% ;background-color:#E16B5F"><c:out value="Cancel"></c:out></td>
    </c:if>
    <c:if test="${h.getStatus()==3}">
    <td style="width:20% ;background-color:#BCB8B8"><c:out value="History"></c:out></td>
    </c:if>
    </tr>
</c:forEach>  
</table>
</h3>


</body>
</html>

