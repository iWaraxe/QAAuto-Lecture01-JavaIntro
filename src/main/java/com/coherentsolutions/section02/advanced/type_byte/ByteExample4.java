// ByteExample4.java
package com.coherentsolutions.section02.advanced.type_byte;

public class ByteExample4 {
    public static void main(String[] args) {
        // Demonstrating overflow and underflow in byte
        byte max = Byte.MAX_VALUE;
        byte min = Byte.MIN_VALUE;

        System.out.println("Byte.MAX_VALUE: " + max);
        System.out.println("Byte.MIN_VALUE: " + min);

        max += 1; // Overflow
        min -= 1; // Underflow

        System.out.println("Overflowed Byte.MAX_VALUE: " + max); // Will wrap around to Byte.MIN_VALUE
        System.out.println("Underflowed Byte.MIN_VALUE: " + min); // Will wrap around to Byte.MAX_VALUE

        // Demonstrating binary representation of byte values
        byte value = 42;
        System.out.println("Binary representation of 42: " + Integer.toBinaryString(value & 0xFF));
    }
}
