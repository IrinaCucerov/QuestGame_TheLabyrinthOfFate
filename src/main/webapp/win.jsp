<%--
  Created by IntelliJ IDEA.
  User: icuce
  Date: 19.11.2023
  Time: 20:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Win</title>
</head>

<body>
<h1>You won ${playerName} ! Congratulations</h1>
<p>Thank you for playing, ${playerName}!</p>
<p>Total games played: ${gamesPlayed}</p>
<p>Total games won: ${gamesWon}</p>
<p>Total games lost: ${gamesLost}</p>


<form action="welcome.jsp" method="post">
    <button type="submit">Play again</button>
</form>

</body>
</html>
