// ByteExample1.java
package com.coherentsolutions.section02.advanced.type_byte;

public class ByteExample1 {
    public static void main(String[] args) {
        // Declaration and initialization of byte variable
        byte b = 1; // 8-bit [-128; 127]

        // Print the byte value
        System.out.println("byte b: " + b);

        // Range of byte (-128 to 127)
        System.out.println("Byte range: [" + Byte.MIN_VALUE + ", " + Byte.MAX_VALUE + "]");

        // Re-initialization of byte variable
        b = 2;
        System.out.println("Re-initialized byte b: " + b);

        // Explicit typecasting (CAST)
        byte castedByte = (byte) 128;
        System.out.println("Casted byte from 128: " + castedByte); // Results in -128

        // Maximum and minimum values using constants
        byte maxByte = Byte.MAX_VALUE;
        byte minByte = Byte.MIN_VALUE;
        System.out.println("Byte.MAX_VALUE: " + maxByte);
        System.out.println("Byte.MIN_VALUE: " + minByte);
    }
}
