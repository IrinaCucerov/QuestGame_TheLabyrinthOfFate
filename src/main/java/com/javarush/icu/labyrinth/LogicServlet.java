package com.javarush.icu.labyrinth;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet(name = "LogicServlet", value = "/logic")
public class LogicServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession(true);
        int answer = Integer.parseInt(request.getParameter("answer"));
        GameEngine gameEngine = new GameEngine();

        // Update game state based on user input
        String question = gameEngine.getQuestion(answer);
        boolean isGameOver = gameEngine.isGameOver();

        // Update session data
        session.setAttribute("question", question);

        // Forward to appropriate JSP page
        if (isGameOver) {
            // Game over page
            RequestDispatcher dispatcher = request.getRequestDispatcher("gameOver.jsp");
            dispatcher.forward(request, response);
        } else {
            // Question page
            RequestDispatcher dispatcher = request.getRequestDispatcher("question.jsp");
            dispatcher.forward(request, response);
        }
    }
}

