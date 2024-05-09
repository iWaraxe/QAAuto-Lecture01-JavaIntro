// CharExample5.java
package com.coherentsolutions.section02.advanced.type_char;

public class CharExample5 {
    public static void main(String[] args) {
        // Demonstrating bit manipulation with char values
        char c = 'A'; // Binary: 00000000 01000001

        // Bitwise AND
        char andResult = (char) (c & 0b00011111); // Masking with lower 5 bits
        System.out.println("c & 0b00011111: " + andResult); // Binary: 00000000 00010001

        // Bitwise OR
        char orResult = (char) (c | 0b11000000); // Setting upper 2 bits
        System.out.println("c | 0b11000000: " + orResult); // Binary: 00000000 11000001

        // Bitwise XOR
        char xorResult = (char) (c ^ 0b11111111); // Inverting all bits
        System.out.println("c ^ 0b11111111: " + xorResult); // Binary: 11111111 10111110

        // Bitwise NOT
        char notResult = (char) ~c; // Inverting all bits
        System.out.println("~c: " + notResult); // Binary: 11111111 10111110

        // Bit Shift operations
        char leftShift = (char) (c << 2); // Shift left by 2 bits
        char rightShift = (char) (c >> 2); // Shift right by 2 bits
        char unsignedRightShift = (char) ((c & 0xFFFF) >>> 2); // Unsigned right shift

        System.out.println("c << 2: " + (int) leftShift); // Binary: 00000001 00000100
        System.out.println("c >> 2: " + (int) rightShift); // Binary: 00000000 00010000
        System.out.println("c >>> 2: " + (int) unsignedRightShift); // Binary: 00000000 00010000
    }
}
