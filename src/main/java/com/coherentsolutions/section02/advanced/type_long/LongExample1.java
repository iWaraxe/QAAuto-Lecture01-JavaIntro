// LongExample1.java
package com.coherentsolutions.section02.advanced.type_long;

public class LongExample1 {
    public static void main(String[] args) {
        // Declaration and initialization of long variable
        long l = 1000; // 64-bit (default int literal)

        // Print the long value
        System.out.println("long l: " + l);

        // Range of long (-9223372036854775808 to 9223372036854775807)
        System.out.println("Long range: [" + Long.MIN_VALUE + ", " + Long.MAX_VALUE + "]");

        // Re-initialization of long variable
        l = 123123456789L; // Explicit long literal using 'L'
        System.out.println("Re-initialized long l: " + l);

        // Maximum and minimum values using constants
        long maxLong = Long.MAX_VALUE;
        long minLong = Long.MIN_VALUE;
        System.out.println("Long.MAX_VALUE: " + maxLong);
        System.out.println("Long.MIN_VALUE: " + minLong);
    }
}
