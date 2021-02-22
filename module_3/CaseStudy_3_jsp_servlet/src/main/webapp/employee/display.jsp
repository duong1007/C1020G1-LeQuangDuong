<%--
  Created by IntelliJ IDEA.
  User: TechCare
  Date: 1/30/2021
  Time: 9:58 AM
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

<!-- Header Section Begin -->
<jsp:include page="/include/header.jsp"/>
<!-- Header End -->
<div class="breacrumb-section">
    <div class="container">
        <div class="row">
            <div class="col-lg-12">
                <div class="breadcrumb-text">
                    <a href="./index.jsp"><i class="fa fa-home"></i> Home</a>
                    <span>Employee</span>
                </div>
            </div>
        </div>
    </div>
</div>

<!-- Product Shop Section Begin -->
<section class="product-shop spad">
    <div class="container">
        <div class="row">
            <div class="col-lg-3 col-md-6 col-sm-8 order-2 order-lg-1 produts-sidebar-filter">
                <div class="filter-widget">
                    <h4 class="fw-title">Categories</h4>
                    <ul class="filter-catagories">
                        <li><a href="#">Men</a></li>
                        <li><a href="#">Women</a></li>
                        <li><a href="#">Kids</a></li>
                    </ul>
                </div>
                <div class="filter-widget">
                    <h4 class="fw-title">Brand</h4>
                    <div class="fw-brand-check">
                        <div class="bc-item">
                            <label for="bc-calvin">
                                Calvin Klein
                                <input type="checkbox" id="bc-calvin">
                                <span class="checkmark"></span>
                            </label>
                        </div>
                        <div class="bc-item">
                            <label for="bc-diesel">
                                Diesel
                                <input type="checkbox" id="bc-diesel">
                                <span class="checkmark"></span>
                            </label>
                        </div>
                        <div class="bc-item">
                            <label for="bc-polo">
                                Polo
                                <input type="checkbox" id="bc-polo">
                                <span class="checkmark"></span>
                            </label>
                        </div>
                        <div class="bc-item">
                            <label for="bc-tommy">
                                Tommy Hilfiger
                                <input type="checkbox" id="bc-tommy">
                                <span class="checkmark"></span>
                            </label>
                        </div>
                    </div>
                </div>
            </div>
            <div class="col-lg-9 order-1 order-lg-2">
                <div class="table-wrapper">
                    <div class="table-title">
                        <div class="row">
                            <div class="col-sm-8"><h2>Employee <b>Details</b></h2></div>
                            <div class="col-sm-4">
                                <button type="button" class="btn btn-info add-new"><i class="fa fa-plus"></i>
                                    <a href="/employees?action=create" class="text-white">Add New</a></button>
                            </div>
                        </div>
                    </div>
                    <table class="table table-bordered">
                        <thead>
                        <tr>
                            <th>Name</th>
                            <th>Birth</th>
                            <th>Position</th>
                            <th>Education</th>
                            <th>Division</th>
                            <th>Actions</th>
                        </tr>
                        </thead>
                        <tbody>
                        <c:forEach var="employee" items="${requestScope.employees}">
                            <tr>
                                <td><c:out value="${employee.name}"/> </td>
                                <td><c:out value="${employee.birthday}"/> </td>
                                <td><c:out value="${employee.position}"/> </td>
                                <td><c:out value="${employee.education}"/> </td>
                                <td><c:out value="${employee.division}"/> </td>
                                <td>
                                    <a class="edit" title="Edit" data-toggle="tooltip"
                                       href="employees?action=update&id=${employee.id}">
                                        <i class="material-icons">&#xE254;</i></a>
                                    <a href="#deleteEmployeeModal${employee.id}" class="delete" data-toggle="modal">
                                        <i class="material-icons" data-toggle="tooltip" title="Delete">&#xE872;</i></a>
                                </td>
                            </tr>
                            <!-- Delete Modal HTML -->
                            <div id="deleteEmployeeModal${employee.id}" class="modal fade">
                                <div class="modal-dialog">
                                    <div class="modal-content">
                                        <form>
                                            <div class="modal-header">
                                                <h4 class="modal-title">Delete Employee</h4>
                                                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                                            </div>
                                            <div class="modal-body">
                                                <p>Are you sure you want to delete these Records?</p>
                                                <p class="text-warning"><small>This action cannot be undone.</small></p>
                                            </div>
                                            <div class="modal-footer">
                                                <input type="button" class="btn btn-default" data-dismiss="modal" value="Cancel">
                                                <input type="hidden" name="id" value="${employee.id}">
                                                <input type="hidden" name="action" value="delete">
                                                <input type="submit" class="btn btn-danger" value="Delete">
                                            </div>
                                        </form>
                                    </div>
                                </div>
                            </div>
                        </c:forEach>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    </div>
</section>
<!-- Product Shop Section End -->
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