package com.codurance;

public class State {
    private final int[] gridCoordinates;

    private Compass direction;

    public State(int[] gridCoordinates, Compass direction) {
        this.gridCoordinates = gridCoordinates;
        this.direction = direction;
    }

    @Override
    public String toString() {
        return gridCoordinates[0] + ", " + gridCoordinates[1] + ", " + direction.getValue();
    }

    void rotateLeft() {
        if(direction.equals(Compass.NORTH)) {
            this.direction = Compass.WEST;
            return;
        }
        if(direction.equals(Compass.WEST)) {
            this.direction = Compass.SOUTH;
            return;
        }
        if(direction.equals(Compass.SOUTH)) {
            this.direction = Compass.EAST;
            return;
        }
        if(direction.equals(Compass.EAST)) {
            this.direction = Compass.NORTH;
        }
    }

    void rotateRight() {
        if(direction.equals(Compass.NORTH)) {
            this.direction = Compass.EAST;
            return;
        }
        if(direction.equals(Compass.EAST)) {
            this.direction = Compass.SOUTH;
            return;
        }
        if(direction.equals(Compass.SOUTH)) {
            this.direction = Compass.WEST;
            return;
        }
        if(direction.equals(Compass.WEST)) {
            this.direction = Compass.NORTH;
        }
    }

    public void moveForward() {
        if(direction.equals(Compass.EAST))
            gridCoordinates[0] = 1;

        if(direction.equals(Compass.NORTH))
        if (gridCoordinates[1] < 9) {
            gridCoordinates[1] += 1;
            return;
        }
        gridCoordinates[1] = 0;
    }
}