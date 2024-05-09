// IntExample4.java
package com.coherentsolutions.section02.advanced.type_int;

public class IntExample4 {
    public static void main(String[] args) {
        // Demonstrating overflow and underflow in int
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;

        System.out.println("Integer.MAX_VALUE: " + max);
        System.out.println("Integer.MIN_VALUE: " + min);

        max += 1; // Overflow
        min -= 1; // Underflow

        System.out.println("Overflowed Integer.MAX_VALUE: " + max); // Will wrap around to Integer.MIN_VALUE
        System.out.println("Underflowed Integer.MIN_VALUE: " + min); // Will wrap around to Integer.MAX_VALUE

        // Demonstrating binary representation of int values
        int value = 123456789;
        System.out.println("Binary representation of 123456789: " + Integer.toBinaryString(value));
    }
}
