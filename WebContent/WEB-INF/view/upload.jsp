<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">



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

h2 {
	color: green;
}
</style>


</head>
<body>
	<div class="topnav">
		<nav>

			<a>Edit Customer</a> <a>View Report</a> <a href="upload">CustomerUpload</a>
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
		<h3>
			<b>Add bulk Customers</b>
		</h3>

		<p>
			Format of Saving Account CSV file: (Account Holder Name,Mobile
			Number,Adhar Number,email,DOB,Account Number,Type,Security
			Number,Balance,Interest per month,secret code,transaction
			limit,withdraw per month,number of years) <br>
		<p>Example Format of CSV file:(Arielle Duncan,8838091443
			100234516213,arielle@gmail.com,2018-10-10,444102638,Savings,12345,100000,12,345,10000,5,20)</p>
		<br>


		<p>Format of Checking Account CSV file: (Account Holder
			Name,Mobile Number,Adhar Number,email,DOB,Account
			Number,Balance,Depit card Number,pin Number,interest per month)</p>
		<p>Example Format of CSV file:(Arielle Duncan,8838091443
			100234516213,arielle@gmail.com,2018-10-10,444102638,Checking,12345,100000,2878675,6782,10)
		</p>


		<form method="post" action="doUpload" enctype="multipart/form-data"
			onload="return show('page3','page2')">

			<input type="file" name="fileUpload" size="50" /><input
				type="submit" value="submit" id="fileUpload" />
		</form>
	</div>
	<div id="page3" style="display: none">
	<h2>Customer inserted Successfully</h2>
	</div>
	</div>
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