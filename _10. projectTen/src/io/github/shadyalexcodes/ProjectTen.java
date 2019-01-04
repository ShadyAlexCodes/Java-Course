package io.github.shadyalexcodes;

public class ProjectTen {

    public static void main(String[] args) {
        calculateScore(true, 700, 5, 5);
    }

    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score in this game was " + finalScore);
        } else {
            System.out.println("This game has not been completed yet!");
        }
    }


}
