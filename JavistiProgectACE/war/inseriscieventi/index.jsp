<%@page pageEncoding="UTF-8" isELIgnored="false" session="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@taglib prefix="f" uri="http://www.slim3.org/functions"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>inseriscieventi Index</title>

<link rel="stylesheet" type="text/css" media="all" href="jsDatePick_ltr.min.css" />

		<script type="text/javascript" src="jsDatePick.min.1.3.js"></script>
		
		<script type="text/javascript">
		window.onload = function(){
			new JsDatePick({
				useMode:2,
				target:"inputField",
				dateFormat:"%Y-%m-%d"

			});
		};
		</script>
</head>
<body>
	<p> Inserisci evento </p>
		<form method="post" action="nuovoevento">
		 titolo: <input type="text" name="titolo" /><br>
		 descrizione: <input type="text" name="descrizione" /><br>
		 data: <input type="text" name="data_male"/><br>
		  data fatta bene:   <input type="text" size="12" name="data" id="inputField" />
		 
		
		<input type="submit" value="Add"/>	
	</form>

</body>
</html>
