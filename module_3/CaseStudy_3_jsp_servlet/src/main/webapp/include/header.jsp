<%--
  Created by IntelliJ IDEA.
  User: TechCare
  Date: 2/2/2021
  Time: 1:22 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link href="https://fonts.googleapis.com/css?family=Muli:300,400,500,600,700,800,900&display=swap" rel="stylesheet">

<header class="header-section">
    <div class="header-top">
        <div class="container">
            <div class="ht-left">
                <div class="mail-service">
                    <i class=" fa fa-envelope"></i>
                    Maybiluyena@gmail.com
                </div>
                <div class="phone-service">
                    <i class=" fa fa-phone"></i>
                    +84 352 245 151
                </div>
            </div>
            <div class="ht-right">
                <a href="#" class="login-panel"><i class="fa fa-user"></i>Login</a>
                <div class="lan-selector">
                    <select class="language_drop" name="countries" id="countries" style="width:300px;">
                        <option value='yt' data-image="img/flag-1.jpg" data-imagecss="flag yt"
                                data-title="English">English</option>
                        <option value='yu' data-image="img/flag-2.jpg" data-imagecss="flag yu"
                                data-title="Bangladesh">German </option>
                    </select>
                </div>
                <div class="top-social">
                    <a href="#"><i class="ti-facebook"></i></a>
                    <a href="#"><i class="ti-twitter-alt"></i></a>
                    <a href="#"><i class="ti-linkedin"></i></a>
                    <a href="#"><i class="ti-pinterest"></i></a>
                </div>
            </div>
        </div>
    </div>
    <div class="container">
        <div class="inner-header">
            <div class="row">
                <div class="col-lg-2 col-md-2">
                    <div class="logo">
                        <a href="./index.jsp">
                            <img src="img/logo.png" alt="">
                        </a>
                    </div>
                </div>
                <div class="col-lg-7 col-md-7">
                    <div class="advanced-search">
                        <button type="button" class="category-btn">All Categories</button>
                        <form action="/${requestScope.search}" class="input-group">
                            <input type="text" placeholder="Search..." name="name">
                            <input type="hidden" name="action" value="Search">
                            <button type="button"><i class="ti-search"></i></button>
                        </form>
                    </div>
                </div>
                <div class="col-lg-3 text-right col-md-3">
                    <h5>Lê Quang Dương</h5>
                </div>
            </div>
        </div>
    </div>
    <div class="nav-item ">
        <div class="container">
            <nav class="nav-menu mobile-menu">
                <ul>
                    <li><a href="./index.jsp">Home</a></li>
                    <li><a href="/customers">Customer</a></li>
                    <li><a href="#">Service</a>
                        <ul class="dropdown">
                            <li><a href="/service?action=createVilla&serviceType=1">Villa</a></li>
                            <li><a href="/service?action=create&serviceType=2">House</a></li>
                            <li><a href="/service?action=create&serviceType=3">Room</a></li>
                        </ul>
                    </li>
                    <li><a href="/employees">Employee</a></li>
                    <li><a href="/contract">Contract</a></li>
                    <li><a href="/contract_detail">Contract Detail</a></li>
                </ul>
            </nav>
            <div id="mobile-menu-wrap"></div>
        </div>
    </div>
</header>
