<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
<meta name="description" content="">
<meta name="author" content="">
<link rel="icon" href="../../favicon.ico">

<title>Fixed Top Navbar Example for Bootstrap</title>

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css"
	integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7"
	crossorigin="anonymous">

<!-- Optional theme -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css"
	integrity="sha384-fLW2N01lMqjakBkx3l/M9EahuwpSfeNvV63J5ezn3uZzapT0u7EYsXMjQV+0En5r"
	crossorigin="anonymous">

<!-- Latest compiled and minified JavaScript -->
<link href="resources/css/style1.css" rel="stylesheet">

<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"
	integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS"
	crossorigin="anonymous"></script>
<!-- Custom styles for this template -->


</head>

<body>

	<!-- Fixed navbar -->
	<nav class="navbar navbar-default navbar-fixed-top">
		<div class="container">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed"
					data-toggle="collapse" data-target="#navbar" aria-expanded="false"
					aria-controls="navbar">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<img src="resources/images/intern.png" alt="Smiley face" height="80"
					width="300">
			</div>
			<div id="navbar" class="navbar-collapse collapse">
				<ul class="nav navbar-nav">



				</ul>
				
				<ul class="nav navbar-nav navbar-right">
					<li><a href=""><img src="resources/images/login.png" alt="Smiley face"
							height="60" width="60"></a></li>
					<li><a href="../navbar-static-top/"></a></li>
					
				</ul>
			</div>
			<!--/.nav-collapse -->
		</div>
	</nav>

	<div class="container">

		<!-- Main component for a primary marketing message or call to action -->
		<div class="row">
			<div class="jumbotron"></div>
		</div>

		<!-- /container -->
		<div class="row">
			<div class="col-md-4"></div>
			<div class="col-md-4"></div>
			<div class="col-md-4 user">
				<div id="loginbox" style="margin-left: 650px;"
					class="mainbox col-md-6 col-md-offset-3 col-sm-8 col-sm-offset-2">
					<div class="panel panel-info">
						<div class="panel-heading">
							<div class="panel-title">Sign In</div>

						</div>

						<div style="padding-top: 30px" class="panel-body">

							<div style="display: none" id="login-alert"
								class="alert alert-danger col-sm-12"></div>

							<form:form id="loginform" commandName="person"
								class="form-horizontal" role="form" action="loginpage"
								method="post">

								<div style="margin-bottom: 25px" class="input-group">
									<span class="input-group-addon"><i
										class="glyphicon glyphicon-user"></i></span>
									<!-- <input id="login-username" type="text" class="form-control" name="username" value="" placeholder="username or email">      -->
									<form:input type="text" path="userName" size="30"
										class="form-control" placeholder="User Name" />
										
								</div>
								<form:errors path="userName"/>

								<div style="margin-bottom: 25px" class="input-group">
									<span class="input-group-addon"><i
										class="glyphicon glyphicon-lock"></i></span>
									<!-- <input id="login-password" type="password" class="form-control" name="password" placeholder="password"> -->
									<form:input type="password" path="password" size="30"
										class="form-control" placeholder="Password" />
										
								</div>
								<form:errors path="password"/>
								<div style="margin-top: 10px" class="form-group">
									<div class="col-sm-4"></div>
									<div class="col-sm-4">
										<button type="submit" class="btn btn-primary  btn-block">Log
											In</button>
									</div>
									<div class="col-sm-4"></div>

								</div>



								<div class="form-group">
									<div class="col-md-6">
										<a href="usersignup.htm" class="btn btn-warning" role="button">
											User Sign Up </a>
									</div>
									<div class="col-md-6">
										<a href="employeesignup.htm" class="btn btn-warning"
											role="button" style="margin-right: 175px"> Employee Sign
											Up </a>
									</div>

								</div>
								<div><c:if test="${!empty requestScope.error}">
                <p style="color:red">UserName/Password did not match</p>
            </c:if></div>

							</form:form>



						</div>
					</div>
				</div>

			</div>


			<!-- Bootstrap core JavaScript
    ================================================== -->
			<!-- Placed at the end of the document so the pages load faster -->
			<script
				src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
			<script>
				window.jQuery
						|| document
								.write('<script src="../../assets/js/vendor/jquery.min.js"><\/script>')
			</script>
			<script src="../../dist/js/bootstrap.min.js"></script>
			<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
			<script src="../../assets/js/ie10-viewport-bug-workaround.js"></script>
</body>
</html>
