<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center><h3>Patient Registration Form</h3></center>
<c:url var="action" value="/savepat"></c:url>
	<form:form action="${action}" method="post" commandName="patForm"
		novalidate="novalidate">
		<table>
			<tr>
				<td>First Name:</td>
				<td><form:input path="fname" /><font color="red"><form:errors
							path="fname" /></td>
			</tr>
			<tr>
				<td>Last Name:</td>
				<td><form:input path="lname" /><font color="red"><form:errors
							path="lname" /></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><form:input path="password" /><font color="red"><form:errors
							path="password" /></td>
			</tr>
			
			<tr>
				<td>Date of Birth:</td>
				<td><form:input type="date" path="dob" /><font color="red"><form:errors
							path="dob" /></td>
			</tr>
			<tr>
				<td>Email:</td>
				<td><form:input path="email" /><font color="red"><form:errors
							path="email" /></td>
			</tr>
			<tr>
				<td>Contact Number:</td>
				<td><form:input path="contact_number" /><font color="red"><form:errors
							path="contact_number" /></td>
			</tr>
			<tr>
				<td>State:</td>
				<td><form:input path="state" /><font color="red"><form:errors
							path="state" /></td>
			</tr>
			<tr>
				<td>Insurance Plan:</td>
				<td><form:input path="insurance_plan" /><font color="red"><form:errors
							path="insurance_plan" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="Add Patient" /></td>
			</tr>
			<a href="redirect">Home</a>
		</table>
	</form:form>
</body>
</html>