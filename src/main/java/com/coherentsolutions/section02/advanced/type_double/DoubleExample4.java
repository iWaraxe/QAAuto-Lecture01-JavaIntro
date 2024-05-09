// DoubleExample4.java
package com.coherentsolutions.section02.advanced.type_double;

public class DoubleExample4 {
    public static void main(String[] args) {
        // Demonstrating special effect #1 - Precision issues with double
        System.out.println("Special Effect #1 - Precision Issues with Double:");
        System.out.println("1.01 - 0.02: " + (1.01 - 0.02));
        System.out.println("1.1 - 0.2: " + (1.1 - 0.2));

        // Demonstrating special effect #2 - Loss of precision at extremal values
        System.out.println("\nSpecial Effect #2 - Loss of Precision at Extremal Values:");
        double d = Double.MAX_VALUE;
        double d1 = d - 1;
        System.out.println("d == d1: " + (d == d1)); // Should return true due to loss of precision

        // Demonstrating overflow and underflow in double
        double max = Double.MAX_VALUE;
        double min = Double.MIN_VALUE;

        System.out.println("\nDouble.MAX_VALUE: " + max);
        System.out.println("Double.MIN_VALUE: " + min);

        max *= 2; // Overflow
        min /= 2; // Underflow

        System.out.println("Overflowed Double.MAX_VALUE: " + max); // Infinity
        System.out.println("Underflowed Double.MIN_VALUE: " + min); // 0.0

        // Demonstrating floating-point precision issues
        double d2 = 0.1;
        double d3 = 0.2;
        double sum = d2 + d3;
        System.out.println("\nd2 + d3 (Expected 0.3): " + sum); // Not exactly 0.3

        // Demonstrating binary representation of double values
        long bits = Double.doubleToLongBits(d2);
        System.out.println("Binary representation of 0.1: " + Long.toBinaryString(bits));
    }
}
