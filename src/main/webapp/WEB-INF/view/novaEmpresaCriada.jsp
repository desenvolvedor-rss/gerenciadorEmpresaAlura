<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<body>

<c:import url="logout-parcial.jsp"></c:import>

<h1> 
<c:if test="${not empty empresa }">
 Empresa ${ empresa } foi cadastrada com Sucesso! 
</c:if>

<c:if test="${empty empresa }">
 Nenhuma empresa cadastrada! 
</c:if>
 
</h1>
</body>
</html>

