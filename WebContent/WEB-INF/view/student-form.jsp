<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>

<body>

	<form:form action="processStudent" modelAttribute="student">
	
		First Name: <form:input path="firstName"/>
		<br>
		Last Name:  <form:input path="lastName"/>
		<br>
		Country: 
		<form:select path="country">
			<form:option value="GER" label="Germany"></form:option>
			<form:option value="FRA" label="France"></form:option>
			<form:option value="ENG" label="England"></form:option>
		</form:select>
		<br>
		
		City: 
		<form:select path="city">
			<form:options items="${student.city}" />
		</form:select>
		<br>
				
		<input type="submit" value="Submit">
		
	</form:form>



</body>
</html>