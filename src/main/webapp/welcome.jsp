<%--
  Created by IntelliJ IDEA.
  User: icuce
  Date: 17.11.2023
  Time: 23:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<html>
<head>
    <meta charset="UTF-8">
    <title>Welcome to the Labyrinth of Fate</title>
</head>

<body>
<h1>Welcome to the Labyrinth of Fate!</h1>
<h2>Prologue:</h2>
<p>Your mind wakes up in total darkness. The deep silence is broken only by your breathing. Your eyes begin to discern a faint light, and you look around. There are no signs of a place you know here.
    Your choice is to act and look for a way out or stay in captivity of this mysterious maze. Your decisions will determine your fate.
</p>

<h3>Can you pass the labyrinth?:</h3>
<label>Enter your name and click start to try:

<form action="${pageContext.request.contextPath}/start" method="post">
    <input type="text" name="playerName" required>
    <button type="submit">Start</button>
</form>
</label>
<%--<a href="Welcome">Start to game!</a>--%>
</body>
</html>


