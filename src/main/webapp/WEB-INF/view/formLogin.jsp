<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Demo Servlet</title>
</head>
<body>

<c:import url="logout-parcial.jsp"></c:import>
<form method="get"   action="entrada"> 

<pre>
Login:  <input type="text" name = "login"> <input type="submit"> <input type=reset> Senha: <input type="password" name="senha"/><input type="hidden" name="acao" value="Login">
</pre>
</form>
</body>
</html>