<%--
  Created by IntelliJ IDEA.
  User: TechCare
  Date: 2/22/2021
  Time: 2:54 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/convert">
    <h2>Nhập từ tiếng việt</h2>
    <input type="text" name="word">
    <input type="submit" value="Convert">
</form>
<p> Result = ${result} </p>
</body>
</html>
