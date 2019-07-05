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
        if(command.equals("RRR"))
            direction =  "W";

        if(command.equals("RR"))
            direction =  "S";

        if(command.equals("R"))
           direction = "E";
    }

}
