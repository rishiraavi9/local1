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
				<img src="${pageContext.request.contextPath}/resources/images/intern.png" alt="Smiley face" height="80" width="300">
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


		<!-- /container -->

		<div class="col-md-4 user" style="margin-top: 25px">
			<div id="loginbox" style="margin-left: 350px;"
				class="mainbox col-md-6 col-md-offset-4 col-sm-8 col-sm-offset-3">
				<div class="panel panel-info">
					<div class="panel-heading">
						<div class="panel-title">Build your Job Posting</div>

					</div>

					<div style="padding-top: 30px" class="panel-body">

						<div style="display: none" id="login-alert"
							class="alert alert-danger col-sm-12"></div>

						<form:form id="loginform" class="form-horizontal" role="form"
							action="jobpost" commandName="job">


							<div style="margin-bottom: 25px" class="input-group">

								<input id="login-username" type="text" class="form-control"
									name="companyName" path="companyName"
									value="${sessionScope.userAccount.companyName}"
									placeholder="Company Name"/>
									   <form:errors path="companyName"/>
							</div>
							<div class="form-group">
								<span style="margin-left: 15px; font-weight: bold;">Industry</span>
								<select class="form-control" name="industry"
									style="font-size: 10pt; height: 35px; width: 300px; margin-left: 15px"
									path="industry">
									<option>Information Systems</option>
									<option>Computer Science</option>
									<option>Electronics and Communication Engineering</option>
									<option>Information Assurance</option>
								</select> <br>

							</div>

							<div style="margin-bottom: 25px" class="input-group">

								<input id="login-username" type="text" path="jobTitle"
									class="form-control" name="jobTitle" value="" path="jobTitle"
									placeholder="Job Titile">
									<form:errors path="jobTitle"/>
							</div>
							<div class="form-group">
								<span style="margin-left: 15px; font-weight: bold;">Experience</span>
								<select class="form-control" name="experience"
									style="font-size: 10pt; height: 35px; width: 300px; margin-left: 15px"
									value="${sessionScope.typeofjob}" path="experience">
									<option>Internship</option>
									<option>Co-op</option>
									<option>Associate</option>
									<option>Senior</option>
								</select> <br>

							</div>
							<div class="form-group">
								<span style="margin-left: 15px; font-weight: bold;">Job
									Function</span> <select class="form-control" name="jobFunction"
									path="jobFunction"
									style="font-size: 10pt; height: 35px; width: 300px; margin-left: 15px">
									<option>Design</option>
									<option>Information Technology</option>
									<option>Product Management</option>
									<option>Research</option>
								</select> <br>

							</div>
							<div class="form-group">
								<span style="margin-left: 15px; font-weight: bold;">Employment
									Type</span> <select class="form-control" path="jobFunction"
									style="font-size: 10pt; height: 35px; width: 300px; margin-left: 15px">
									<option>Full Time</option>
									<option>Part Time</option>
									<option>Contract</option>
									<option>Temporary</option>
								</select> <br>

							</div>
							<div class="form-group" style="margin-left: 0px">

								<form:textarea class="form-control" rows="4" id="comment"
									path="jobDescription" name="jobDescription"
									placeholder="Job Description"></form:textarea>
									<form:errors path="jobDescription"/>
							</div>






							<div style="margin-top: 10px" class="form-group">
								<!-- Button -->

								<div class="col-sm-12 controls">
									<button class="btn  btn-primary postjobbutton"
										style="margin-left: 150px" type="submit">Post Job</button>


								</div>
							</div>



						</form:form>



					</div>
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
