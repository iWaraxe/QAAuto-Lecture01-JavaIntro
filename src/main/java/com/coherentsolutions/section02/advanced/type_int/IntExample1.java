// IntExample1.java
package com.coherentsolutions.section02.advanced.type_int;

public class IntExample1 {
    public static void main(String[] args) {
        // Declaration and initialization of int variable
        int i = 1; // 32-bit

        // Print the int value
        System.out.println("int i: " + i);

        // Range of int (-2147483648 to 2147483647)
        System.out.println("Int range: [" + Integer.MIN_VALUE + ", " + Integer.MAX_VALUE + "]");

        // Re-initialization of int variable
        i = 123123;
        System.out.println("Re-initialized int i: " + i);

        // Maximum and minimum values using constants
        int maxInt = Integer.MAX_VALUE;
        int minInt = Integer.MIN_VALUE;
        System.out.println("Integer.MAX_VALUE: " + maxInt);
        System.out.println("Integer.MIN_VALUE: " + minInt);
    }
}
