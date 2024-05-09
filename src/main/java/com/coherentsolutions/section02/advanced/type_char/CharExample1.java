// CharExample1.java
package com.coherentsolutions.section02.advanced.type_char;

public class CharExample1 {
    public static void main(String[] args) {
        // Declaration and initialization of char variable
        char c = 'c'; // 16-bit UTF-16

        // Print the char value
        System.out.println("char c: " + c);

        // Range of char (0 to 65535)
        System.out.println("Char range: [" + (int) Character.MIN_VALUE + ", " + (int) Character.MAX_VALUE + "]");

        // Re-initialization of char variable
        c = 'р'; // Russian letter 'р'
        System.out.println("Re-initialized char c: " + c);

        // Maximum and minimum values using constants
        char maxChar = Character.MAX_VALUE;
        char minChar = Character.MIN_VALUE;
        System.out.println("Character.MAX_VALUE: " + (int) maxChar);
        System.out.println("Character.MIN_VALUE: " + (int) minChar);
    }
}
