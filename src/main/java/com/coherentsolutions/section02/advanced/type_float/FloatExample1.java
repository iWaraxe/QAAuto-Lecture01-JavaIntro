// FloatExample1.java
package com.coherentsolutions.section02.advanced.type_float;

public class FloatExample1 {
    public static void main(String[] args) {
        // Declaration and initialization of float variable
        float f = 0.1f; // 32-bit

        // Print the float value
        System.out.println("float f: " + f);

        // Range of float (-3.4028235E38 to 3.4028235E38)
        System.out.println("Float range: [" + Float.MIN_VALUE + ", " + Float.MAX_VALUE + "]");

        // Re-initialization of float variable
        f = 123.456f;
        System.out.println("Re-initialized float f: " + f);

        // Maximum and minimum values using constants
        float maxFloat = Float.MAX_VALUE;
        float minFloat = Float.MIN_VALUE;
        System.out.println("Float.MAX_VALUE: " + maxFloat);
        System.out.println("Float.MIN_VALUE: " + minFloat);
    }
}
