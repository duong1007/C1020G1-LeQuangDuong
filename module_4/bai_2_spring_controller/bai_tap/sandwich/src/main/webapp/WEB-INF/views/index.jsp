<%--
  Created by IntelliJ IDEA.
  User: TechCare
  Date: 2/23/2021
  Time: 11:07 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <h1>Sandwich Condiments</h1>
  <form action="/save">
    <span></span>
    <input type="checkbox" name="condiment" value="Lettuce"> Lettuce
    <input type="checkbox" name="condiment" value="Tomato"> Tomato
    <input type="checkbox" name="condiment" value="Mustard"> Mustard
    <input type="checkbox" name="condiment" value="Sprouts"> Sprouts
    <hr/>
    <input type="submit" value="Save">
  </form>
  <p>${condiment}</p>
  </body>
</html>
