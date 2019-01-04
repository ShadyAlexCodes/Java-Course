package io.github.shadyalexcodes;

public class DecimalComparator {

    public static void main(String[] args) {
        areEqualByThreeDecimalPlaces(-3.1752, -3.175);
    }

    public static boolean areEqualByThreeDecimalPlaces(double numberOne, double numberTwo) {

            int oneFinal = (int) (numberOne * 1000);
            int twoFinal = (int) (numberTwo * 1000);

            if(oneFinal == twoFinal) {
                System.out.println("Success!");
                return true;
            }

        System.out.println("Failure!");
        return false;
    }

}

