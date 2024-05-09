package com.coherentsolutions.section02.advanced.type_boolean;

public class BooleanExample4 {
    // Custom boolean operations
    public static boolean customAnd(boolean bool1, boolean bool2) {
        return bool1 && bool2;
    }

    public static boolean customOr(boolean bool1, boolean bool2) {
        return bool1 || bool2;
    }

    public static boolean customXor(boolean bool1, boolean bool2) {
        return bool1 ^ bool2;
    }

    public static boolean customNot(boolean bool) {
        return !bool;
    }

    public static void main(String[] args) {
        // Testing custom boolean operations
        boolean bool1 = true;
        boolean bool2 = false;

        System.out.println("customAnd(true, false): " + customAnd(bool1, bool2));
        System.out.println("customOr(true, false): " + customOr(bool1, bool2));
        System.out.println("customXor(true, false): " + customXor(bool1, bool2));
        System.out.println("customNot(true): " + customNot(bool1));
        System.out.println("customNot(false): " + customNot(bool2));
    }
}