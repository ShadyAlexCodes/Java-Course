package io.github.shadyalexcodes;

public class EqualSumChecker {

    public static void main(String[] args) {
        hasEqualSum(1, 1, 1);
        hasEqualSum(1, 1, 2);
    }

    public static boolean hasEqualSum(int numberOne, int numberTwo, int numberThree) {

        if ((numberOne + numberTwo) == numberThree) {
            System.out.println("These two numbers are equal!");
            return true;
        } else {
            System.out.println("These two numbers are not equal!");
            return false;
        }
    }
}
