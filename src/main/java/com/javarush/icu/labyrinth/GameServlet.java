package com.javarush.icu.labyrinth;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet(name = "GameServlet", value = "/start")
    public class GameServlet extends HttpServlet {

    public static int GAMES_PLAYED = 0;
    public static int GAMES_LOST= 0;
    public static int GAMES_WON = 0;

        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

            HttpSession session = request.getSession(true);
            String playerName = request.getParameter("playerName");

            GAMES_PLAYED++;
            session.setAttribute("playerName", playerName);
                session.setAttribute("gamesPlayed", GAMES_PLAYED);

            RequestDispatcher dispatcher = request.getRequestDispatcher("start.jsp");
            dispatcher.forward(request, response);

        }
    }

