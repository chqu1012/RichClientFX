package de.dc.spring.bootstrap.blog.model.gen

import de.dc.spring.bootstrap.blog.model.Blog

class BlogTemplate implements IGenerator<Blog>{
	
	override gen(Blog t)'''
	<!DOCTYPE html>
	<html lang="en">
	  <head>
	    <title>Frater Anatis</title>
	    <meta charset="utf-8">
	    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	    
	    <link rel="stylesheet" href="css/open-iconic-bootstrap.min.css">
	    <link rel="stylesheet" href="css/animate.css">
	    
	    <link rel="stylesheet" href="css/owl.carousel.min.css">
	    <link rel="stylesheet" href="css/owl.theme.default.min.css">
	    <link rel="stylesheet" href="css/magnific-popup.css">
	
	    <link rel="stylesheet" href="css/aos.css">
	
	    <link rel="stylesheet" href="css/ionicons.min.css">
	    
	    <link rel="stylesheet" href="css/flaticon.css">
	    <link rel="stylesheet" href="css/icomoon.css">
	    <link rel="stylesheet" href="css/style.css">
	  </head>
	  <body data-spy="scroll" data-target=".site-navbar-target" data-offset="300">
	
	    <nav class="navbar navbar-expand-lg navbar-dark ftco_navbar bg-dark ftco-navbar-light site-navbar-target" id="ftco-navbar">
		    <div class="container">
		      <a class="navbar-brand" href="index.html">Frater Anatis Website</a>
		      <button class="navbar-toggler js-fh5co-nav-toggle fh5co-nav-toggle" type="button" data-toggle="collapse" data-target="#ftco-nav" aria-controls="ftco-nav" aria-expanded="false" aria-label="Toggle navigation">
		        <span class="oi oi-menu"></span> Menu
		      </button>
	
		      <div class="collapse navbar-collapse" id="ftco-nav">
		        <ul class="navbar-nav nav ml-auto">
		          <li class="nav-item"><a href="#home-section" class="nav-link"><span>Home</span></a></li>
		          <li class="nav-item"><a href="#blog-section" class="nav-link"><span>Blog</span></a></li>
		          <li class="nav-item"><a href="#emily-months" class="nav-link"><span>Emily Months</span></a></li>
		          <li class="nav-item"><a href="#about-section" class="nav-link"><span>About</span></a></li>
		        </ul>
		      </div>
		    </div>
		 </nav>
		  
		  «FOR section : t.sections»
		  <section th:replace="fragments/«section.uuid» :: «section.uuid»"></section>
		  «ENDFOR»
	
		  <!-- loader -->
		  <div id="ftco-loader" class="show fullscreen"><svg class="circular" width="48px" height="48px"><circle class="path-bg" cx="24" cy="24" r="22" fill="none" stroke-width="4" stroke="#eeeeee"/><circle class="path" cx="24" cy="24" r="22" fill="none" stroke-width="4" stroke-miterlimit="10" stroke="#F96D00"/></svg></div>
		
		  <script src="js/jquery.min.js"></script>
		  <script src="js/jquery-migrate-3.0.1.min.js"></script>
		  <script src="js/popper.min.js"></script>
		  <script src="js/bootstrap.min.js"></script>
		  <script src="js/jquery.easing.1.3.js"></script>
		  <script src="js/jquery.waypoints.min.js"></script>
		  <script src="js/jquery.stellar.min.js"></script>
		  <script src="js/owl.carousel.min.js"></script>
		  <script src="js/jquery.magnific-popup.min.js"></script>
		  <script src="js/aos.js"></script>
		  <script src="js/jquery.animateNumber.min.js"></script>
		  <script src="js/scrollax.min.js"></script>
		  
		  <script src="js/main.js"></script>
	
	  </body>
	</html>
	'''
	
}