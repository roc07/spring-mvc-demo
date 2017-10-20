<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<!DOCTYPE html>
<html>
<head>
<title>Customer Confirmation</title>
</head>
<body>
	
The Customer is confirmed: ${customer.firstName} ${customer.lastName}
Number of free passes: ${customer.passes} <br>
zip: ${customer.postalCode}
<br>
course code: ${customer.courseCode}
</body>
</html>



