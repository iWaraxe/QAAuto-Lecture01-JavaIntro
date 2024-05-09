// LongExample5.java
package com.coherentsolutions.section02.advanced.type_long;

public class LongExample5 {
    public static void main(String[] args) {
        // Demonstrating bit manipulation with long values
        long l = 42L; // Binary: 00000000 00000000 00000000 00000000 00000000 00000000 00000000 00101010

        // Bitwise AND
        long andResult = l & 0b1111; // Masking with lower 4 bits
        System.out.println("l & 0b1111: " + andResult); // Binary: 00000010

        // Bitwise OR
        long orResult = l | 0b11110000L; // Setting upper 4 bits
        System.out.println("l | 0b11110000: " + orResult); // Binary: 00000000 00000000 00000000 00000000 00000000 00000000 00000000 11111010

        // Bitwise XOR
        long xorResult = l ^ 0b11111111L; // Inverting all bits
        System.out.println("l ^ 0b11111111: " + xorResult); // Binary: 00000000 00000000 00000000 00000000 00000000 00000000 00000000 11010101

        // Bitwise NOT
        long notResult = ~l; // Inverting all bits
        System.out.println("~l: " + notResult); // Binary: 11111111 11111111 11111111 11111111 11111111 11111111 11111111 11010101

        // Bit Shift operations
        long leftShift = l << 2; // Shift left by 2 bits
        long rightShift = l >> 2; // Shift right by 2 bits (sign-extended)
        long unsignedRightShift = l >>> 2; // Unsigned right shift

        System.out.println("l << 2: " + leftShift); // Binary: 00000000 00000000 00000000 00000000 00000000 00000000 00000000 10101000
        System.out.println("l >> 2: " + rightShift); // Binary: 00000000 00000000 00000000 00000000 00000000 00000000 00000000 00001010
        System.out.println("l >>> 2: " + unsignedRightShift); // Binary: 00000000 00000000 00000000 00000000 00000000 00000000 00000000 00001010
    }
}
