// ByteExample5.java
package com.coherentsolutions.section02.advanced.type_byte;

public class ByteExample5 {
    public static void main(String[] args) {
        // Demonstrating bit manipulation with byte values
        byte b = 42; // Binary: 00101010

        // Bitwise AND
        byte andResult = (byte) (b & 0b00001111); // Masking with lower 4 bits
        System.out.println("b & 0b00001111: " + andResult); // Binary: 00001010

        // Bitwise OR
        byte orResult = (byte) (b | 0b00001111); // Setting lower 4 bits
        System.out.println("b | 0b00001111: " + orResult); // Binary: 00101111

        // Bitwise XOR
        byte xorResult = (byte) (b ^ 0b11111111); // Inverting all bits
        System.out.println("b ^ 0b11111111: " + xorResult); // Binary: 11010101

        // Bitwise NOT
        byte notResult = (byte) ~b; // Inverting all bits
        System.out.println("~b: " + notResult); // Binary: 11010101

        // Bit Shift operations
        byte leftShift = (byte) (b << 2); // Shift left by 2 bits
        byte rightShift = (byte) (b >> 2); // Shift right by 2 bits (sign-extended)
        byte unsignedRightShift = (byte) ((b & 0xFF) >>> 2); // Unsigned right shift

        System.out.println("b << 2: " + leftShift); // Binary: 10101000
        System.out.println("b >> 2: " + rightShift); // Binary: 00001010
        System.out.println("b >>> 2: " + unsignedRightShift); // Binary: 00001010
    }
}
