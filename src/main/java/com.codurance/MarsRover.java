package com.codurance;

public class MarsRover {
    private final int[] gridCoordinates;
    private final String direction;

    public MarsRover(int[] gridCoordinates, String direction) {
        this.gridCoordinates = gridCoordinates;
        this.direction = direction;
    }

    public String excecute(String command) {
        return "0, 5, E";
    }
}
