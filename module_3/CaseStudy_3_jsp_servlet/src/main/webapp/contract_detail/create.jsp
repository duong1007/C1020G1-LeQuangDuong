<%--
  Created by IntelliJ IDEA.
  User: TechCare
  Date: 2/1/2021
  Time: 7:08 PM
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
                    <a href="/contract">Contract Detail</a>
                    <span>Create Contract Detail</span>
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
                            <label for="fir">Contract ID<span>*</span></label>
                            <input type="text" id="fir" name="contractID">
                        </div>
                        <div class="col-lg-6">
                            <label for="last">Quantity<span>*</span></label>
                            <input type="number" id="last" name="quantity">
                        </div>
                        <div class="col-lg-12">
                            <div class="input-group mb-3">
                                <div class="input-group-prepend">
                                    <label class="input-group-text" for="inputGroupSelect01">Attack Service</label>
                                </div>
                                <select class="custom-select" id="inputGroupSelect01" name="attackService">
                                    <option selected>Choose...</option>
                                    <option value="1">Massage</option>
                                    <option value="2">Karaoke</option>
                                    <option value="3">Foods</option>
                                    <option value="4">Drinks</option>
                                    <option value="5">Motor</option>
                                </select>
                            </div>
                        </div>
                        <div class="col-lg-4 offset-lg-4">
                            <button type="submit" class="site-btn login-btn">Create</button>
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

