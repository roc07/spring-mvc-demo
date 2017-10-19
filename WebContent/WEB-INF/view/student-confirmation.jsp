<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>

<body>
<h1>
${student.firstName}
<br>
${student.lastName}
<br>
Country: ${student.getCountry()}
<br>
<ul>
	<c:forEach var="tempCit" items="${student.city}">
		<li> ${tempCit} </li>
	</c:forEach>
</ul>
<br>
Language: ${student.favoriteLanguage}

<br>
<ul>
	<c:forEach var="temp" items="${student.operSystem}">
		<li> ${temp} </li>
	</c:forEach>
</ul>

</h1>
</body>
</html>