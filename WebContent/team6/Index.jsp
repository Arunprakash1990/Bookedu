<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<meta http-equiv="content-type" content="text/html; charset=utf-8" />
		<meta name="description" content="" />
		<meta name="keywords" content="" />
		<!--[if lte IE 8]><script src="css/ie/html5shiv.js"></script><![endif]-->
		<script src="js/jquery.min.js"></script>
		<script src="js/jquery.dropotron.min.js"></script>
		<script src="js/skel.min.js"></script>
		<script src="js/skel-layers.min.js"></script>
		<script src="js/init.js"></script>
		<script src="js/Signup.js"></script>
		<noscript>
			<link rel="stylesheet" href="css/skel.css" />
			<link rel="stylesheet" href="css/style.css" />
			<link rel="stylesheet" href="css/style-desktop.css" />
		</noscript>
		<!--[if lte IE 8]><link rel="stylesheet" href="css/ie/v8.css" /><![endif]-->
		<!--[if lte IE 9]><link rel="stylesheet" href="css/ie/v9.css" /><![endif]-->
	</head>
	<body class="homepage">

		<!-- Header -->
			<div id="header-wrapper">
				<div class="container">

					<!-- Header -->
						<header id="header">
							<div class="inner">
							
								<!-- Logo -->
									<h1><a href="Index.jsp" id="logo">BookEdu</a></h1>
								
								<!-- Nav -->
									<nav id="nav">
										<ul>
											<li class="current_page_item"><a href="Index.jsp">Home</a></li>
											<li>
											<!--  	<a href="">Categories</a>
												<ul>
													<li><a href="#">Technical Books</a></li>
													<li><a href="#">Non Technical Books</a></li>
												</ul>
											</li> -->
											
											<a href="">Search</a>
												<ul>
													<li>
													<a onclick="document.getElementById('div_search_by_author').style.display='';return false; document.getElementById('div_search_by_title').style.visibility='hidden';"href="" style="text-decoration:none;;"> By Author
													</a>
													</li>
													<li>
													<a onclick="document.getElementById('div_search_by_title').style.display='';return false;document.getElementById('div_search_by_author').style.visibility='hidden';" href="" style="text-decoration:none;;"> By Title
													</a>
													</li>
													<li>
													<a onclick="document.getElementById('div_search_by_isbn').style.display='';return false; document.getElementById('div_search_by_title').style.visibility='hidden';"href="" style="text-decoration:none;;"> By ISBN
													</a>
													</li>
												</ul>
											</li>
											<li>
											<a href="">Add/View</a>
												<ul>
													<li>
<a onclick="document.getElementById('div_add_by_author').style.display='';return false;" 
href="" style="text-decoration:none;;"> Add
</a>

</li>
													<li><a href="Process?btnid=View">View</a></li>
												</ul>
											</li>
											<li>
											<a onclick="document.getElementById('div_about_us').style.display='';return false;" href="" style="text-decoration:none;;"> About Us
											</a>
											</li>
										</ul>
									</nav>
							
							</div>
						</header>
						

					<!-- Banner -->
						<div id="banner">
							<h2><strong>BookEdu:</strong> An abode of book collection
							<br />
							</h2>
							
							<!-- Table properties -->
							
							
							
<div id="div_add_by_author" style="display:none;solid #aaa;">
<form name="Add" action="Process" method="get">
		<ul>
		<li>
		ISBN: <input type="text" name="isbn">
		Author name: <input type="text" name="aname">
		Book Title: <input type="text" name="btitle">
		Genre: <input type="text" name="genre">
		<input type="submit" name="btnid" id="btnid" value="Add">
		<a onclick="document.getElementById('div_add_by_author').style.display='none';return false;" href="" style="text-decoration:none;border-bottom:1px dotted blue;"><input type="submit" value="Back"></a>
		</li>
		</ul>
</form>
</div>
		
<div id="div_search_by_author" style="display:none;solid #aaa;">
<form name="search"  action="Process" method="get">
		<ul>
		<li>
		Enter Author name: <input type="text" name="aname">
		<input type="submit" name="btnid" value="Searchauthor">
		<a onclick="document.getElementById('div_search_by_author').style.display='none';return false;" href="" style="text-decoration:none;border-bottom:1px dotted blue;"><input type="submit" value="Back"></a>
		</li>
		</ul>
		</form>
		</div>
		
<div id="div_search_by_title" style="display:none;solid #aaa;">
<form name="search" action="Process" method="get">
		<ul>
		<li>
		Enter Book Title: <input type="text" name="btitle">
		<input type="submit" name="btnid" value="Searchtitle">
		<a onclick="document.getElementById('div_search_by_title').style.display='none';return false;" href="" style="text-decoration:none;border-bottom:1px dotted blue;"><input type="submit" value="Back"></a>
		</li>
		</ul>
		</form>
		</div>

<div id="div_search_by_isbn" style="display:none;solid #aaa;">
<form name="search"  action="Process" method="get">
		<ul>
		<li>
		Enter ISBN: <input type="text" name="isbn">
		<input type="submit" name="btnid" value="Searchisbn">
		<a onclick="document.getElementById('div_search_by_isbn').style.display='none';return false;" href="" style="text-decoration:none;border-bottom:1px dotted blue;"><input type="submit" value="Back"></a>
		</li>
		</ul>
		</form>
		</div>
<div id="div_about_us" style="display:none;solid #aaa;">
Version 2.0 <br>
created by <br>
Arun Prakash 

  <a onclick="document.getElementById('div_about_us').style.display='none';return false;" href="" style="text-decoration:none;border-bottom:1px dotted blue;"><input type="button" value="Back"></a>
	
</div>

						
		
			</div>
			
</div>
</div>
</body>

			
</html>