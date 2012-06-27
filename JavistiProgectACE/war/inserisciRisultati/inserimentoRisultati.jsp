<%@page pageEncoding="UTF-8" isELIgnored="false" session="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@taglib prefix="f" uri="http://www.slim3.org/functions"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>inserisciRisultati Index</title>
</head>
<body>
	<form method="post" action="MettiDatiRisultati">
		
	
			
		 titolo: <input type="text" name="titolo" /><br>
		 breve descrizione: <input type="text" name="descrizione" /><br>
		 
		  <select name="progetto">
		   		<c:forEach var="progetto" items="${progetti}">
					<option ${f:select("progetto", progetto.titolo)}> ${progetto.titolo} </option>
				</c:forEach>
			</select>
			
			<select name="id_tema">
		   		<c:forEach var="tema" items="${temi}">
					<option ${f:select("tema", tema.id_tema)}> ${tema.nome} </option>
				</c:forEach>
			</select>
		
		<input type="submit" value="Add"/>	
	</form>
</body>
</html>
