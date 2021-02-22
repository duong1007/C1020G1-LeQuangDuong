<%--
  Created by IntelliJ IDEA.
  User: TechCare
  Date: 2/1/2021
  Time: 4:52 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
                    <a href="/contract">Contract</a>
                    <span>Create Contract</span>
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
                            <label for="fir">Start Date<span>*</span></label>
                            <input type="date" id="fir" name="start">
                        </div>
                        <div class="col-lg-6">
                            <label for="last">End Date<span>*</span></label>
                            <input type="date" id="last" name="end">
                        </div>
                        <div class="col-lg-12">
                            <label for="cun-name">Deposit</label>
                            <input type="number" id="cun-name" name="deposit">
                        </div>
                        <div class="col-lg-12">
                            <label for="street">Total<span>*</span></label>
                            <input type="text" id="street" class="street-first" name="total">
                        </div>
                        <div class="col-lg-6">
                            <label for="email">Employee ID<span>*</span></label>
                            <input type="text" id="email" name="employee">
                        </div>
                        <div class="col-lg-6">
                            <label for="phone">Customer ID<span>*</span></label>
                            <input type="text" id="phone" name="customer">
                        </div>
                        <div class="col-lg-12">
                            <label for="cun-service">Service ID</label>
                            <input type="text" id="cun-service" name="service">
                        </div>
                        <div class="col-lg-4 offset-lg-4">
                            <button type="submit" class="site-btn login-btn">Create Contract</button>
                        </div>
                    </div>
                </div>
            </div>
        </form>
    </div>
</section>

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
