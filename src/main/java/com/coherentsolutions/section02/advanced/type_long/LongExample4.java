// LongExample4.java
package com.coherentsolutions.section02.advanced.type_long;

public class LongExample4 {
    public static void main(String[] args) {
        // Demonstrating overflow and underflow in long
        long max = Long.MAX_VALUE;
        long min = Long.MIN_VALUE;

        System.out.println("Long.MAX_VALUE: " + max);
        System.out.println("Long.MIN_VALUE: " + min);

        max += 1; // Overflow
        min -= 1; // Underflow

        System.out.println("Overflowed Long.MAX_VALUE: " + max); // Will wrap around to Long.MIN_VALUE
        System.out.println("Underflowed Long.MIN_VALUE: " + min); // Will wrap around to Long.MAX_VALUE

        // Demonstrating binary representation of long values
        long value = 123456789012345L;
        System.out.println("Binary representation of 123456789012345: " + Long.toBinaryString(value));
    }
}
