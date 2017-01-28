<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>SB Admin 2 - Bootstrap Admin Theme</title>

    <!-- Bootstrap Core CSS -->
    <link href="${pageContext.request.contextPath}/resources/bower_components/bootstrap/dist/css/bootstrap.min.css" rel="stylesheet">

    <!-- MetisMenu CSS -->
    <link href="${pageContext.request.contextPath}/resources/bower_components/metisMenu/dist/metisMenu.min.css" rel="stylesheet">

    <!-- Timeline CSS -->
    <link href="${pageContext.request.contextPath}/resources/dist/css/timeline.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="${pageContext.request.contextPath}/resources/dist/css/sb-admin-2.css" rel="stylesheet">

    <!-- Morris Charts CSS -->
    <link href="${pageContext.request.contextPath}/resources/bower_components/morrisjs/morris.css" rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="${pageContext.request.contextPath}/resources/bower_components/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
<script type="text/css" >
 $('.disabled').click(function(e){
     e.preventDefault();
  })

</script>
    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>

<body>

    <div id="wrapper">

        <!-- Navigation -->
        <nav class="navbar navbar-default navbar-static-top" role="navigation" style="margin-bottom: 0">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="">Welcome ${sessionScope.jobseekerAccount.firstName }</a>
            </div>
            <!-- /.navbar-header -->

            <ul class="nav navbar-top-links navbar-right">
        
                <!-- /.dropdown -->
      
                <!-- /.dropdown -->
                <li class="dropdown">
                    <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                        <i class="fa fa-user fa-fw"></i>  <i class="fa fa-caret-down"></i>
                    </a>
                    <ul class="dropdown-menu dropdown-user">
                        
                        <li><a href="${pageContext.request.contextPath}/logout.htm" >Log Out</a>
                        </li>
                    </ul>
                    <!-- /.dropdown-user -->
                </li>
                <!-- /.dropdown -->
            </ul>
            <!-- /.navbar-top-links -->

            <div class="navbar-default sidebar" role="navigation">
                <div class="sidebar-nav navbar-collapse">
                    <ul class="nav" id="side-menu">
                        
                       
                        <li>
                            <a href="homejobseeker.htm"><i class="fa fa-dashboard fa-fw"></i>Home</a>
                        </li>
                       
                       
                        <li>
                            <a href="profile.htm"><i class="fa fa-edit fa-fw"></i>Resume</a>
                        </li>
                         <li>
                            <a href="viewprofile.htm"><i class="fa fa-edit fa-fw"></i>View and UpdateProfile</a>
                        </li>
                         <li>
                            <a href="viewAppliedJobs.htm"><i class="fa fa-edit fa-fw"></i>VIew Applied Jobs</a>
                        </li>
                       
                       
                    </ul>
                </div>
                <!-- /.sidebar-collapse -->
            </div>
            <!-- /.navbar-static-side -->
        </nav>

        <div id="page-wrapper">
         <div class="row">
          <div class="col-lg-12">
                    <h1 class="page-header">View Applied Jobs</h1>
                </div>
         	<div class="col-md-8">
				<div class="col-md-4 user1">
					<div id="loginbox" style="width:750px"
						class="mainbox col-md-6 col-md-offset-3 col-sm-8 col-sm-offset-2">
						<div class="panel panel-info">
							<div class="panel-heading">
								<div class="row">
								<div class="col-lg-6">
								<div class="panel-title">View Jobs</div>
								</div>
								<div class="col-lg-6">
								 
								</div>
								
                                 </div>
							</div>

							<div style="padding-top: 30px" class="panel-body">

								<div style="display: none" id="login-alert"
									class="alert alert-danger col-sm-12"></div>
  <div class="dataTable_wrapper">
 <table class="table table-striped table-bordered table-hover" id="dataTables-example">
            <tr>
                <td><b>Job Id</b></td>
                <td>Date</td>
                <td><b>Message From Employee</b></td>
                <td><b>Company Name</b></td>
                 <td><b>Submit Status</b></td>
              <!--   <td><b>Title</b></td>
                <td><b>Industry</b></td>
                <td><b>View Applicants</b></td>--> 
                
            </tr>
            <c:forEach var="adv" items="${jobsApplied}">
                <tr>
                   <td>${adv.id}</td>
                   <td>${adv.date}</td>
                    <td>${adv.message}</td>
                    <td>${adv.job.companyName}</td>
                     <td>${adv.status}</td>
                   
                   
                   
                </tr>
            </c:forEach>
        </table>


</div>
							</div>
						</div>
					</div>

				</div>
			</div>
         </div>
            <!-- /.row -->
        </div>
        <!-- /#page-wrapper -->

    </div>
    <!-- /#wrapper -->

    <!-- jQuery -->
    <script src="resources/bower_components/jquery/dist/jquery.min.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="resources/bower_components/bootstrap/dist/js/bootstrap.min.js"></script>

    <!-- Metis Menu Plugin JavaScript -->
    <script src="resources/bower_components/metisMenu/dist/metisMenu.min.js"></script>

    <!-- Morris Charts JavaScript -->
    <script src="resources/bower_components/raphael/raphael-min.js"></script>
    <script src="resources/bower_components/morrisjs/morris.min.js"></script>
    <script src="resources/js/morris-data.js"></script>

    <!-- Custom Theme JavaScript -->
    <script src="resources/dist/js/sb-admin-2.js"></script>

</body>

</html>
