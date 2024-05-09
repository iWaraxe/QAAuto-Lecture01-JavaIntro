// FloatExample5.java
package com.coherentsolutions.section02.advanced.type_float;

public class FloatExample5 {
    public static void main(String[] args) {
        // Demonstrating bit manipulation with float values
        float f = 1.5f; // Binary representation

        // Bitwise AND (Requires int conversion)
        int bits = Float.floatToIntBits(f);
        int andResult = bits & 0x7FFFFFFF; // Clearing the sign bit
        System.out.println("f & 0x7FFFFFFF (Clear sign bit): " + Float.intBitsToFloat(andResult));

        // Bitwise OR (Requires int conversion)
        int orResult = bits | 0x80000000; // Setting the sign bit
        System.out.println("f | 0x80000000 (Set sign bit): " + Float.intBitsToFloat(orResult));

        // Bitwise XOR (Requires int conversion)
        int xorResult = bits ^ 0x80000000; // Toggling the sign bit
        System.out.println("f ^ 0x80000000 (Toggle sign bit): " + Float.intBitsToFloat(xorResult));

        // Bitwise NOT (Requires int conversion)
        int notResult = ~bits;
        System.out.println("~f: " + Float.intBitsToFloat(notResult));
    }
}
