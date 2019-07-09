package com.codurance;

public class Coordinates {
    int[] gridCoordinates;

    public int[] getGridCoordinates() {

        return gridCoordinates;
    }

    public void setGridCoordinates(int[] gridCoordinates) {

        this.gridCoordinates = gridCoordinates;
    }

    public Coordinates() {
    }

    void moveSouth() {
        if (gridCoordinates[1] > 0) {
            gridCoordinates[1] -= 1;
            return;
        }
        gridCoordinates[1] = 9;
    }

    void moveWest() {
        if (gridCoordinates[0] > 0) {
            gridCoordinates[0] -= 1;
            return;
        }
        gridCoordinates[0] = 9;
    }

    void moveNorth() {
        if (gridCoordinates[1] < 9) {
            gridCoordinates[1] += 1;
            return;
        }
        gridCoordinates[1] = 0;
    }

    void moveEast() {
        if (gridCoordinates[0] < 9) {
            gridCoordinates[0] += 1;
            return;
        }
        gridCoordinates[0] = 0;
    }

}