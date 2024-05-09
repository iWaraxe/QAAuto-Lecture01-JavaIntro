// LongExample3.java
package com.coherentsolutions.section02.advanced.type_long;

public class LongExample3 {
    public static void main(String[] args) {
        // Arithmetic operations on long variables
        final long l1 = 1000L;
        final long l2 = 2000L;
        final long sum = l1 + l2;
        final long difference = l1 - l2;
        final long product = l1 * l2;
        final long quotient = l2 / l1;
        final long remainder = l2 % l1;

        System.out.println("l1: " + l1);
        System.out.println("l2: " + l2);
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);

        // Working with literals
        final long l3 = 9223372036854775807L; // Maximum value
        // final long l4 = 9223372036854775808L; // Compilation error, out of range
        System.out.println("Final long literal l3: " + l3);
    }
}
