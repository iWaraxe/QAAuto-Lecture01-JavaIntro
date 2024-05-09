// ShortExample4.java
package com.coherentsolutions.section02.advanced.type_short;

public class ShortExample4 {
    public static void main(String[] args) {
        // Demonstrating overflow and underflow in short
        short max = Short.MAX_VALUE;
        short min = Short.MIN_VALUE;

        System.out.println("Short.MAX_VALUE: " + max);
        System.out.println("Short.MIN_VALUE: " + min);

        max += 1; // Overflow
        min -= 1; // Underflow

        System.out.println("Overflowed Short.MAX_VALUE: " + max); // Will wrap around to Short.MIN_VALUE
        System.out.println("Underflowed Short.MIN_VALUE: " + min); // Will wrap around to Short.MAX_VALUE

        // Demonstrating binary representation of short values
        short value = 10000;
        System.out.println("Binary representation of 10000: " + Integer.toBinaryString(value & 0xFFFF));
    }
}
