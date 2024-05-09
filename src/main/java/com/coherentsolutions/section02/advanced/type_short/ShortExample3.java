// ShortExample3.java
package com.coherentsolutions.section02.advanced.type_short;

public class ShortExample3 {
    public static void main(String[] args) {
        // Arithmetic operations on short variables
        final short s1 = 10;
        final short s2 = 20;
        final short sum = (short) (s1 + s2); // Requires casting to short
        final short difference = (short) (s1 - s2);
        final short product = (short) (s1 * s2);
        final short quotient = (short) (s2 / s1);
        final short remainder = (short) (s2 % s1);

        System.out.println("s1: " + s1);
        System.out.println("s2: " + s2);
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);

        // Working with literals
        final short s3 = 32767; // Maximum value
        // final short s4 = 32768; // Compilation error, out of range
        System.out.println("Final short literal s3: " + s3);
    }
}
