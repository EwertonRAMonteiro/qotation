package com.rubi.qotation.enums;

public enum Role {
    ADMIN("admin"),
    SUPPLIER("supplier"),
    ASSISTANT("assistant");

    private String role;
    Role(String role) {
        this.role = role;
        }
    }
