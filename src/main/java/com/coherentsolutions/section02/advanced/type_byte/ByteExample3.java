// ByteExample3.java
package com.coherentsolutions.section02.advanced.type_byte;

public class ByteExample3 {
    public static void main(String[] args) {
        // Arithmetic operations on byte variables
        final byte b1 = 1;
        final byte b2 = 2;
        final byte sum = (byte) (b1 + b2); // Requires casting to byte
        final byte difference = (byte) (b1 - b2);
        final byte product = (byte) (b1 * b2);
        final byte quotient = (byte) (b2 / b1);
        final byte remainder = (byte) (b2 % b1);

        System.out.println("b1: " + b1);
        System.out.println("b2: " + b2);
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);

        // Working with literals
        final byte b3 = 127;
        // final byte b4 = 128; // Compilation error, out of range
        System.out.println("Final byte literal b3: " + b3);
    }
}
