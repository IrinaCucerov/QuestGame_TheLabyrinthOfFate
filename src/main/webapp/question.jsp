<%--
  Created by IntelliJ IDEA.
  User: icuce
  Date: 17.11.2023
  Time: 23:27
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>The Labyrinth of Fate</title>
</head>

<body>
<form action="${pageContext.request.contextPath}/questions" method="post">
    <fieldset>
        <legend>The Labyrinth of Fate</legend>

        <!-- Display the question -->
        <div class="form-group">
            <%--@declare id="textinput"--%>
                <label class="col-md-4 control-label" for="textinput">${question}</label>
        </div>

        <!-- Display radio options -->
        <div class="form-group">
            <div class="col-md-4">
                <div class="radio">
                    <label for="radio-1">
                        <input type="radio" name="answer" id="radio-1" value="A" checked="checked">
                        A
                    </label>
                </div>
                <div class="radio">
                    <label for="radio-2">
                        <input type="radio" name="answer" id="radio-2" value="B">
                        B
                    </label>
                </div>
            </div>
        </div>

        <!-- Submit button -->
        <div class="form-group">
            <div class="col-md-4">
                <button type="submit" class="btn btn-primary">Check</button>
            </div>
        </div>
    </fieldset>
</form>
</body>
</html>
