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
<link href="resources/css/style3.css" rel="stylesheet">

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
				<img src="resources/images/intern.png" alt="Smiley face" height="80" width="300">
			</div>
			<div id="navbar" class="navbar-collapse collapse">
				<ul class="nav navbar-nav">



				</ul>
				
				<ul class="nav navbar-nav navbar-right">
					
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
				<div id="loginbox" style="margin-left: 350px;"
					class="mainbox col-md-6 col-md-offset-3 col-sm-8 col-sm-offset-2">
					<div class="panel panel-info">
						<div class="panel-heading">
							<div class="panel-title">Sign Up</div>

						</div>

						<div style="padding-top: 30px" class="panel-body">

							<div style="display: none" id="login-alert"
								class="alert alert-danger col-sm-12"></div>

							<form:form action="addjobseeker" method="post"
								commandName="jobseeker" role="form">
								<div><c:if test="${!empty requestScope.error}">
                <p style="color:red">UserName Already Exists</p>
            </c:if></div>
								<div style="margin-bottom: 25px" class="input-group">
									<span class="input-group-addon"><i
										class="glyphicon glyphicon-user"></i></span>
									<form:input path="userName" size="30" class="form-control"
										placeholder="Username" />
										   <form:errors path="userName"/>
								</div>

								<div style="margin-bottom: 25px" class="input-group">
									<span class="input-group-addon"><i
										class="glyphicon glyphicon-lock"></i></span>
									<form:input type="password" path="password" size="30" class="form-control"
										placeholder="Password" />
										<form:errors path="password"/>
								</div>
								<div style="margin-bottom: 25px" class="input-group">
									<form:input path="firstName" size="30" class="form-control"
										placeholder="First Name" />
										<form:errors path="firstName"/>
								</div>
								
								<div style="margin-bottom: 25px" class="input-group">
									<form:input path="lastName" size="30" class="form-control"
										placeholder="Last Name" />
										<form:errors path="lastName"/>
								</div>

								<!--  <div style="margin-bottom: 25px" class="input-group">
                                        <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                                        <input id="login-username" type="text" class="form-control" name="userName" value="" placeholder="username or email">                                        
                                    </div>
                                
                            <div style="margin-bottom: 25px" class="input-group">
                                        <span class="input-group-addon"><i class="glyphicon glyphicon-lock"></i></span>
                                        <input  type="password" class="form-control" name="password" id="password" placeholder="password">
                                    </div>
									                            <!--  <div style="margin-bottom: 25px" class="input-group">
                                        <span class="input-group-addon"><i class="glyphicon glyphicon-lock"></i></span>
                                        <input id="login-password" type="password" class="form-control" name="cfmPassword" id="cfmPassword" placeholder="re-enter password">
                                    </div>-->
								<!--  <div style="margin-bottom: 25px" class="input-group">
                                        
                                        <input id="login-username" type="text" class="form-control" name="firstName" value="" placeholder="First Name">                                        
                                    </div>
                                    <div style="margin-bottom: 25px" class="input-group">
                                        
                                        <input id="login-username" type="text" class="form-control" name="lastName" value="" placeholder="Last Name">                                        
                                    </div>-->






								<div style="margin-top: 10px" class="form-group">
									<!-- Button -->

									<div class="col-sm-12 controls">

										<button type="submit" class="btn btn-success">Create</button>

									</div>
								</div>



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
