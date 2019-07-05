package com.codurance;

public enum Compass {
    NORTH("N"), EAST("E"), SOUTH("S"), WEST("W");
    private String value;

    public String getValue() {

        return value;
    }

    public static Compass convertFromString(String values) {
        if (values.equals("N")) {
            return Compass.NORTH;
        }
        if (values.equals("E")) {
            return Compass.EAST;
        }
        if (values.equals("S")) {
            return Compass.SOUTH;
        }
        if (values.equals("W")) {
            return Compass.WEST;
        }
        return null;
    }

    Compass(String value) {

        this.value = value;
    }
}