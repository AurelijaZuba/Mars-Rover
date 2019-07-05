package com.codurance;

public class MarsRover {
    private final int[] gridCoordinates;
    private final String direction;

    public MarsRover(int[] gridCoordinates, String direction) {
        this.gridCoordinates = gridCoordinates;
        this.direction = direction;
    }

    public String excecute(String command) {
        return gridCoordinates[0] + ", " + gridCoordinates[1] + ", " + direction;
    }
}