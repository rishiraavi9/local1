<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
<link href="${pageContext.request.contextPath}/resources/css/style5.css" rel="stylesheet">

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
		<div class="row">
			<div class="jumbotron"></div>
		</div>
		<div class="row">
			<div class="col-md-4">
				<div class="col-md-4 user">
					<div id="loginbox" style="margin-left: -40px;"
						class="mainbox col-md-6 col-md-offset-3 col-sm-8 col-sm-offset-2">
						<div class="panel panel-info">
							<div class="panel-heading">
								<div class="panel-title">Welcome ${sessionScope.empAccount.firstName}  </div>
								<div class="panel-title">Are You Hiring </div>

							</div>

							<div style="padding-top: 30px" class="panel-body">

								<div style="display: none" id="login-alert"
									class="alert alert-danger col-sm-12"></div>
<form action="${pageContext.request.contextPath}/postjob" method="get" role="form">
<input type="hidden" name="postjob" action="postjob" value=${sessionScope.userAccount }/>
								<button type="submit" class="btn btn-primary btn-block">Post Job</button>
<a href="${pageContext.request.contextPath}/redirect.htm" class="btn btn-primary btn-block">View Posted Jobs</a>
<a href="${pageContext.request.contextPath}/logout.htm" class="btn btn-primary btn-block">Log Out</a> 
</form>
							</div>
						</div>
					</div>

				</div>
			</div>
			<!--  <div class="col-md-8">
				<div class="col-md-4 user1">
					<div id="loginbox" style="margin-left: -40px;"
						class="mainbox col-md-6 col-md-offset-3 col-sm-8 col-sm-offset-2">
						<div class="panel panel-info">
							<div class="panel-heading">
								<div class="panel-title">Jobs Posted</div>

							</div>

							<div style="padding-top: 30px" class="panel-body">

								<div style="display: none" id="login-alert"
									class="alert alert-danger col-sm-12"></div>
 <table class="table table-hover">
            <tr>
                <td><b>Job Id</b></td>
                <td><b>Title</b></td>
                <td><b>Industry</b></td>
                <td><b>View Applicants</b></td>
                
            </tr>
            <c:forEach var="adv" items="${jobList}">
                <tr>
                   <td>${adv.id}</td>
                   <td>${adv.jobTitle}</td>
                    <td>${adv.industry}</td>
                   <!--  <td><button type="submit" class="btn btn-success">View</button></td> -->
                      <td><a href="viewapplicants/${adv.id }.htm" class="btn btn-success" role="button">View Applicants</a></td>
                </tr>
            </c:forEach>
        </table>




							</div>
						</div>
					</div>

				</div>
			</div>-->
		</div>

		<!-- /container -->

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
