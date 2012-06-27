<%@page pageEncoding="UTF-8" isELIgnored="false" session="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@taglib prefix="f" uri="http://www.slim3.org/functions"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Aree_tematiche TutteLeAree</title>
</head>
<body>
<p>Hello Aree_tematiche TutteLeAree !!!</p>

		 <c:forEach var="tema" items="${listaTemi}">
 
			 <p> <p>
				  nome evento :  ${tema.nome}  <br>
				  descrizione evento:  ${tema.descrizione} <br>
				  <a href="MostraTema?id_tema=${tema.id_tema}"> Vai a: ${tema.nome}  </a>  <br>

		 </c:forEach>

</body>
</html>
