<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Booking Successful</title>
</head>
<body>
<%@ page errorPage="error.jsp" %>
<jsp:useBean id="obj1" class="qrcode.InsertBean">
   <jsp:setProperty name="obj1" property="*" />
   </jsp:useBean>
<% obj1.conn();%> 

<center><h2>
Name Of Passenger : <jsp:getProperty property="fname" name="obj1"/> <jsp:getProperty property="lname" name="obj1"/><br><br>
Flying From : <jsp:getProperty property="leaving_from" name="obj1"/> To <jsp:getProperty property="going_to" name="obj1"/> <br><br>
Date Of Journey :<jsp:getProperty property="day" name="obj1"/>/<jsp:getProperty property="month" name="obj1"/>/<jsp:getProperty property="year" name="obj1"/> <br><br>
Class : <jsp:getProperty property="clas" name="obj1"/><br>   <br>
QR Code :- <br><img src="C:\\apache-tomcat-8.5.9\\webapps\\ROOT\\qrcode.png" width="100" height="100"><br><br>
</center>

<span style="float:left"></span>
<a href="index.html">Book Another Ticket </a>
<span style="float:right">
<a href="scan_qrcode.jsp">Scan The QR Code </a>
</body>
</html>