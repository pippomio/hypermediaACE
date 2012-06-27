<%@page pageEncoding="UTF-8" isELIgnored="false" session="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@taglib prefix="f" uri="http://www.slim3.org/functions"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>progetto Index</title>
</head>
<body>
<p>Hello progetto Index !!!</p>
	
		<form method="post" action="InserisciProgetto">
		 name: <input type="text" name="nome" /><br>
		 surname: <input type="text" name="descrizione" /><br>

		<%@taglib prefix="f" uri="http://www.slim3.org/functions"%>
		
			<select name="tema">
			
				<c:forEach var="tema" items="${listTemi}">
						
				
					<option ${f:select("tema", tema.nome)}> ${tema.nome} </option>
		
				</c:forEach>
			</select>
			
			
			<select name="partnerKey">
			
				<c:forEach var="partner" items="${listPartner}">
						
				
					<option ${f:select("partner", partner.partitaIva)}> ${partner.partitaIva} </option>
		
				</c:forEach>
			</select>
			
		<input type="submit" value="Add"/>	
	</form>
	



</body>
</html>
