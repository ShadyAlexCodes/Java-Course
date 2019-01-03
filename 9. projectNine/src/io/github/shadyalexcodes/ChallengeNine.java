package io.github.shadyalexcodes;

public class ChallengeNine {

    public static void main(String[] args) {

        /*

            Print out a second score on the screen with the following information
             - Score set to 100000
             - levelCompleted set to 8
             - bonus set to 200
            Make sure to print out the same information from the previous class.

        */

        boolean gameOver = true;
        int score = 8000;
        int levelCompleted = 5;
        int bonus = 100;

        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score in this game was " + finalScore);
        }

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score in this game was " + finalScore);
        }



    }
}
