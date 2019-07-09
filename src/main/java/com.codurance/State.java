package com.codurance;

public class State {
    final Coordinates coordinates = new Coordinates();

    private Compass direction;

    public State(int[] gridCoordinates, Compass direction) {
        this.coordinates.setGridCoordinates(gridCoordinates);
        this.direction = direction;
    }

    @Override
    public String toString() {
        return coordinates.getGridCoordinates()[0] + ", " + coordinates.getGridCoordinates()[1] + ", " + direction.getValue();
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
        if (direction.equals(Compass.EAST)) {
            coordinates.moveEast();
        }

        if (direction.equals(Compass.NORTH)) {
            coordinates.moveNorth();
        }

        if (direction.equals(Compass.WEST)) {
            coordinates.moveWest();
        }
        if (direction.equals(Compass.SOUTH)) {
            coordinates.moveSouth();
        }
    }
}