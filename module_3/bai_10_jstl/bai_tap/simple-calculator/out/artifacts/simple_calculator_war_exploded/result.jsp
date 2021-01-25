<%--
  Created by IntelliJ IDEA.
  User: TechCare
  Date: 1/25/2021
  Time: 3:04 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<html>
<head>
    <title>$Title$</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css"
          integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l" crossorigin="anonymous">
</head>
<body>
<form action="calculator", method="get">
    <div class="form-row">
        <div class="col-md-6 mb-3">
            <label for="validationDefault01">First Number</label>
            <input type="text" class="form-control" id="validationDefault01" value="${requestScope.numberOne}" required disabled>
        </div>
        <div class="col-md-6 mb-3">
            <label for="validationDefault02">Last Number</label>
            <input type="text" class="form-control" id="validationDefault02" value="${requestScope.numberTwo}" required disabled>
        </div>
    </div>
    <div class="form-row">
        <div class="col-md-3 mb-3">
            <h4><c:out value="${requestScope.operator}"/></h4>
            <c:if test="${requestScope.result.equals('Infinity')}">
                DivineZero Exception!!
                  </c:if>
            <c:if test="${!requestScope.result.equals('Infinity')}">
                Result = <c:out value="${requestScope.result}"/>
            </c:if>
        </div>
    </div>
</form>
</body>
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
        integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"
        integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/js/bootstrap.min.js"
        integrity="sha384-+YQ4JLhjyBLPDQt//I+STsc9iw4uQqACwlvpslubQzn4u2UU2UFM80nGisd026JF" crossorigin="anonymous"></script>
</html>
