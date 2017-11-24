<%--
  Created by IntelliJ IDEA.
  User: hbhardwaj
  Date: 23-11-2017
  Time: 12:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/Home" method="post" modelAttribute="formDto">
    <div>
        <label for="name">Name:</label>
        <input type="text" id="name" name="user_name">
    </div>
    <div>
        <label for="mail">E-mail:</label>
        <input type="email" id="mail" name="user_mail">
    </div>
    <div class="button">
        <button type="submit">Send your message</button>
    </div>
</form>
</body>
</html>
