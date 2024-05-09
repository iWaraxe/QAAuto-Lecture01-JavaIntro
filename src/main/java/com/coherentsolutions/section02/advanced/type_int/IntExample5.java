// IntExample5.java
package com.coherentsolutions.section02.advanced.type_int;

public class IntExample5 {
    public static void main(String[] args) {
        // Demonstrating bit manipulation with int values
        int i = 42; // Binary: 00101010

        // Bitwise AND
        int andResult = i & 0b00001111; // Masking with lower 4 bits
        System.out.println("i & 0b00001111: " + andResult); // Binary: 00001010

        // Bitwise OR
        int orResult = i | 0b11110000; // Setting upper 4 bits
        System.out.println("i | 0b11110000: " + orResult); // Binary: 11111010

        // Bitwise XOR
        int xorResult = i ^ 0b11111111; // Inverting all bits
        System.out.println("i ^ 0b11111111: " + xorResult); // Binary: 11010101

        // Bitwise NOT
        int notResult = ~i; // Inverting all bits
        System.out.println("~i: " + notResult); // Binary: 11010101

        // Bit Shift operations
        int leftShift = i << 2; // Shift left by 2 bits
        int rightShift = i >> 2; // Shift right by 2 bits (sign-extended)
        int unsignedRightShift = i >>> 2; // Unsigned right shift

        System.out.println("i << 2: " + leftShift); // Binary: 10101000
        System.out.println("i >> 2: " + rightShift); // Binary: 00001010
        System.out.println("i >>> 2: " + unsignedRightShift); // Binary: 00001010
    }
}
