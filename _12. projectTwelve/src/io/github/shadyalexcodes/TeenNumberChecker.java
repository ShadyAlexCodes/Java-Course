package io.github.shadyalexcodes;

public class TeenNumberChecker {

    public static void main(String[] args) {
        hasTeen(23, 15, 42);

    }


    public static boolean hasTeen(int teenOne, int teenTwo, int teenThree) {
        if (teenOne >= 13 && teenOne <= 19 || teenTwo >= 13 && teenTwo <= 19 || teenThree >= 13 && teenThree <= 19) {
            System.out.println("Success!");
            return true;
        } else {
            System.out.println("Failure!");
            return false;
        }
    }
}
