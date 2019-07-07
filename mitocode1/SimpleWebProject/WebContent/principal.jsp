<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>JSP Principal</title>
</head>
<body>
	<%
		String usuario = request.getParameter("usuario");
		String clave = request.getParameter("clave");
		
		if(usuario.equalsIgnoreCase("mitocode") && clave.equalsIgnoreCase("code")){
			out.print("Bienvenido " + usuario);
		}else{
			out.print("Usuario/Clave incorrecto");
		}
	%>
	<br/>
	[JDK 1.8] Fecha y Hora del Sistema: <%=java.time.LocalDate.now()%>
	
</body>
</html>