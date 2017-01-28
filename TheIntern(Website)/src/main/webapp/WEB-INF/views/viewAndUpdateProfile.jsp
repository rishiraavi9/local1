<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
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
    <link href="resources/bower_components/bootstrap/dist/css/bootstrap.min.css" rel="stylesheet">

    <!-- MetisMenu CSS -->
    <link href="resources/bower_components/metisMenu/dist/metisMenu.min.css" rel="stylesheet">

    <!-- Timeline CSS -->
    <link href="resources/dist/css/timeline.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="resources/dist/css/sb-admin-2.css" rel="stylesheet">

    <!-- Morris Charts CSS -->
    <link href="resources/bower_components/morrisjs/morris.css" rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="resources/bower_components/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">

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
                    <h1 class="page-header">Profile</h1>
                </div>
                <!-- /.col-lg-12 -->
            </div>
            <!-- /.row -->
            <div class="row">
                <div class="col-lg-12">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                          Personal Details
                        </div>
                        <div class="panel-body">
                                
                            <form:form action="update.htm" commandName="update"  method="post">
                            <div class="row">
                        
 <div class="col-lg-6">
                                     <div class="form-group">
                                            <label>First Name</label>
                                           <form:input type="text" path="firstName" name="firstName" size="30"
										class="form-control" value="${js.firstName }" />
										<form:errors path="firstName"/>
										</div>
										<div class="form-group">
                                            <label>Last Name</label>
                                             <form:input type="text" path="lastName" name="lastName" value="${js.lastName }" size="30"
										class="form-control"  />
										<form:errors path="lastName"/>
                                      
                                        </div>
										<div class="form-group">
                                            <label>Address</label>
                                           <form:input type="text" path="address" name="address" size="30"
										class="form-control"  value="${js.address }"/>
										<form:errors path="address"/>
										</div>
                                        <div class="form-group">
                                            <label>Email</label>
                                           <form:input type="email" path="email" name="email" value="${js.email }" size="30"
										class="form-control"  />
										<form:errors path="email"/>
										</div>
										<button type="submit" class="btn btn-primary">Submit Profile</button>
                                      
                                       
                                      
                                </div>
                                <!-- /.col-lg-6 (nested) -->
                                <div class="col-lg-6">
                                
                                     
                                      
                                    
                                </div>
                                
                                                                
                                
                                <!-- /.col-lg-6 (nested) -->
                            </div>
  
                          </form:form>
                            <!-- /.row (nested) -->
                        </div>
                          
                        
                        <!-- /.panel-body -->
                    </div>
                    <!-- /.panel -->
                </div>
                <!-- /.col-lg-12 -->
            </div>
            <!-- /.row -->
        </div>
        <!-- /#page-wrapper -->

    </div>
    <!-- /#wrapper -->

    <!-- jQuery -->
    <script src="../bower_components/jquery/dist/jquery.min.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="../bower_components/bootstrap/dist/js/bootstrap.min.js"></script>

    <!-- Metis Menu Plugin JavaScript -->
    <script src="../bower_components/metisMenu/dist/metisMenu.min.js"></script>

    <!-- Custom Theme JavaScript -->
    <script src="../dist/js/sb-admin-2.js"></script>

</body>

</html>
