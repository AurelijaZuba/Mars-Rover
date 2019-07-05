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
            if (instruction == 'R')
                rotateRight();
            if (instruction == 'L')
                direction = Compass.WEST.getValue();
        }
    }

    private void rotateRight() {
        if(direction.equals(Compass.NORTH.getValue())) {
            direction = Compass.EAST.getValue();
            return;
        }
        if(direction.equals(Compass.EAST.getValue())) {
            direction = Compass.SOUTH.getValue();
            return;
        }
        if(direction.equals(Compass.SOUTH.getValue())) {
            direction = Compass.WEST.getValue();
            return;
        }
        if(direction.equals(Compass.WEST.getValue())) {
            direction = Compass.NORTH.getValue();
            return;
        }
    }
}
