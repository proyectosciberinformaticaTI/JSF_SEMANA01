<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>JSP Ejemplo</title>
</head>
<body>
	<%
		out.println("Tu direccion Ip es " + request.getRemoteAddr());
	%>
	
	<form action="principal.jsp" method="post">
		Usuario <input type="text" name="usuario">
		Clave <input type="text" name="clave"> <br/>
		<input type="submit" name="Iniciar">
	</form>
	
</body>
</html>