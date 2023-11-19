package com.javarush.icu.labyrinth;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "GameServlet", value = "/welcome")
    public class GameServlet extends HttpServlet {

        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

//            String playerName = request.getParameter("playerName");
//            if (playerName == null || playerName.isEmpty()) {
//                // handle the case where the playerName is not provided
//            }
//
//            HttpSession session = request.getSession(true);
//            session.setAttribute("playerName", playerName);
//            session.setAttribute("gamesPlayed", 0);
//
//            RequestDispatcher dispatcher = request.getRequestDispatcher("welcome.jsp");
//            dispatcher.forward(request, response);

            HttpSession session = request.getSession(true);

            String playerName = (String) session.getAttribute("playerName");
            if (playerName == null) {
                playerName = request.getParameter("playerName");
                session.setAttribute("playerName", playerName);
                session.setAttribute("gamesPlayed", 0);
            }

            session.setAttribute("playerName", playerName);

            RequestDispatcher dispatcher = request.getRequestDispatcher("welcome.jsp");
            dispatcher.forward(request, response);


//            int answer = Integer.parseInt(request.getParameter("answer"));
//            GameEngine gameEngine = new GameEngine();
//
//            // Update game state based on user input
//            String question = gameEngine.getQuestion(answer);
//            boolean isGameOver = gameEngine.isGameOver();
//
//            // Update session data
//            session.setAttribute("question", question);
//            int gamesPlayed = (int) session.getAttribute("gamesPlayed");
//            session.setAttribute("gamesPlayed", gamesPlayed + 1);
//
//            // Forward to appropriate JSP page
//            if (isGameOver) {
//                // Game over page
//                RequestDispatcher dispatcher = request.getRequestDispatcher("gameOver.jsp");
//                dispatcher.forward(request, response);
//            } else {
//                // Question page
//                RequestDispatcher dispatcher = request.getRequestDispatcher("question.jsp");
//                dispatcher.forward(request, response);
//            }
        }
    }

