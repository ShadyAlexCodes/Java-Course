package io.github.shadyalexcodes;

public class ChallengeTwo {

    public static void main(String[] args) {

        /*

            1. Create a byte variable and set it to any valid byte number.
            2. Create a short variable and set it to any valid short number.
            3. Create an int variable and set it to any valid int number.
            4. Create a variable of type long, and make it equal to 50,000 + 10 times
             the sum of the byte, plus the short plus the int.

        */

        byte challengeByte = 10;
        short challengeShort = 20;
        int challengeInt = 50;

        long longValue = 50000L + 10L * (challengeByte + challengeShort + challengeInt);
        short shortValue = (short) (1000 + 10 * (challengeByte + challengeShort + challengeInt));
        byte byteValue = (byte) (1000 + 10 * (challengeByte + challengeShort + challengeInt));
        int intValue = 50 + 10 * (challengeByte + challengeShort + challengeInt);

        System.out.println("longValue = " + longValue);
        System.out.println("shortValue = " + shortValue);
        System.out.println("byteValue = " + byteValue);
        System.out.println("intValue = " + intValue);

    }
}
