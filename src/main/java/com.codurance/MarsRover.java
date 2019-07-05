package com.codurance;

public class MarsRover {
    private final int[] gridCoordinates;
    private String direction;

    public MarsRover(int[] gridCoordinates, String direction) {
        this.gridCoordinates = gridCoordinates;
        this.direction = direction;
    }

    public String execute(String command) {
        handleInstructions(command);

        return gridCoordinates[0] + ", " + gridCoordinates[1] + ", " + direction;
    }

    private void handleInstructions(String command) {
        char[] split = command.toCharArray();

        if (split.length == 1)
            direction = "E";

        if (split.length == 2)
            direction = "S";

        if (split.length == 3)
            direction = "W";
    }
}
