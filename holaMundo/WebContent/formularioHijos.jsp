<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="/css/estilos.css">

<title>Insert title here</title>
</head>
<body>
	<%@ include file="formulario.html" %>
	<%for (int i=0;i<10;i++){ %>
		<%if(i%2==0){ %>
			<h2 style="color:red;"> Esto se repite <%=i%> veces </h2>
		<%}else{ %>
			<h2 style="color:green;"> Esto se repite <%=i%> veces </h2>
		<%} %>
	<%} %>
	
	<%ArrayList<String> nombres=(ArrayList<String>)request.getAttribute("listaNombres"); %>
	<%if (nombres!=null){ %>
		<%for(int i=0;i<nombres.size();i++){ %>
			
			<h2><%=nombres.get(i) %></h2>
		
		<%} %>
	
	<%} %>
	
</body>
</html>













