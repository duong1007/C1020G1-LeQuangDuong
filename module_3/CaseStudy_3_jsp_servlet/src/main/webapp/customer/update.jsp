<%--
  Created by IntelliJ IDEA.
  User: TechCare
  Date: 1/30/2021
  Time: 10:21 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html lang="zxx">
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
    <link rel="stylesheet" href="css/table.css" type="text/css">
    <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
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
                <div class="breadcrumb-text">
                    <a href="./index.jsp"><i class="fa fa-home"></i> Home</a>
                    <a href="customers?action">Customer</a>
                    <span>Edit</span>
                </div>
            </div>
        </div>
    </div>
</div>

<section class="checkout-section spad">
    <div class="container">
        <form method="post" class="checkout-form">
            <div class="row">
                <div class="col-lg-6 offset-lg-3">
                    <h4>Information</h4>
                    <div class="row">
                        <div class="col-lg-6">
                            <label for="fir">Full Name<span>*</span></label>
                            <input type="text" id="fir" name="name" value="${requestScope.customer.name}">
                        </div>
                        <div class="col-lg-6">
                            <label for="last">ID Card<span>*</span></label>
                            <input type="text" id="last" name="card" value="${requestScope.customer.idCard}">
                        </div>
                        <div class="col-lg-12">
                            <label for="cun-name">Date Of Birth</label>
                            <input type="date" id="cun-name" name="birth" value="${requestScope.customer.birth}">
                        </div>
                        <c:if test="${requestScope.customer.gender.equals('Male')}">
                            <div class="col-lg-12">
                                <label >Gender<span>*</span></label>
                                <input type="radio"  name="gender" value="Male" checked> Male
                                <input type="radio"  name="gender" value="Female"> Female
                                <input type="radio"  name="gender" value="Other"> Other
                            </div>
                        </c:if>

                        <c:if test="${requestScope.customer.gender.equals('Female')}">
                            <div class="col-lg-12">
                                <label >Gender<span>*</span></label>
                                <input type="radio"  name="gender" value="Male">  Male
                                <input type="radio"  name="gender" value="Female" checked> Female
                                <input type="radio"  name="gender" value="Other"> Other
                            </div>
                        </c:if>

                        <c:if test="${requestScope.customer.gender.equals('Other')}">
                            <div class="col-lg-12">
                                <label >Gender<span>*</span></label>
                                <input type="radio"  name="gender" value="Male">  Male
                                <input type="radio"  name="gender" value="Female"> Female
                                <input type="radio"  name="gender" value="Other" checked> Other
                            </div>
                        </c:if>
                        <div class="col-lg-12">
                            <br>
                        </div>
                        <div class="col-lg-12">
                            <div class="input-group mb-3">
                                <div class="input-group-prepend">
                                    <label class="input-group-text" for="inputGroupSelect01">Type Customer</label>
                                </div>
                                <select class="custom-select" id="inputGroupSelect01" name="type">
                                    <option value="1">Diamond</option>
                                    <option value="2">Platinum</option>
                                    <option value="3">Gold</option>
                                    <option value="4">Silver</option>
                                    <option value="5">Member</option>
                                </select>
                            </div>
                        </div>
                        <div class="col-lg-12">
                            <label for="street">Street Address<span>*</span></label>
                            <input type="text" id="street" class="street-first" name="address"
                                   value="${requestScope.customer.address}">
                            <input type="text">
                        </div>
                        <div class="col-lg-6">
                            <label for="email">Email Address<span>*</span></label>
                            <input type="text" id="email" name="email" value="${requestScope.customer.email}" >
                        </div>
                        <div class="col-lg-6">
                            <label for="phone">Phone<span>*</span></label>
                            <input type="text" id="phone" name="phone" value="${requestScope.customer.phone}">
                        </div>
                        <div class="col-lg-4 offset-lg-4">
                            <button type="submit" class="site-btn login-btn">Create Customer</button>
                        </div>
                    </div>
                </div>
            </div>
        </form>
    </div>
</section>
<!-- Register Form Section End -->
<!-- Partner Logo Section Begin -->
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