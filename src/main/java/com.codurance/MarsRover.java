package com.codurance;

public class MarsRover {
    private final State state;

    public MarsRover(int[] gridCoordinates, String direction) {
        state = new State(gridCoordinates, Compass.convertFromString(direction));
    }

    public String execute(String command) {
        handleInstructions(command);

        return state.toString();
    }

    private void handleInstructions(String command) {
        char[] split = command.toCharArray();

        for (char instruction : split) {
            executeCommand(instruction);
        }
    }

    private void executeCommand(char instruction) {
        if (instruction == 'R')
            state.rotateRight();
        if (instruction == 'L') {
            state.rotateLeft();
        }
        if(instruction == 'M')
            state.moveForward();
    }
}
