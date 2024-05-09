package com.coherentsolutions.section02.advanced.type_boolean.bitwise;

public class BitwiseOperationsExample {
    public static void main(String[] args) {
        int num1 = 42;  // Binary: 00101010
        int num2 = 15;  // Binary: 00001111

        // Bitwise AND
        int andResult = num1 & num2;  // Binary: 00001010, Decimal: 10
        System.out.println("num1 & num2: " + andResult);

        // Bitwise OR
        int orResult = num1 | num2;  // Binary: 00101111, Decimal: 47
        System.out.println("num1 | num2: " + orResult);

        // Bitwise XOR
        int xorResult = num1 ^ num2;  // Binary: 00100101, Decimal: 37
        System.out.println("num1 ^ num2: " + xorResult);

        // Bitwise NOT
        int notResult = ~num1;  // Binary: 11010101, Decimal: -43
        System.out.println("~num1: " + notResult);

        // Left Shift
        int leftShift = num1 << 2;  // Binary: 10101000, Decimal: 168
        System.out.println("num1 << 2: " + leftShift);

        // Right Shift
        int rightShift = num1 >> 2;  // Binary: 00001010, Decimal: 10
        System.out.println("num1 >> 2: " + rightShift);

        // Unsigned Right Shift
        int unsignedRightShift = num1 >>> 2;  // Binary: 00001010, Decimal: 10
        System.out.println("num1 >>> 2: " + unsignedRightShift);
    }
}
