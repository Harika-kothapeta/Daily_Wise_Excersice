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
	
	<center><h3>Physician Registration Form</h3></center>


	<c:url var="action" value="/savephy"></c:url>
	<form:form action="${action}" method="post" commandName="phyForm"
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
				<td>Department:</td>
				<td><form:input path="dept" /><font color="red"><form:errors
							path="dept" /></td>
			</tr>
			
			<tr>
				<td>Education Qualification:</td>
				<td><form:input path="Education" /><font color="red"><form:errors
							path="Education" /></td>
			</tr>
			<tr>
				<td>Experience:</td>
				<td><form:input path="experience" /><font color="red"><form:errors
							path="experience" /></td>
			</tr>
			<tr>
				<td>State:</td>
				<td><form:input path="state" /><font color="red"><form:errors
							path="state" /></td>
			</tr>
			<tr>
				<td>Insurance Plan:</td>
				<td><form:input path="insuranceplan" /><font color="red"><form:errors
							path="insuranceplan" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="Register" /></td>
				<td><input type="submit" value="Reset" /></td>
			</tr>
		</table>
	</form:form>

</body>
</html>