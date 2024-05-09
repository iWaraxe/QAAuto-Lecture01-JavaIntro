package com.coherentsolutions.section02.advanced.type_boolean;

public class BooleanExample5 {
    public static void main(String[] args) {
        // Peculiarities of boolean type
        boolean bool1 = true;
        boolean bool2 = false;

        // Compilation error: Arithmetic operations are not allowed on boolean types
        // boolean sum = bool1 + bool2;

        // Boolean bitwise operations
        System.out.println("bool1 & bool2: " + (bool1 & bool2)); // Bitwise AND
        System.out.println("bool1 | bool2: " + (bool1 | bool2)); // Bitwise OR
        System.out.println("bool1 ^ bool2: " + (bool1 ^ bool2)); // Bitwise XOR
        //System.out.println("~bool1: " + (~bool1)); // NOT operation not supported

        // Size and implementation details
        System.out.println("Boolean Size (bytes): Boolean is not numeric, but typically uses a byte or int.");
    }
}