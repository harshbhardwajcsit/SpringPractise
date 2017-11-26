<%--
  Created by IntelliJ IDEA.
  User: hbhardwaj
  Date: 25-11-2017
  Time: 14:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Add new product</h1>
<form action="/add" method="post" modelAttribute="formDto">
    <div>
        <label for="description">Description:</label>
        <input type="text" id="description" name="description">
    </div>
    <div>
        <label for="price">Price:</label>
        <input type="number" id="price" name="price">
    </div>
    <div class="button">
        <button type="submit">Add the product</button>
    </div>
</form>

</body>
</html>
