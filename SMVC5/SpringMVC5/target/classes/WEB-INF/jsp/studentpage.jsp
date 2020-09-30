<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Login Page</title>
</head>
<body>
<h1>Student Login Page</h1>
<b style="color:blue;">Student ID</b>:${validationPage.id}<br/> 
Name of the Student: <i style="color:blue;">${validationPage.name }</i><br/>
Password: <i style="color:blue;">${validationPage.password}</i><br/>
Mail: <i style="color:blue;">${validationPage.email}</i><br/>
Gender:${validationPage.gender}<br/>
Subject: <i style="color:blue;">${validationPage.mode}</i><br/>

</body>
</html>