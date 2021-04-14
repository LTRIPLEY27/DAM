<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="newser" method="post">  <!-- linea para adherir el servlet al archivo jsp -->  
		<label for="fnombre"> Nombre </label>
		
		<input type="text" id="fnombre" name="fnombre"> <!--  insercion del input de html -->
		<input type="submit" value="ingresa">
	</form> <!--  es imperativo que toda la codificacion vaya dentro del form que hace el llamado al servlet-->
</body>
</html>