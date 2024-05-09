// ByteExample2.java
package com.coherentsolutions.section02.advanced.type_byte;

public class ByteExample2 {
    public static void main(String[] args) {
        // Declaring a byte variable and assigning a value later
        byte b;
        b = 1;
        System.out.println("Assigned byte b: " + b);

        // Re-initialization
        b = 2;
        System.out.println("Re-initialized byte b: " + b);

        // Using final to make an immutable byte variable
        final byte bFinal = 1;
        System.out.println("Immutable final byte bFinal: " + bFinal);

        // Compilation error if trying to change value of final variable
        // bFinal = 2; // Uncommenting this line will cause a compilation error
    }
}
