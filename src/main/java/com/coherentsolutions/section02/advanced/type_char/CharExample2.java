// CharExample2.java
package com.coherentsolutions.section02.advanced.type_char;

public class CharExample2 {
    public static void main(String[] args) {
        // Declaring a char variable and assigning a value later
        char c;
        c = 'a';
        System.out.println("Assigned char c: " + c);

        // Re-initialization
        c = 'z';
        System.out.println("Re-initialized char c: " + c);

        // Using final to make an immutable char variable
        final char cFinal = 'A';
        System.out.println("Immutable final char cFinal: " + cFinal);

        // Compilation error if trying to change value of final variable
        // cFinal = 'B'; // Uncommenting this line will cause a compilation error

        // Working with Unicode notation
        char unicodeChar = '\u1234';
        System.out.println("Unicode char \\u1234: " + unicodeChar); // Ethiopian alphabet syllable 'ሴ'
    }
}
