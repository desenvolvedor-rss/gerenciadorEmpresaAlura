<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:url value="/entrada" var="linkEntradaServlet"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Demo Servlet</title>
</head>
<body>

<c:import url="logout-parcial.jsp"></c:import>
<form method="post"   action="${linkEntradaServlet}"> 

<pre>
Insira seu nome:  <input type="text" name = nome value="${empresa.nome}">
<input type="submit"/> <input type=reset/>
<br>
Data Abertura: <input type="text" name="data" value="<fmt:formatDate value="${empresa.dataAbertura }" pattern="dd/MM/yyyy"/>"/>
<input type="hidden" name="id" value="${empresa.id }">
<input type="hidden" name="acao" value="AlteraEmpresa">
<input type="submit"/>
</pre>
</form>
</body>
</html>