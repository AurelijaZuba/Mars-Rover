package com.codurance;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

public class MarsRoverShould {


    @Test
    void check_initial_rover_position() {
        int[] gridCoordinates = new int[]{0, 5};
        String direction = "E";
        String command = "";
        String expected = "0, 5, E";

        MarsRover marsRover = new MarsRover(gridCoordinates, direction);
        String actual = marsRover.execute(command);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void check_initial_rover_direction() {
        int[] gridCoordinates = new int[]{0, 5};
        String direction = "N";
        String command = "";
        String expected = "0, 5, N";

        MarsRover marsRover = new MarsRover(gridCoordinates, direction);
        String actual = marsRover.execute(command);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void check_initial_rover_Y_coordinate() {
        int[] gridCoordinates = new int[]{0, 1};
        String direction = "N";
        String command = "";
        String expected = "0, 1, N";

        MarsRover marsRover = new MarsRover(gridCoordinates, direction);
        String actual = marsRover.execute(command);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void check_new_rover_X_coordinate() {
        int[] gridCoordinates = new int[]{1, 1};
        String direction = "N";
        String command = "";
        String expected = "1, 1, N";

        MarsRover marsRover = new MarsRover(gridCoordinates, direction);
        String actual = marsRover.execute(command);

        assertThat(actual).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({
            "R, '0, 0, E'",
            "RR, '0, 0, S'",
            "RRR, '0, 0, W'",
            "RRRR, '0, 0, N'",
            "RRRRR, '0, 0, E'",
            "L, '0, 0, W'",
            "LL, '0, 0, S'",
            "LLL, '0, 0, E'",
            "LLLL, '0, 0, N'"
    })
    void handle_commands(String command, String expectedPosition) {
        final int[] gridCoordinates = {0, 0};
        final String direction = "N";
        MarsRover marsRover = new MarsRover(gridCoordinates, direction);

        String actual = marsRover.execute(command);

        assertThat(actual).isEqualTo(expectedPosition);
    }
}
