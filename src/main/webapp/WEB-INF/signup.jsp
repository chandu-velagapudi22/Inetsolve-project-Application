<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Welcome To InetSolve Regestration Page</h1>
	<form:form action="saveData" method="post" modetattribute="student">
		<input type="text" name="studentName" id="" placeholder="Enter UserName" required="required"/>
		<input type="text" name="course" id="course"placeholder="Enter Course" required="required"/>
	     <input type="email" name="email" id="email" placeholder="Enter email"required="required"/>
	     <input type="password" name="password" id="password"placeholder="Enter Password" required="required"/>
		<button type="submit" value="Submit">Submit</button>
			</form:form>
</body>
</html>