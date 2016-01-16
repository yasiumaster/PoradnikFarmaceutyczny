<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
	<title>Poradnik Farmaceutyczny</title>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
	<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
	<link href="<c:url value="/resources/static/css/demo.css" />" rel="stylesheet">
	<link href="<c:url value="/resources/static/css/menu.css" />" rel="stylesheet">
	<script src="<c:url value="/resources/static/js/menu.js" />"></script>


	<div id='cssmenu'>
		<ul>
			<li class='rightside'><a href="/user/welcomePage.html"><span>Logowanie</span></a></li>
			<%--<li class='rightside'><a href="/admin/welcomePage.html"><span>Login as admin</span></a></li>--%>
			<li class='rightside'><a href="/registerPage.html"><span>Rejestracja</span></a></li>
		</ul>
	</div>

</head>

<body>


<div class="container">
	<div class="jumbotron">


		<h1>Poradnik Farmaceutyczny</h1>


	</div>

	<div class="row">
		<div class="col-sm-4">
			<h3>Znajdz szybko lek</h3>
			<img src="/resources/static/images/leki.png">
		</div>
		<div class="col-sm-4">
			<h3></h3>
			<img src="/resources/static/images/farmaceuta.png">
		</div>
		<div class="col-sm-4">
			<h3>Sprawdz statystyki</h3>
			<img src="/resources/static/images/samplechart1.png">
		</div>
	</div>
</div>

</body>
</html>