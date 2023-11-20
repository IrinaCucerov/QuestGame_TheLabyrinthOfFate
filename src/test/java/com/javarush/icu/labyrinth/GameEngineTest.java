package com.javarush.icu.labyrinth;

import org.junit.jupiter.api.Test;

import static com.javarush.icu.labyrinth.GameEngine.CURRENT_QUESTION_INDEX;
import static org.junit.jupiter.api.Assertions.*;

class GameEngineTest {
    GameEngine gameEngine = new GameEngine();

    @Test
    void getQuestion() {

        CURRENT_QUESTION_INDEX= 1;

        String actualResult = gameEngine.getQuestion();

        String expectedResult = "Step2 - You find the key in the corner of the room. How do you use it?" +
                "<br/>A. - Trying to open the door. <br/>B. - Inspect the lock on the window.";
        assertEquals(expectedResult, actualResult);


    }

    @Test
    void verifyAnswer() {
        CURRENT_QUESTION_INDEX = 2;

        String correctAnswer = "A";

        gameEngine.verifyAnswer(correctAnswer);

        assertFalse(gameEngine.isGameOver());
    }
}