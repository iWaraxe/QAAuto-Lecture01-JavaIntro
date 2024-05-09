// ShortExample2.java
package com.coherentsolutions.section02.advanced.type_short;

public class ShortExample2 {
    public static void main(String[] args) {
        // Declaring a short variable and assigning a value later
        short s;
        s = 1;
        System.out.println("Assigned short s: " + s);

        // Re-initialization
        s = 2;
        System.out.println("Re-initialized short s: " + s);

        // Using final to make an immutable short variable
        final short sFinal = 1;
        System.out.println("Immutable final short sFinal: " + sFinal);

        // Compilation error if trying to change value of final variable
        // sFinal = 2; // Uncommenting this line will cause a compilation error
    }
}
