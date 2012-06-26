<%@page pageEncoding="UTF-8" isELIgnored="false" session="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@taglib prefix="f" uri="http://www.slim3.org/functions"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>temi Index</title>
</head>
<body>
<p>Hello temi Index !!!</p>
	<form method="post" action="nuovotema">
		 nome: <input type="text" name="nome" /><br>
		 descrizione: <input type="text" name="descrizione" /><br>
		    <input type="submit" value="Add"/> 		
	</form>

</body>
</html>
