package com.coherentsolutions.section02.advanced.type_boolean;

public class BooleanExample1 {
    public static void main(String[] args) {
        // Declaring and initializing boolean variables
        boolean bool1 = true;
        boolean bool2 = false;

        // Printing the boolean variables
        System.out.println("bool1: " + bool1);
        System.out.println("bool2: " + bool2);

        // Logical NOT operation
        System.out.println("!bool1: " + !bool1);
        System.out.println("!bool2: " + !bool2);

        // Logical AND operation
        System.out.println("bool1 && bool2: " + (bool1 && bool2));

        // Logical OR operation
        System.out.println("bool1 || bool2: " + (bool1 || bool2));

        // Logical XOR operation
        System.out.println("bool1 ^ bool2: " + (bool1 ^ bool2));
    }
}
