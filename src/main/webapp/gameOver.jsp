<%--
  Created by IntelliJ IDEA.
  User: icuce
  Date: 17.11.2023
  Time: 23:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Game Over</title>
</head>
<body>
<h1>Game Over</h1>
<p>Thank you for playing, ${playerName}!</p>
<p>Total games played: ${gamesPlayed}</p>
<form action="gameOver.jsp" method="post">
    <button type="submit">Play Again</button>
</form>
</body>
</html>
