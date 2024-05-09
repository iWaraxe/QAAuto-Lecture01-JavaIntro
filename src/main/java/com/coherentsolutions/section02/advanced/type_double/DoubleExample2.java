// DoubleExample2.java
package com.coherentsolutions.section02.advanced.type_double;

public class DoubleExample2 {
    public static void main(String[] args) {
        // Declaring a double variable and assigning a value later
        double d;
        d = 0.1;
        System.out.println("Assigned double d: " + d);

        // Re-initialization
        d = 1.23;
        System.out.println("Re-initialized double d: " + d);

        // Using final to make an immutable double variable
        final double dFinal = 0.1;
        System.out.println("Immutable final double dFinal: " + dFinal);

        // Compilation error if trying to change value of final variable
        // dFinal = 0.2; // Uncommenting this line will cause a compilation error

        // Working with underscores for better readability
        double oneMillion = 1_000_000.0;
        double oneThousand = 1_000.0;
        System.out.println("double oneMillion: " + oneMillion);
        System.out.println("double oneThousand: " + oneThousand);
    }
}
