<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Booking</title>
<style>
body{
margin : 0;
padding : 0;
color:sky blue;
}
.head{
background-color : #000;
color : #fff;
height : 50px;
}
h1{
	margin: auto;
	font-family : "Times New Roman", Times, serif;
	text-align : center;
}
span{
	margin: auto;
	font-family : "Times New Roman", Times, serif;
	text-align : center;
	font-size : 35px;
}
button{
	margin : 10px;
  	border-radius: 4px; 
	border:none;
	height: 30px;
	display : inline-block;
	font-size : 15px;
	font-width : bold;
	background-color: orange;
}
a{
	text-decoration : none;
	color : #fff;
}
.details-box{
	margin :auto;
	margin-top : 40px;
	width : 500px;
	border : 1px solid #ccc;
	box-shadow : 0 8px 12px 0px rgba(0,0,0,0.3);
	positive : absolute;
}
table {
  border-collapse: collapse;
  width: 60%;
}

th{
  text-align: left;
  padding: 8px;
}
td{
  text-align: right;
  padding: 8px;
}
tr:nth-child(even){border-bottom : 1px solid #ccc;}
tr:nth-child(odd){border-bottom : 1px solid #ccc;}
</style>
</head>
<body>
<div class="center">
<div class="head">
	<span>FlyAway-to you Dreamland</span>
	<button style="float:right;"><a href="/logout">Log out</a></button>
</div>
<div class="details-box">
<%
Object s=session.getAttribute("flightno");


String url="jdbc:mysql://localhost:3306/flyaway";
String  username="root";
String password="vishnu@3";
try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection connection=DriverManager.getConnection(url,username,password);
	
	String sqlQuery="select * from flightdetails where flightno=?";
	  PreparedStatement pstmt=connection.prepareStatement(sqlQuery);
	  
	//  pstmt.setString(1, no);
	pstmt.setObject(1, s);
	//  out.println(no);
	  
	  ResultSet rs=pstmt.executeQuery();
	  while(rs.next()){
		/*   out.println("Flightno:"+rs.getString("flightno"));
		  out.println("Origin is:"+rs.getString("origin"));
		  out.println("Destination is:"+rs.getString("destination"));
		  out.println("Departure time is:"+rs.getString("departure_time"));
		  out.println("Arrival time is:"+rs.getString("arrival_time"));
		  out.println("Fare is:"+rs.getString("fare"));   */
		  
		  %>
		  
		 <div>
		  <h2><b>Flight Booking Details</b></h2>
		  <table>
		  <tr><th align="center">Flight No. : </th><td><%=rs.getString("flightno")%></td></tr>
		  <tr><th align="center">Origin : </th><td><%=rs.getString("origin")%></td></tr>
		  <tr><th align="center">Destination : </th><td><%=rs.getString("destination")%></td></tr>
		  <tr><th align="center">Departure Time : </th><td><%=rs.getString("departure_time")%></td></tr>
		  <tr><th align="center">Arrival Time : </th><td><%=rs.getString("arrival_time")%></td></tr>
		  <tr><th align="center">Fare : </th><td><%=rs.getString("fare")%></td></tr>
		  </table>
		 </div>

	<%   }

} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	System.out.println("Some Error occured :"+ e);
}
%>
</div>
</div>
</body>
</html>