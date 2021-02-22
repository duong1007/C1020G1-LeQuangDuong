<%--
  Created by IntelliJ IDEA.
  User: TechCare
  Date: 1/30/2021
  Time: 7:16 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <meta charset="UTF-8">
  <meta name="description" content="Fashi Template">
  <meta name="keywords" content="Fashi, unica, creative, html">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta http-equiv="X-UA-Compatible" content="ie=edge">
  <title>Fashi | Template</title>

  <!-- Google Font -->
  <link href="https://fonts.googleapis.com/css?family=Muli:300,400,500,600,700,800,900&display=swap" rel="stylesheet">

  <!-- Css Styles -->
  <link rel="stylesheet" href="css/bootstrap.min.css" type="text/css">
  <link rel="stylesheet" href="css/font-awesome.min.css" type="text/css">
  <link rel="stylesheet" href="css/themify-icons.css" type="text/css">
  <link rel="stylesheet" href="css/elegant-icons.css" type="text/css">
  <link rel="stylesheet" href="css/owl.carousel.min.css" type="text/css">
  <link rel="stylesheet" href="css/nice-select.css" type="text/css">
  <link rel="stylesheet" href="css/jquery-ui.min.css" type="text/css">
  <link rel="stylesheet" href="css/slicknav.min.css" type="text/css">
  <link rel="stylesheet" href="css/style.css" type="text/css">
</head>

<body>
<!-- Page Preloder -->
<div id="preloder">
  <div class="loader"></div>
</div>

<jsp:include page="/include/header.jsp"/>
<section class="hero-section">
  <div class="hero-items owl-carousel">
    <div class="single-hero-items set-bg" data-setbg="img/img1.jpg">
      <div class="container">
        <div class="row">
          <div class="col-lg-5">
            <span>Boy,Man</span>
            <h1>Black friday</h1>
            <p style="color: black">Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor
              incididunt ut labore et dolore</p>
            <a href="#" class="primary-btn">Shop Now</a>
          </div>
        </div>
        <div class="off-card">
          <h2>Sale <span>50%</span></h2>
        </div>
      </div>
    </div>
    <div class="single-hero-items set-bg" data-setbg="img/png1.png">
      <div class="container">
        <div class="row">
          <div class="col-lg-5">
            <span>Boy,Man</span>
            <h1>Black friday</h1>
            <p style="color: black">Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor
              incididunt ut labore et dolore</p>
            <a href="#" class="primary-btn">Shop Now</a>
          </div>
        </div>
        <div class="off-card">
          <h2>Sale <span>50%</span></h2>
        </div>
      </div>
    </div>
  </div>
</section>
<!-- Hero Section End -->

<!-- Banner Section Begin -->
<div class="banner-section spad">
  <div class="container-fluid">
    <div class="row">
      <div class="col-lg-4">
        <div class="single-banner">
          <img src="img/banner-1.jpg" alt="">
          <div class="inner-text">
            <h4>Men’s</h4>
          </div>
        </div>
      </div>
      <div class="col-lg-4">
        <div class="single-banner">
          <img src="img/banner-2.jpg" alt="">
          <div class="inner-text">
            <h4>Women’s</h4>
          </div>
        </div>
      </div>
      <div class="col-lg-4">
        <div class="single-banner">
          <img src="img/banner-3.jpg" alt="">
          <div class="inner-text">
            <h4>Kid’s</h4>
          </div>
        </div>
      </div>
    </div>
  </div>
</div>
<jsp:include page="/include/footer.jsp"/> b

<!-- Js Plugins -->
<script src="js/jquery-3.3.1.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/jquery-ui.min.js"></script>
<script src="js/jquery.countdown.min.js"></script>
<script src="js/jquery.nice-select.min.js"></script>
<script src="js/jquery.zoom.min.js"></script>
<script src="js/jquery.dd.min.js"></script>
<script src="js/jquery.slicknav.js"></script>
<script src="js/owl.carousel.min.js"></script>
<script src="js/main.js"></script>
</body>
</html>
