<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form action="savepassword" method="post" modelAttribute="student">

		<label for="test"><b>UserName:*</b></label>
		<input type="text" name="studentName" id="studentName"
			placeholder="enter user name" required="required">
		<button type="submit" value="Submit">Submit</button>
	</form:form>
</body>
</html>