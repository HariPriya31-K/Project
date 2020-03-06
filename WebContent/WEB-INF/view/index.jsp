<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<head>

<style>
.topnav {
	top: 0;
	background: black;
	color: white;
	text-align: Right;
	font-size: 17px;
	width: 99%;
	height: 20px;
	position: fixed;
}

.article {
	background-color: #3492CC;
	padding: 8px;
	color: white;
}

.footer {
	background: black;
	color: white;
	padding: 8px;
	bottom: 0;
	right: 0;
	position: fixed;
	width: 100%;
}

.content {
	margin-top: -20px;
	background: #e7edf0;
	height: 450px;
}

a {
	text-decoration: none;
	color: white;
}

.head-content {
	margin-top: -20px;
	padding: 8px;
	background-color: #329bc9;
}

.body-content {
	background-color: white;
	bottom: -20px;
}

.btn {
	background-color: #3492cc;
	color: white;
	border: none;
	text-decoration: none;
	margin-right: 200px;
}

input {
	width: 80px;
	padding: 8px;
	border: none;
	background-color: white;
}

form {
	padding: 5px;
	margin-left: 450px;
}


</style>
</head>
<body>


	<div class="topnav">
		<nav>

			<a>Edit Customer</a> <a>View Report</a> <a href="upload-customer">CustomerUpload</a>
			<a href="index">Home</a> <a>Logout</a>
		</nav>
	</div>


	<div id="home">
		<div class="article">
			<center>
				<h3>Welcome Manager</h3>
			</center>
		</div>
		<div class="content"></div>




		<div class="footer">
			<center>
				<p>Posted by: amphi Refsnes</p>
				<p>Contact information: amphi@example.com.</p>
				<p>Amphi Bank of India</p>
			</center>
		</div>
	</div>
</body>
</html>