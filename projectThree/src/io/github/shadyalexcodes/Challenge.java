package io.github.shadyalexcodes;

public class Challenge {

    public static void main(String[] args) {

        /*

            Convert a given number of pounds to kilograms
            1. Create a variable to store the number of pounds
            2. Calculate the number of Kilograms for the number above and store in a variable.
            3. Print out the result.

            Note: 1 pound is equal to 0.45359237 kilograms.

         */

        // Version 1

        int pounds = 200;

        float oneFloatKilogram = 0.45359237f;
        float floatValue = (pounds * oneFloatKilogram);
        System.out.println("floatValue = " + floatValue); // Value - 90.718475

        double oneDoubleKilogram = 0.45359237d;
        double doubleValue = (pounds * oneDoubleKilogram);
        System.out.println("doubleValue = " + doubleValue); // Value - 90.718474


        // Version 2 (Instructor Example)

        double numPounds = 200d;
        double converedKilograms = numPounds * 0.45359237d;
        System.out.println("doubleValue2 = " + converedKilograms);  // Value - 90.718474

    }

}
