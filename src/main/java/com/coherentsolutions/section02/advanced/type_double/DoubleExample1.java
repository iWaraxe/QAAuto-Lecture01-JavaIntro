// DoubleExample1.java
package com.coherentsolutions.section02.advanced.type_double;

public class DoubleExample1 {
    public static void main(String[] args) {
        // Declaration and initialization of double variable
        double d = 0.1; // 64-bit

        // Print the double value
        System.out.println("double d: " + d);

        // Range of double (-1.7976931348623157E308 to 1.7976931348623157E308)
        System.out.println("Double range: [" + Double.MIN_VALUE + ", " + Double.MAX_VALUE + "]");

        // Re-initialization of double variable
        d = 123.456;
        System.out.println("Re-initialized double d: " + d);

        // Maximum and minimum values using constants
        double maxDouble = Double.MAX_VALUE;
        double minDouble = Double.MIN_VALUE;
        System.out.println("Double.MAX_VALUE: " + maxDouble);
        System.out.println("Double.MIN_VALUE: " + minDouble);
    }
}
