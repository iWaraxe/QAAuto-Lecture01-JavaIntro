// IntExample2.java
package com.coherentsolutions.section02.advanced.type_int;

public class IntExample2 {
    public static void main(String[] args) {
        // Declaring an int variable and assigning a value later
        int i;
        i = 1000;
        System.out.println("Assigned int i: " + i);

        // Re-initialization
        i = 1000000;
        System.out.println("Re-initialized int i: " + i);

        // Using final to make an immutable int variable
        final int iFinal = 123123;
        System.out.println("Immutable final int iFinal: " + iFinal);

        // Compilation error if trying to change value of final variable
        // iFinal = 456456; // Uncommenting this line will cause a compilation error

        // Using underscores for better readability
        int million = 1_000_000;
        int billion = 1_000_000_000;
        System.out.println("int million: " + million);
        System.out.println("int billion: " + billion);

        // Separating digits for improved readability
        int tenThousand = 10_000;
        System.out.println("int tenThousand: " + tenThousand);
    }
}
