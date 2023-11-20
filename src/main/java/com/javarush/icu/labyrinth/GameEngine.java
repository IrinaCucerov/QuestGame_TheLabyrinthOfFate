package com.javarush.icu.labyrinth;

import java.util.HashMap;
import java.util.Map;

public class GameEngine {
    public static int CURRENT_QUESTION_INDEX = 0;
    private static final Map<Integer, String> questions = new HashMap<>();
    private static final Map<Integer, String> answersA = new HashMap<>();
    private static final Map<Integer, String> answersB = new HashMap<>();
    private boolean isGameOver;

    static {
        questions.put(1, "Step1 - You wake up in a dark room with no memories. What are you doing?");
        answersA.put(1, "Start screaming.");
        answersB.put(1, "Look around.");

        questions.put(2, "Step2 - You find the key in the corner of the room. How do you use it?");
        answersA.put(2, "Trying to open the door.");
        answersB.put(2, "Inspect the lock on the window.");

        questions.put(3, "Step3 - The door opens, but a dark corridor awaits you behind it. What are you doing?");
        answersA.put(3, "Enter the corridor.");
        answersB.put(3, "Looking for another way out in the room.");

        questions.put(4, "Step4 - At the end of the corridor you see two doors. Which one do you choose?");
        answersA.put(4, "The left door.");
        answersB.put(4, "The right door.");

        questions.put(5, "Step5 - In the next room, you are attacked by a huge spider web. What are you doing?");
        answersA.put(5, "Use fire (if there is one).");
        answersB.put(5, "Try to pass by carefully.");

        questions.put(6, "Step6 - You come across a mysterious stone with a lever. What are you doing?");
        answersA.put(6, "Press the lever.");
        answersB.put(6, "Explore the stone without pressing.");

        questions.put(7, "Step7 - After the lever, a pit opens with huge spikes at the bottom. What are you doing?");
        answersA.put(7, "Looking for a way around the pit.");
        answersB.put(7, "Jump over the pit.");

        questions.put(8, "Step8 - You are led to the choice of two doors - one of them leads down, the other up. Where are you going?");
        answersA.put(8, "Use the light (if there is one).");
        answersB.put(8, "Try to escape.");

        questions.put(9, "Step9 - In the last room, a mysterious figure appears in front of you, offering you a choice:" +
                " to continue life outside the maze, but forget everything you have experienced, " +
                "or to stay in the maze and receive eternal knowledge. What do you choose?");
        answersA.put(9, "Up.");
        answersB.put(9, "Down.");

        questions.put(10, "Step10 - In the next room, a shadow attacks you. How do you resist it?");
        answersA.put(10, "Continue life outside the maze.");
        answersB.put(10, "Stay in the maze and gain eternal knowledge.");
    }

    public GameEngine() {
        this.isGameOver = false;
    }

    public String getQuestion() {
        CURRENT_QUESTION_INDEX++;

        String question = questions.get(CURRENT_QUESTION_INDEX);
        String answerA = answersA.get(CURRENT_QUESTION_INDEX);
        String answerB = answersB.get(CURRENT_QUESTION_INDEX);

        return question + "<br/>A. - " + answerA + " <br/>B. - " + answerB;
    }

    public void verifyAnswer(String answer) {
        String correctAnswer = getCorrectAnswer(CURRENT_QUESTION_INDEX);
        if (!answer.equals(correctAnswer)){
            isGameOver = true;
        }
    }

    private String getCorrectAnswer(int questionIndex) {
        return switch (questionIndex) {
            case 2, 3, 5, 6, 9, 10 -> "A";
            case 1, 4, 7, 8 -> "B";
            default -> "";
        };
    }

    public boolean isGameOver() {
        return isGameOver;
    }

}
