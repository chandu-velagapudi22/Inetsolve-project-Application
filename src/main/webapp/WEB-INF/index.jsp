<%@page import="javax.servlet.descriptor.TaglibDescriptor"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>InetSolve Project</title>
<style type="text/css">
input {
	background: aqua;
	align-content: center;
}
</style>
</head>
<body>
	<h1>Welcome To Inetsolve Page</h1>

	<form:form action="getform" method="post" modelAttribute="student">
		
		<label for="test"><b>UserName:*</b></label>
		 <input type="text" name="studentName" id="studentName" placeholder="enter user name" required="required">
		
			 <label for="test"><b>Password:*</b></label>
		<input type="password" name="password" id="password" placeholder="enter password" required="required">
		
		 <input type="submit" value="Submit"/>
		</form:form> 
		 <a href="forgotpassword">forgotPassword</a>
	
	<div align="right">
	<pre><a href="signUpData">signUp</a></pre>
	</div>	 
 
</body>
</html>