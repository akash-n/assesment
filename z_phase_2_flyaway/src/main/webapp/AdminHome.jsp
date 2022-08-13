<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> Administer  Page</title>
<style>
body{
margin:0;
 

}
.head{
background-color :black;
color : white;
height : 50px;
}
h1{
padding-top : 10px;
font-family :"Brush Script MT", Brush Script Std, cursive;
} 
}
h2{
padding-top : 10px;
font-family : "Lucida Console", "Courier New", monospace; 
h2 {text-align: center;}

}
a{
margin : 5px 5px;
padding : 5px;
text-decoration : none;
}
h3{
h3 {text-align: center;}}
</style>

</head>
<body>

	<div class="head"><h1>FlyAway TO YOUR DREAMLAND</h1>
	</div>

<div><h2>
   <%  String email=(String)session.getAttribute("email"); 
   
   	 out.println("Welcome to Administrator Page");
  
   %>
</h2></div>
<hr>

<div class="topnav">
  <h3><a href="changePassword.jsp"style="text-decoration: none;color:black">Change Password</a>
  <a href="Places.jsp"style="text-decoration: none;color:black">List of Places</a>
  <a href="AirlineList.jsp"style="text-decoration: none;color:black">List of Airlines</a>
  <a href="FlightsList.jsp"style="text-decoration: none;color:black">List of Flights</a></h3>
 
</div>
<br>

 <button ><a href="Home.html"  style="text-decoration:none">Logout</a></button>

</body>
</html>