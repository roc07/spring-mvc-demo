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
		
<!-- 		City:  -->
<%-- 		<form:select path="city"> --%>
<%-- 			<form:options items="${student.city}" /> --%>
<%-- 		</form:select> --%>
<!-- 		<br> -->
		
<!-- 		Item:  -->
<%-- 		<form:select path="itemOptions"> --%>
<%-- 			<form:options items="${itemOptions}" /> --%>
<%-- 		</form:select> --%>
<!-- 		<br><br> -->
		City:
        <form:radiobuttons path="city" items="${student.city}"  />
        <br>
		Favorite Language:
		<br>
		<form:radiobutton path="favoriteLanguage" value="Java"/> Java 	
		<form:radiobutton path="favoriteLanguage" value="C#"/> C# 		
		<form:radiobutton path="favoriteLanguage" value="Python"/> Python 		
		
		<br>
		<form:checkbox path="operSystem" value="Win"/> Win
		<form:checkbox path="operSystem" value="Mac"/> Mac
		<form:checkbox path="operSystem" value="Dos"/> Dos	
		<input type="submit" value="Submit">
		
	</form:form>



</body>
</html>