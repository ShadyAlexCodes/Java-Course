package io.github.shadyalexcodes;

public class Main {

    public static void main(String[] args) {

        /*
          What is a variable?
            - A variable is considered to be a `place` in memory and is a container
            to store information in. Computers allow users to store thousands
            of these containers in a single program. We can assign multiple forms
            of information to these containers, such as giving it a name. For example, a
            program wanted to calculate a users current age based on the date they'd need to use
            multiple variables. The computer would need some place to store all this different information,
            and this is where variables come into play. Without the ability to store information the computers
            cannot process anything.

          How do you create a variable?
            - To create a variable we need to define their `data type`, assign a name to it, and define a `value` to it.
            One of the most basic data types is a `int` which is short for integer. Let's break it down even more an
            `int` is a `data type` which tells java to that we need to assign a `container` or an `area of memory` to
            store this information (In this case our integer or item) After that we define our variable name `myFirstNumber`,
            which gives our program something to call this. This is then followed by a `equal sign (=)` and a `number` next to the end.
            This tells our int that we'd like to assign the value of 5 to it. (But keep in mind variables are flexible and we can assign
            numbers to this)

            - `int`'s are not limited to one singular number. You are able to create longer or more difficult equations.

            * An abbreviation to `System.out.println();` is `sout`

         */

        int myFirstNumber = 5;


        System.out.println(myFirstNumber); // We're telling Java to print the variable we created
    }

}
