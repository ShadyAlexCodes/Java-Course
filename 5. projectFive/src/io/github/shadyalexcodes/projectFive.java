package io.github.shadyalexcodes;

import java.util.Random;

public class projectFive {

    public static void main(String[] args) {

        String myString = "this string";
        System.out.println("myString is equal to " + myString);
        myString = myString + ", and this is more";
        System.out.println("myString is equal to " + myString);
        myString = myString + " \u00A9 2019";
        System.out.println("myString is equal to " + myString);


        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println("The result is " + numberString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("The result is " + lastString);

        double doubleNumber = 120.47;
        lastString = lastString + doubleNumber;
        System.out.println("LastString value " + lastString);
    }
}
