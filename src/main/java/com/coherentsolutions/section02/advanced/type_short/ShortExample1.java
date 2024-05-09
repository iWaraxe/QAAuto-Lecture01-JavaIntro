// ShortExample1.java
package com.coherentsolutions.section02.advanced.type_short;

public class ShortExample1 {
    public static void main(String[] args) {
        // Declaration and initialization of short variable
        short s = 1; // 16-bit

        // Print the short value
        System.out.println("short s: " + s);

        // Range of short (-32768 to 32767)
        System.out.println("Short range: [" + Short.MIN_VALUE + ", " + Short.MAX_VALUE + "]");

        // Re-initialization of short variable
        s = 2;
        System.out.println("Re-initialized short s: " + s);

        // Maximum and minimum values using constants
        short maxShort = Short.MAX_VALUE;
        short minShort = Short.MIN_VALUE;
        System.out.println("Short.MAX_VALUE: " + maxShort);
        System.out.println("Short.MIN_VALUE: " + minShort);
    }
}
