// LongExample2.java
package com.coherentsolutions.section02.advanced.type_long;

public class LongExample2 {
    public static void main(String[] args) {
        // Declaring a long variable and assigning a value later
        long l;
        l = 1000L;
        System.out.println("Assigned long l: " + l);

        // Re-initialization
        l = 1_000_000L;
        System.out.println("Re-initialized long l: " + l);

        // Using final to make an immutable long variable
        final long lFinal = 123123456789L;
        System.out.println("Immutable final long lFinal: " + lFinal);

        // Compilation error if trying to change value of final variable
        // lFinal = 456456456L; // Uncommenting this line will cause a compilation error

        // Using underscores for better readability
        long million = 1_000_000L;
        long billion = 1_000_000_000L;
        long trillion = 1_000_000_000_000L;
        System.out.println("long million: " + million);
        System.out.println("long billion: " + billion);
        System.out.println("long trillion: " + trillion);

        // Separating digits for improved readability
        long tenThousand = 10_000L;
        System.out.println("long tenThousand: " + tenThousand);
    }
}
