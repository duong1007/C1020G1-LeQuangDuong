<%--
  Created by IntelliJ IDEA.
  User: TechCare
  Date: 1/30/2021
  Time: 10:21 AM
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
<div class="breacrumb-section">
    <div class="container">
        <div class="row">
            <div class="col-lg-12">
                <div class="breadcrumb-text product-more">
                    <a href="./index.jsp"><i class="fa fa-home"></i> Home</a>
                    <a href="employees?action">Employee</a>
                    <span>Add New</span>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- Breadcrumb Section Begin -->

<!-- Shopping Cart Section Begin -->
<section class="checkout-section spad">
    <div class="container">
        <form method="post" class="checkout-form">
            <div class="row">
                <div class="col-lg-6">
                    <h4>Information</h4>
                    <div class="row">
                        <div class="col-lg-6">
                            <label for="fir">Full Name<span>*</span></label>
                            <input type="text" id="fir" name="name">
                        </div>
                        <div class="col-lg-6">
                            <label for="last">ID Card<span>*</span></label>
                            <input type="text" id="last" name="card">
                        </div>
                        <div class="col-lg-12">
                            <label for="cun-name">Date Of Birth</label>
                            <input type="date" id="cun-name" name="birth">
                        </div>
                        <div class="col-lg-12">
                            <label for="cun">Salary<span>*</span></label>
                            <input type="number" id="cun" name="salary">
                        </div>
                        <div class="col-lg-12">
                            <label for="street">Street Address<span>*</span></label>
                            <input type="text" id="street" class="street-first" name="address">
                            <input type="text">
                        </div>
                        <div class="col-lg-6">
                            <label for="email">Email Address<span>*</span></label>
                            <input type="text" id="email" name="email">
                        </div>
                        <div class="col-lg-6">
                            <label for="phone">Phone<span>*</span></label>
                            <input type="text" id="phone" name="phone">
                        </div>
                        <div class="col-lg-12">
                            <div class="create-item">
                                <label for="acc-create">
                                    Create an account?
                                    <input type="checkbox" id="acc-create">
                                    <span class="checkmark"></span>
                                </label>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col-lg-6">
                    <div class="place-order">
                        <h4>Degree</h4>
                        <div class="order-total">
                            <h5><b>Division</b></h5>
                            <div class="payment-check">
                                <div class="form-check">
                                    <input class="form-check-input" type="radio" name="division" id="flexRadioDefault1" value="1">
                                    <label class="form-check-label" for="flexRadioDefault1">
                                        Sale – Marketing
                                    </label>
                                </div>
                                <div class="form-check">
                                    <input class="form-check-input" type="radio" name="division" id="flexRadioDefault2" value="2">
                                    <label class="form-check-label" for="flexRadioDefault2">
                                        Administrative
                                    </label>
                                </div>
                                <div class="form-check">
                                    <input class="form-check-input" type="radio" name="division" id="flexRadioDefault3" value="3">
                                    <label class="form-check-label" for="flexRadioDefault3">
                                        Service
                                    </label>
                                </div>
                                <div class="form-check">
                                    <input class="form-check-input" type="radio" name="division" id="flexRadioDefault4" value="4">
                                    <label class="form-check-label" for="flexRadioDefault4">
                                        Management
                                    </label>
                                </div>
                            </div>
                            <h5><b>Education</b></h5>
                            <div class="payment-check">
                                <div class="form-check">
                                    <input class="form-check-input" type="radio" name="education" id="flexRadioDefault5" value="1">
                                    <label class="form-check-label " for="flexRadioDefault5">
                                        Intermediate Degree
                                    </label>
                                </div>
                                <div class="form-check">
                                    <input class="form-check-input" type="radio" name="education" id="flexRadioDefault6" value="2">
                                    <label class="form-check-label" for="flexRadioDefault6">
                                        Colleges
                                    </label>
                                </div>
                                <div class="form-check">
                                    <input class="form-check-input" type="radio" name="education" id="flexRadioDefault7" value="3">
                                    <label class="form-check-label" for="flexRadioDefault7">
                                        University
                                    </label>
                                </div>
                                <div class="form-check">
                                    <input class="form-check-input" type="radio" name="education" id="flexRadioDefault8" value="4">
                                    <label class="form-check-label" for="flexRadioDefault8">
                                        Postgraduate
                                    </label>
                                </div>
                            </div>
                            <h5><b>Position</b></h5>
                            <div class="payment-check">
                                <select class="form-select" aria-label="Default select example" name="position">
                                    <option selected>Open this select menu</option>
                                    <option value="1">Receptionist</option>
                                    <option value="2">Waiters</option>
                                    <option value="3">Expert</option>
                                    <option value="4">Supervisor</option>
                                    <option value="5">Manager</option>
                                    <option value="6">Director</option>
                                </select>
                            </div>
                            <div class="order-btn">
                                <button class="site-btn place-btn">Creat Employee</button>
                            </div>
                        </div>
                    </div>
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
