<%--
  Created by IntelliJ IDEA.
  User: icuce
  Date: 19.11.2023
  Time: 11:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Welcome</title>
</head>

<body>
<h1>Welcome ${playerName} !</h1>

<h2>10 steps to victory are waiting for you</h2>
    <h3>Choose one of the answers</h3>

<form action="/questions" method="post">

    <button type="submit">Start to play</button>
</form>

</body>
</html>
