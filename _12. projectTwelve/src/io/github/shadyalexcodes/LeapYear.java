package io.github.shadyalexcodes;

public class LeapYear {

    public static void main(String[] args) {
        isLeapYear(-1600);
    }

    public static boolean isLeapYear( int year) {
        if ((year >= 1) && (year <= 9999)) {
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                System.out.println("It is a leap year!");
                return true;
            } else {
                System.out.println("It is not a leap year!");
                return false;
            }
        }
        return false;
    }
}
