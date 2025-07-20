package com.rubi.qotation.enums;

public enum Role {
    ADMIN("admin"),
    SUPPLIER("supplier"),
    ASSISTANT("assistant");

    private final String role;

    Role(String role) {
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public static Role fromString(String text) {
        for (Role r : Role.values()) {
            if (r.role.equalsIgnoreCase(text)) {
                return r;
            }
        }
        throw new IllegalArgumentException("No role with text: " + text);
    }
}
