package io.github.shadyalexcodes;

public class ProjectThree {

    public static void main(String[] args) {

    /*  Doubles and Floats are more precise. */

        // Width of int = 32 (4 bytes).
        int myIntValue = 5 ;
        // Width of int = 32 (4 bytes).
        float myFloatValue = 5f;
        // Width of int = 64 (8 bytes).
        double myDoubleValue = 5d;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);

        int myIntValueDivided = 5 / 2 ;
        float myFloatValueDivided = 5f / 2f;
        double myDoubleValueDivided = 5d / 2d;

        System.out.println("myIntValue / 2 = " + myIntValueDivided);
        System.out.println("myFloatValue / 2 = " + myFloatValueDivided);
        System.out.println("myDoubleValue / 2 = " + myDoubleValueDivided);

    }
}
