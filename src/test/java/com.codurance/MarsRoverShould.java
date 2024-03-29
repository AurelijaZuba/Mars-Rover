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
            "LLLL, '0, 0, N'",
            "M, '0, 1, N'",
            "MM, '0, 2, N'",
            "MMMMMMMMM, '0, 9, N'",
            "MMMMMMMMMM, '0, 0, N'",
            "RM, '1, 0, E'",
            "RMM, '2, 0, E'",
            "RMMMMMMMMM, '9, 0, E'",
            "RMMMMMMMMMM, '0, 0, E'",
            "RMLLM, '0, 0, W'",
            "LM, '9, 0, W'",
            "LMM, '8, 0, W'",
            "MLLM, '0, 0, S'",
            "LLM, '0, 9, S'"
    })
    void handle_commands(String command, String expectedPosition) {
        final int[] gridCoordinates = {0, 0};
        final String direction = "N";
        MarsRover marsRover = new MarsRover(gridCoordinates, direction);

        String actual = marsRover.execute(command);

        assertThat(actual).isEqualTo(expectedPosition);
    }
}
