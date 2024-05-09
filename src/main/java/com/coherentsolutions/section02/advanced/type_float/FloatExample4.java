// FloatExample4.java
package com.coherentsolutions.section02.advanced.type_float;

public class FloatExample4 {
    public static void main(String[] args) {
        // Demonstrating overflow and underflow in float
        float max = Float.MAX_VALUE;
        float min = Float.MIN_VALUE;

        System.out.println("Float.MAX_VALUE: " + max);
        System.out.println("Float.MIN_VALUE: " + min);

        max *= 2; // Overflow
        min /= 2; // Underflow

        System.out.println("Overflowed Float.MAX_VALUE: " + max); // Infinity
        System.out.println("Underflowed Float.MIN_VALUE: " + min); // 0.0

        // Demonstrating floating-point precision issues
        float f1 = 0.1f;
        float f2 = 0.2f;
        float sum = f1 + f2;
        System.out.println("f1 + f2 (Expected 0.3): " + sum); // Not exactly 0.3

        // Demonstrating binary representation of float values
        int bits = Float.floatToIntBits(f1);
        System.out.println("Binary representation of 0.1f: " + Integer.toBinaryString(bits));
    }
}
