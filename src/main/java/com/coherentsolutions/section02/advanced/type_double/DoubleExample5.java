// DoubleExample5.java
package com.coherentsolutions.section02.advanced.type_double;

public class DoubleExample5 {
    public static void main(String[] args) {
        // Demonstrating bit manipulation with double values
        double d = 1.5; // Binary representation

        // Bitwise AND (Requires long conversion)
        long bits = Double.doubleToLongBits(d);
        long andResult = bits & 0x7FFFFFFFFFFFFFFFL; // Clearing the sign bit
        System.out.println("d & 0x7FFFFFFFFFFFFFFF (Clear sign bit): " + Double.longBitsToDouble(andResult));

        // Bitwise OR (Requires long conversion)
        long orResult = bits | 0x8000000000000000L; // Setting the sign bit
        System.out.println("d | 0x8000000000000000 (Set sign bit): " + Double.longBitsToDouble(orResult));

        // Bitwise XOR (Requires long conversion)
        long xorResult = bits ^ 0x8000000000000000L; // Toggling the sign bit
        System.out.println("d ^ 0x8000000000000000 (Toggle sign bit): " + Double.longBitsToDouble(xorResult));

        // Bitwise NOT (Requires long conversion)
        long notResult = ~bits;
        System.out.println("~d: " + Double.longBitsToDouble(notResult));
    }
}
