// CharExample4.java
package com.coherentsolutions.section02.advanced.type_char;

public class CharExample4 {
    public static void main(String[] args) {
        // Demonstrating overflow and underflow in char
        char max = Character.MAX_VALUE;
        char min = Character.MIN_VALUE;

        System.out.println("Character.MAX_VALUE: " + (int) max);
        System.out.println("Character.MIN_VALUE: " + (int) min);

        // Working with arithmetic operations
        char overflow = (char) (max + 1); // Wraps around to Character.MIN_VALUE
        char underflow = (char) (min - 1); // Wraps around to Character.MAX_VALUE

        System.out.println("Overflowed Character.MAX_VALUE: " + (int) overflow);
        System.out.println("Underflowed Character.MIN_VALUE: " + (int) underflow);

        // Demonstrating binary representation of char values
        char value = 'A';
        System.out.println("Binary representation of 'A': " + Integer.toBinaryString(value));
    }
}
