<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<title>Customer Form</title>
<style type="text/css">
	.error{color:red}
</style>
</head>
<body>
	Fill out form. * required:
	<br>
	<form:form action="processForm" modelAttribute="customer">
	
		First Name: <form:input path="firstName" />
		<br>
		Last Name! (*): <form:input path="lastName" />
		
		<form:errors path="lastName" cssClass="error"></form:errors>		
		<br>
		Free passes: <form:input path="passes"/>
		<form:errors path="passes" cssClass="error"></form:errors>		
		<br>		
		Postal Code: <form:input path="postalCode"/>
		<form:errors path="postalCode" cssClass="error"></form:errors>		
		<br>		
		Course Code: <form:input path="courseCode"/>
		<form:errors path="courseCode" cssClass="error"></form:errors>		
		<br>		
			
		<input type="submit" value="Submit" />
	</form:form>

</body>
</html>
