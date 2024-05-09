// IntExample3.java
package com.coherentsolutions.section02.advanced.type_int;

public class IntExample3 {
    public static void main(String[] args) {
        // Arithmetic operations on int variables
        final int i1 = 100;
        final int i2 = 200;
        final int sum = i1 + i2;
        final int difference = i1 - i2;
        final int product = i1 * i2;
        final int quotient = i2 / i1;
        final int remainder = i2 % i1;

        System.out.println("i1: " + i1);
        System.out.println("i2: " + i2);
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);

        // Working with literals
        final int i3 = 2147483647; // Maximum value
        // final int i4 = 2147483648; // Compilation error, out of range
        System.out.println("Final int literal i3: " + i3);
    }
}
