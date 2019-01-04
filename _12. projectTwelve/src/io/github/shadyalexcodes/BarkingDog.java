package io.github.shadyalexcodes;

public class BarkingDog {

    public static void main(String[] args) {
        bark(true, 1);
        bark(false, 2);
        bark(true, 9);
        bark(true, -1);

    }


    public static boolean bark(boolean barking, int hourOfDay) {
        if(barking && (hourOfDay >= 0) && (hourOfDay < 8 || hourOfDay == 23)) {
            System.out.println("The dog is currently barking!");

            return true;
        } else {
            System.out.println("The dog not barking!");
            return  false;
        }
    }
}
