package com.javarush.icu.labyrinth;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

import static com.javarush.icu.labyrinth.GameEngine.CURRENT_QUESTION_INDEX;
import static com.javarush.icu.labyrinth.GameServlet.GAMES_LOST;
import static com.javarush.icu.labyrinth.GameServlet.GAMES_WON;

@WebServlet(name = "QuestionsServlet", value = "/questions")
public class QuestionsServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession(true);
        GameEngine gameEngine = new GameEngine();

        String question = "";

        if (CURRENT_QUESTION_INDEX != 0){
            String answer = request.getParameter("answer");
            gameEngine.verifyAnswer(answer);
            if (!gameEngine.isGameOver()){

                if (CURRENT_QUESTION_INDEX == 10) {
                    winGame(request, response);
                    return;
                }
                question = gameEngine.getQuestion();
            } else looseGame(request, response);
        } else {
            question = gameEngine.getQuestion();
        }

        session.setAttribute("question", question);
        RequestDispatcher dispatcher = request.getRequestDispatcher("question.jsp");
        dispatcher.forward(request, response);
    }

    private void winGame(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        CURRENT_QUESTION_INDEX = 0;
        GAMES_WON++;
        request.setAttribute("gamesWon", GAMES_WON);
        request.setAttribute("gamesLost", GAMES_LOST);
        RequestDispatcher dispatcher = request.getRequestDispatcher("win.jsp");
        dispatcher.forward(request, response);
    }

    private void looseGame(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        CURRENT_QUESTION_INDEX = 0;
        GAMES_LOST++;
        request.setAttribute("gamesWon", GAMES_WON);
        request.setAttribute("gamesLost", GAMES_LOST);
        RequestDispatcher dispatcher = request.getRequestDispatcher("gameOver.jsp");
        dispatcher.forward(request, response);
    }
}

