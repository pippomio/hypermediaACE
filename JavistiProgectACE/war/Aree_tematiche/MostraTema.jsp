<%@page pageEncoding="UTF-8" isELIgnored="false" session="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@taglib prefix="f" uri="http://www.slim3.org/functions"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>aree_tematiche MostraTema</title>
</head>
<body>
<p>Hello aree_tematiche MostraTema !!!</p>
	        
	        <p> BENVENUTO NEL TEMA:       ${tema.nome}  </p>
	        Il tema riguarda:
	        ${tema.descrizione}
	        
	        E sono stati ottenuti i seguenti:
	        
	        <c:forEach var="risultato" items="${risultatiTema}">
						
			   <p> <p>
					nome risultato :  ${risultato.titolo}  <br>
					descrizione evento:  ${risultato.descrizione} <br>
					

		   </c:forEach>
</body>
</html>
