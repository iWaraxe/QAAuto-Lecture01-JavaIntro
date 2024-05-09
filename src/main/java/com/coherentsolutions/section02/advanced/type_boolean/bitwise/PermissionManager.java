package com.coherentsolutions.section02.advanced.type_boolean.bitwise;

public class PermissionManager {
    // Define bit flags for different permissions
    private static final int READ_PERMISSION = 1 << 0;  // Binary: 0001
    private static final int WRITE_PERMISSION = 1 << 1; // Binary: 0010
    private static final int EXECUTE_PERMISSION = 1 << 2; // Binary: 0100

    // Check if specific permission is set
    public static boolean hasPermission(int permissions, int permissionToCheck) {
        return (permissions & permissionToCheck) != 0;
    }

    // Grant a specific permission
    public static int grantPermission(int permissions, int permissionToGrant) {
        return permissions | permissionToGrant;
    }

    // Revoke a specific permission
    public static int revokePermission(int permissions, int permissionToRevoke) {
        return permissions & ~permissionToRevoke;
    }

    // Toggle a specific permission
    public static int togglePermission(int permissions, int permissionToToggle) {
        return permissions ^ permissionToToggle;
    }

    public static void main(String[] args) {
        int permissions = 0;

        // Grant Read and Execute permissions
        permissions = grantPermission(permissions, READ_PERMISSION);
        permissions = grantPermission(permissions, EXECUTE_PERMISSION);

        System.out.println("Permissions: " + Integer.toBinaryString(permissions));
        System.out.println("Has Read Permission: " + hasPermission(permissions, READ_PERMISSION));
        System.out.println("Has Write Permission: " + hasPermission(permissions, WRITE_PERMISSION));
        System.out.println("Has Execute Permission: " + hasPermission(permissions, EXECUTE_PERMISSION));

        // Toggle Write Permission (Add)
        permissions = togglePermission(permissions, WRITE_PERMISSION);
        System.out.println("After toggling Write Permission: " + Integer.toBinaryString(permissions));

        // Revoke Execute Permission
        permissions = revokePermission(permissions, EXECUTE_PERMISSION);
        System.out.println("After revoking Execute Permission: " + Integer.toBinaryString(permissions));
    }
}