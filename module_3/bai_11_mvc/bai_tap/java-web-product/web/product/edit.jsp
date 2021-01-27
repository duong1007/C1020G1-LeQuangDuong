<%--
  Created by IntelliJ IDEA.
  User: TechCare
  Date: 1/26/2021
  Time: 3:59 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit Product</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css"
          integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l" crossorigin="anonymous">
</head>
<body>
<form method="post">
    <div class="form-group">
        <label for="exampleInputEmail1">Name</label>
        <input type="text" class="form-control" id="exampleInputEmail1" name="name" value="${requestScope.product.name}">
    </div>
    <div class="form-group">
        <label for="exampleInputPassword1">Price</label>
        <input type="text" class="form-control" name="price" id="exampleInputPassword1" value="${requestScope.product.price}">
    </div>
    <div class="form-group">
        <label for="exampleInputPassword2">Description</label>
        <input type="text" class="form-control" name="description" id="exampleInputPassword2" value="${requestScope.product.description}">
    </div>
    <div class="form-group">
        <label for="exampleInputPassword3">Manufacture</label>
        <input type="text" class="form-control" name="manufacture" id="exampleInputPassword3" value="${requestScope.product.manufacture}">
    </div>
    <div class="form-group">
        <label for="exampleInputPassword4">Image</label>
        <input type="text" class="form-control" name="img" id="exampleInputPassword4" value="${requestScope.product.img}">
    </div>
    <input type="submit" class="btn btn-primary" value="Update">
</form>
<p>
    <a href="/products">Back to product list</a>
</p>
</body>
</html>
