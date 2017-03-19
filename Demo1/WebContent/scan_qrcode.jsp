<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Passenger Information</title>
</head>
<body>
<jsp:useBean id="retv" class="qrcode.RetrieveBean"></jsp:useBean>
<% retv.ret();%>
<center>
<h1>Adhar Card Details</h1><br><br>
<h3>
Name :- <jsp:getProperty property="name" name="retv"/><br><br>
Father Name :- <jsp:getProperty property="father_name" name="retv"/><br><br> 
Year Of Birth :- <jsp:getProperty property="yob" name="retv"/><br><br>
Gender :- <jsp:getProperty property="gender" name="retv"/><br><br>
Address :- <jsp:getProperty property="address" name="retv"/><br><br>

	
</body>
</html>