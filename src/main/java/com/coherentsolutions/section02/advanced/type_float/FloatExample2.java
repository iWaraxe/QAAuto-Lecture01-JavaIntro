// FloatExample2.java
package com.coherentsolutions.section02.advanced.type_float;

public class FloatExample2 {
    public static void main(String[] args) {
        // Declaring a float variable and assigning a value later
        float f;
        f = 0.1f;
        System.out.println("Assigned float f: " + f);

        // Re-initialization
        f = 1.23f;
        System.out.println("Re-initialized float f: " + f);

        // Using final to make an immutable float variable
        final float fFinal = 0.1f;
        System.out.println("Immutable final float fFinal: " + fFinal);

        // Compilation error if trying to change value of final variable
        // fFinal = 0.2f; // Uncommenting this line will cause a compilation error

        // Working with underscores for better readability
        float oneMillion = 1_000_000.0f;
        float oneThousand = 1_000.0f;
        System.out.println("float oneMillion: " + oneMillion);
        System.out.println("float oneThousand: " + oneThousand);
    }
}
