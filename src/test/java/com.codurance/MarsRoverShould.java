package com.codurance;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MarsRoverShould {


    @Test
    void check_initial_rover_position() {
        int[] gridCoordinates = new int[] {0 , 5};
        String direction = "E";
        String command = "";
        String expected = "0, 5, E";

        MarsRover marsRover = new MarsRover(gridCoordinates, direction);
        String actual = marsRover.execute(command);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void check_initial_rover_direction() {
        int[] gridCoordinates = new int[] {0 , 5};
        String direction = "N";
        String command = "";
        String expected = "0, 5, N";

        MarsRover marsRover = new MarsRover(gridCoordinates, direction);
        String actual = marsRover.execute(command);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void check_initial_rover_Y_coordinate() {
        int[] gridCoordinates = new int[] {0 , 1};
        String direction = "N";
        String command = "";
        String expected = "0, 1, N";

        MarsRover marsRover = new MarsRover(gridCoordinates, direction);
        String actual = marsRover.execute(command);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void check_new_rover_X_coordinate() {
        int[] gridCoordinates = new int[] {1 , 1};
        String direction = "N";
        String command = "";
        String expected = "1, 1, N";

        MarsRover marsRover = new MarsRover(gridCoordinates, direction);
        String actual = marsRover.execute(command);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void rotate_once_right() {
        final int[] gridCoordinates = {0, 0};
        final String direction = "N";
        MarsRover marsRover = new MarsRover(gridCoordinates, direction);
        String expected =  "0, 0, E";

        String actual = marsRover.execute("R");

        assertThat(actual).isEqualTo(expected);
    }
}
