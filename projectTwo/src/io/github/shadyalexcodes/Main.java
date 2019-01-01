package io.github.shadyalexcodes;

public class Main {

    public static void main(String[] args) {


        // An integer has a width of 32
	    int myMinValue = -2147483648;
        int myMaxValue = 2147483647;
        int myTotal = (myMinValue/2);
        System.out.println("myTotal = " + myTotal);

        // A byte has a width of 8
        byte myByteValue = -128;
        byte myNewByteValue = (byte) (myByteValue/2);
        System.out.println("myNewByteValue = " + myNewByteValue);
        /*
            What is a byte?
                - A `byte` is a data type that allocates smaller amounts of data for the computer.
                A `byte` is more efferent because it takes about the quarter the amount of space as an `integer` takes.
                It can be much easier to use a bit with larger calculations. A byte can store a number in the range of -128 to 127.
         */


        // A short has the width of 16
        short myShortValue = 30000;
        short myNewShortValue = (short) (myShortValue/2);
        System.out.println("myNewShortValue = " + myNewShortValue);

        /*
            What is a short?
                - The difference between a `short` is it allocates about twice the amount of space than a `byte`, and
                about half the amount of an `integer`.
         */


        // A long has a width of 64
        long myLongValue = 100L;
        long myNewLongValue = (long) (myLongValue/2);
        System.out.println("myNewLongValue = " + myNewLongValue);

        /*
            What is a long?
                - A `long` is where the computer or user has a number larger than the amount of an integer.
                When assigning `long values` you always want to place the letter `L` telling the computer that it is a
                long value.
         */

    }
}
