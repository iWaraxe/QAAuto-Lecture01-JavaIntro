package com.coherentsolutions.section02.advanced.type_boolean;

public class BooleanExample2 {
    public static void main(String[] args) {
        // Using boolean in conditional statements
        boolean isSunny = true;
        boolean isWeekend = false;

        if (isSunny && isWeekend) {
            System.out.println("Let's go to the beach!");
        } else if (isSunny) {
            System.out.println("Let's go for a walk!");
        } else if (isWeekend) {
            System.out.println("Let's stay home and watch movies.");
        } else {
            System.out.println("Let's focus on work.");
        }

        // Example of boolean comparison in conditional statements
        boolean isRaining = false;
        if (isRaining) {
            System.out.println("It's raining. Take an umbrella.");
        } else {
            System.out.println("No need for an umbrella.");
        }

        // Ternary operation using boolean
        String weatherMessage = isRaining ? "Rainy day" : "Sunny day";
        System.out.println("Weather message: " + weatherMessage);
    }
}