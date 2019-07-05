package com.codurance;

public class MarsRover {
    private final int[] gridCoordinates;
    private Compass direction;

    public MarsRover(int[] gridCoordinates, String direction) {
        this.gridCoordinates = gridCoordinates;
        this.direction = Compass.convertFromString(direction);
    }

    public String execute(String command) {
        handleInstructions(command);

        return gridCoordinates[0] + ", " + gridCoordinates[1] + ", " + direction.getValue();
    }

    private void handleInstructions(String command) {
        char[] split = command.toCharArray();

        for (char instruction : split) {
            if (instruction == 'R')
                rotateRight();
            if (instruction == 'L')
                direction = Compass.WEST;
        }
    }

    private void rotateRight() {
        if(direction.equals(Compass.NORTH)) {
            direction = Compass.EAST;
            return;
        }
        if(direction.equals(Compass.EAST)) {
            direction = Compass.SOUTH;
            return;
        }
        if(direction.equals(Compass.SOUTH)) {
            direction = Compass.WEST;
            return;
        }
        if(direction.equals(Compass.WEST)) {
            direction = Compass.NORTH;
            return;
        }
    }
}
