<%@page pageEncoding="UTF-8" isELIgnored="false" session="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@taglib prefix="f" uri="http://www.slim3.org/functions"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>joinprogevent Index</title>
</head>
<body>
<p>Hello joinprogevent Index !!!</p>
	  <form method="post" action="nuovapresentazione">
		
			<select name="evento">
			
				<c:forEach var="evento" items="${listaEventi}">
					<option ${f:select("evento", evento.id_evento)}> ${evento.id_evento} </option>
				</c:forEach>
		   </select>
		   
		   <select name="progetto">
		   		<c:forEach var="progetto" items="${listaProgetti}">
					<option ${f:select("progetto", progetto.titolo)}> ${progetto.titolo} </option>
				</c:forEach>
			</select>
			
		<input type="submit" value="Add"/>	
	</form>


</body>
</html>
