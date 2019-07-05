package com.codurance;

public enum Compass {
    NORTH("N"), EAST("E"), SOUTH("S"), WEST("W");
    private String value;

    public String getValue() {
        return value;
    }

    Compass(String value) {
        this.value = value;
    }
}