<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Options</title>
<style type="text/css">
table, th, td {
border:0px solid black;
width:100%;
border-collapse:collapse;
padding: 5px 1px 2px;
}
</style>
<style>
.button {
 border-width: 2px;
  width:200px;
  border-color:green;
  border-radius: 10px;
  color: white;
  padding: 5px 32px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 19px;
  margin: 4px 2px;
  cursor: pointer;
  background-color: black;
  opacity: 65%;
}
body{
    background-size:     cover;                     
    	background-repeat:   no-repeat;
    	background-position: center center; 
    	padding-bottom: 500px; 
}
header{
    margin: 0px 0px 5px ;
    padding: 5px 5px;
    background-color: black;
    opacity:70%;
}
h1{
    text-align: center;
    color: blanchedalmond;
}

</style>
</head>
<body style="background-image: url(images/usop.jpg);">
    <header>
    <h1>User Options</h1>
   </header>

<table>



<tr><td><br></td></tr>
<tr><td></td></tr>

<tr><td>	<form>
<button class="button" type="submit" name="btn" formaction="showall" >See Hotels </button>
</form> </td></tr>
<tr>

<tr><td>	<form>
<button class="button" type="submit" name="btn" formaction="history" >Booking History </button>
</form> </td></tr>
<tr>

<tr><td>	<form>
<button class="button" type="submit" name="btn" formaction="deleteaccount.jsp" >Delete Account</button>
</form> </td></tr>
<tr>
<tr><td>	<form>
<button class="button" type="submit" name="btn" formaction="home" >Logout </button>
</form> </td></tr>
<tr>


</table>


</body>
</html>