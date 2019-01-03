package io.github.shadyalexcodes;

public class Challenge {

    public static void main(String[] args) {
        /*

            1. Create a double variable with the value 20
            2. Create a second variable with of the type double with the value of 80
            3. Add both numbers up and multiply by 25
            4. Use the remainder operator to figure out the remainder from the sum of #3 divided by 40
            5. Write an "if" statement that displays a message "Total was over the limit"
            if the remaining total (#4) is equal to 20 or less

        */

        double variableOne = 20d;
        double variableTwo = 80d;

        double outCome = (variableOne + variableTwo) * 25;

        outCome = outCome % 40;

        if(outCome <= 20) {
            System.out.println("Total was over the limit");
        }

    }

}
