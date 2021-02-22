<%--
  Created by IntelliJ IDEA.
  User: TechCare
  Date: 1/30/2021
  Time: 10:21 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
<div class="breacrumb-section">
    <div class="container">
        <div class="row">
            <div class="col-lg-12">
                <div class="breadcrumb-text product-more">
                    <a href="./index.jsp"><i class="fa fa-home"></i> Home</a>
                    <c:if test="${requestScope.serviceType.equals('2')}">
                    <a href="service?action=create&serviceType=2">Service</a>
                    <span>Add New House</span>
                    </c:if>
                    <c:if test="${requestScope.serviceType.equals('3')}">
                        <a href="service?action=create&serviceType=2">Service</a>
                        <span>Add New Room</span>
                    </c:if>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- Breadcrumb Section Begin -->

<section class="checkout-section spad">
    <div class="container">
        <form method="post" class="checkout-form">
            <div class="row">
                <div class="col-lg-12">
                    <h4>Information</h4>
                </div>
                <div class="col-lg-6">
                    <div class="row">
                        <div class="col-lg-6">
                            <label for="fir">Service Name<span>*</span></label>
                            <input type="text" id="fir" name="name">
                        </div>
                        <div class="col-lg-6">
                            <label for="email">Standard Room<span>*</span></label>
                            <input type="text" id="email" name="standardRoom">
                        </div>
                        <div class="col-lg-12">
                            <label for="cun-name">Cost</label>
                            <input type="number" id="cun-name" name="cost">
                        </div>
                        <div class="col-lg-12">
                            <label for="cun-floor">Number Of Floors<span>*</span></label>
                            <input type="number" id="cun-floor" name="numberFloors">
                        </div>
                        <c:if test="${requestScope.serviceType.equals('2')}">
                            <div class="col-lg-6">
                                <label for="last">Area House<span>*</span></label>
                                <input type="number" id="last" name="area">
                            </div>
                            <div class="col-lg-6">
                                <label for="street">Description<span>*</span></label>
                                <input type="text" id="street" class="street-first" name="description">
                            </div>
                        </c:if>
                        <c:if test="${requestScope.serviceType.equals('3')}">
                            <div class="col-lg-6">
                                <label for="last1">Area Room<span>*</span></label>
                                <input type="number" id="last1" name="area">
                            </div>
                            <div class="col-lg-6">
                                <label for="street2">Free Service<span>*</span></label>
                                <input type="text" id="street2" class="street-first" name="description">
                            </div>
                        </c:if>
                        <div class="col-lg-12">
                            <label for="cun">Max People<span>*</span></label>
                            <input type="number" id="cun" name="maxPeople">
                        </div>
                    </div>
                </div>
                <div class="col-lg-6">
                    <div class="col-lg-12">
                        <h5>Rent Type</h5>
                        <div class="form-check">
                            <label for="flexRadioDefault5">
                                Year
                            </label>
                            <input  type="radio" name="rentType" id="flexRadioDefault5" value="1">
                        </div>
                        <div class="form-check">
                            <label  for="flexRadioDefault6">
                                Month
                            </label>
                            <input  type="radio" name="rentType" id="flexRadioDefault6" value="2">
                        </div>
                        <div class="form-check">
                            <label  for="flexRadioDefault7">
                                Day
                            </label>
                            <input  type="radio" name="rentType" id="flexRadioDefault7" value="3">
                        </div>
                        <div class="form-check">
                            <label  for="flexRadioDefault8">
                                Hour
                            </label>
                            <input  type="radio" name="rentType" id="flexRadioDefault8" value="4">
                        </div>
                    </div>
                    <c:if test="${requestScope.serviceType.equals('2')}">
                        <div class="col-lg-6 offset-lg-3">
                            <button class="site-btn place-btn">Creat House</button>
                        </div>
                    </c:if>
                    <c:if test="${requestScope.serviceType.equals('3')}">
                        <div class="col-lg-4 offset-lg-4">
                            <button class="site-btn place-btn">Creat Room</button>
                        </div>
                    </c:if>
                </div>
            </div>
        </form>
    </div>
</section>
<!-- Shopping Cart Section End -->

<jsp:include page="/include/footer.jsp"/>
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
</body>
</html>

