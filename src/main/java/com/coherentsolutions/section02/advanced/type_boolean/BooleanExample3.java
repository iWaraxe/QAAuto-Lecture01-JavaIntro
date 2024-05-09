package com.coherentsolutions.section02.advanced.type_boolean;

public class BooleanExample3 {
    public static void main(String[] args) {
        // Boolean comparisons
        boolean comparison1 = (10 > 5);
        boolean comparison2 = (5 == 5);
        boolean comparison3 = (8 != 10);
        boolean comparison4 = (3 < 2);

        // Display comparisons
        System.out.println("10 > 5: " + comparison1);
        System.out.println("5 == 5: " + comparison2);
        System.out.println("8 != 10: " + comparison3);
        System.out.println("3 < 2: " + comparison4);

        // Usage in loops
        int i = 0;
        boolean keepLooping = true;

        while (keepLooping) {
            System.out.println("Loop iteration: " + i);
            i++;
            keepLooping = (i < 5); // Loop until i is 5
        }
    }
}