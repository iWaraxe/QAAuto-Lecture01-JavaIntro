// CharExample3.java
package com.coherentsolutions.section02.advanced.type_char;

public class CharExample3 {
    public static void main(String[] args) {
        // Arithmetic operations on char variables
        final char c1 = 'p';
        final char c2 = 'q';
        final int sum = c1 + c2;
        final int difference = c1 - c2;
        final int product = c1 * c2;
        final int quotient = c2 / c1;
        final int remainder = c2 % c1;

        System.out.println("c1: " + c1);
        System.out.println("c2: " + c2);
        System.out.println("Sum (int): " + sum);
        System.out.println("Difference (int): " + difference);
        System.out.println("Product (int): " + product);
        System.out.println("Quotient (int): " + quotient);
        System.out.println("Remainder (int): " + remainder);

        // Working with integer literals
        final char c3 = 123;
        final char c4 = 124;
        final char c5 = 23567; // Chinese character '小'

        System.out.println("char 123: " + c3); // Curly brace '{'
        System.out.println("char 124: " + c4); // Vertical bar '|'
        System.out.println("char 23567: " + c5); // Chinese character '小'
    }
}
