// ShortExample5.java
package com.coherentsolutions.section02.advanced.type_short;

public class ShortExample5 {
    public static void main(String[] args) {
        // Demonstrating bit manipulation with short values
        short s = 10000; // Binary: 00100111 00010000

        // Bitwise AND
        short andResult = (short) (s & 0b00001111_11111111); // Masking with lower 12 bits
        System.out.println("s & 0b00001111_11111111: " + andResult); // Binary: 00000000 00010000

        // Bitwise OR
        short orResult = (short) (s | 0b00001111_11111111); // Setting lower 12 bits
        System.out.println("s | 0b00001111_11111111: " + orResult); // Binary: 00101111 11111111

        // Bitwise XOR
        short xorResult = (short) (s ^ 0b11111111_11111111); // Inverting all bits
        System.out.println("s ^ 0b11111111_11111111: " + xorResult); // Binary: 11011000 11101111

        // Bitwise NOT
        short notResult = (short) ~s; // Inverting all bits
        System.out.println("~s: " + notResult); // Binary: 11011000 11101111

        // Bit Shift operations
        short leftShift = (short) (s << 2); // Shift left by 2 bits
        short rightShift = (short) (s >> 2); // Shift right by 2 bits (sign-extended)
        short unsignedRightShift = (short) ((s & 0xFFFF) >>> 2); // Unsigned right shift

        System.out.println("s << 2: " + leftShift); // Binary: 10011100 00100000
        System.out.println("s >> 2: " + rightShift); // Binary: 00001001 11000010
        System.out.println("s >>> 2: " + unsignedRightShift); // Binary: 00001001 11000010
    }
}
