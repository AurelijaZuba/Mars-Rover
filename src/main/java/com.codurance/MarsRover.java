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

        for (char instruction : split) {
            if(direction.equals("N")) {
                direction = "E";
                continue;
            }
            if(direction.equals("E")) {
                direction = "S";
                continue;
            }
            if(direction.equals("S")) {
                direction = "W";
                continue;
            }
            if(direction.equals("W")) {
                direction = "N";
                continue;
            }
        }
    }
}
