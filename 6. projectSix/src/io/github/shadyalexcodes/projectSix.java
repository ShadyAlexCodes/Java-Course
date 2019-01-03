package io.github.shadyalexcodes;

public class projectSix {

    public static void main(String[] args) {
        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);

        int previousResult = result;

        result = result - 1;
        System.out.println(previousResult + " - 1 = " + result);

        previousResult = result;

        result = result * 10;
        System.out.println(previousResult + " * 10 = " + result);

        previousResult = result;

        result = result / 5;
        System.out.println(previousResult + " / 5 = " + result);

        previousResult = result;

        result = result % 3;
        System.out.println(previousResult + " % 3 = " + result);

        previousResult = result;
        result++;
        System.out.println(previousResult + " + 1 = " + result);



        boolean isAlien = false;
        if(isAlien == true) {
            System.out.println("It is not an alien.");
        }

        int topScore = 100;
        if(topScore == 100) {
            System.out.println("You got the highest score!");
        }

        boolean isCar = false;
        if(isCar == true) {
            System.out.println("Ooof. You shouldn't see this.");
        }

        isCar = true;
        boolean wasCar = isCar ? true : false;
        if(wasCar) {
            System.out.println("wasCar is equal to true.");
        }

    }
}
