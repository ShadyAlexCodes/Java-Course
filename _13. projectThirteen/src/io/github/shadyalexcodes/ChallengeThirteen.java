package io.github.shadyalexcodes;

public class ChallengeThirteen {


    /*

        Create a method called calcFeetAndInchesToCentimeters
        It needs to have two parameters, the first parameter is feet
        and inches is the second.

        You should be able to validate the first parameter feet is >=0
        and the second parameter inches is >=0 and <=12 return -1 from the
        method if either of the two is not true

        If the parameters are valid then calculate how many centimetres comprise
        the feet and inches passed to this method and return that value

        Create a second method of the same name with only one parameter
        inches is the parameter
        validate that it is >=0
        return -1 if it is not true
        But if it is valid calculate how many feet are in the inches and here
        is the tricky part
        call the other overloaded method passing the correct feet
        and inches calculated so it can calculate correctly

        Use double for your number data types,
        1 inch = 2.54 cm and one foot = 12 inches

     */

    public static void main(String[] args) {
        calcFeetAndInchesToCentimeters(12, 52);
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {

        if (feet >= 0 && inches >= 0 && inches <= 12) {
            return ((feet * 12) + inches) * 2.54;
        }
        return -1;
    }



    public static double calcFeetAndInchesToCentimeters(double inches) {

        if(inches >= 0) {
            double feet = (int) (inches / 12);
            double remainingInches = inches % 12;
            return calcFeetAndInchesToCentimeters(feet, remainingInches);
        }
        return -1;
    }

}
