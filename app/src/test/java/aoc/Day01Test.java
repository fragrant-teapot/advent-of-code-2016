package aoc;


import aoc.day01.Day01;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Day01Test {

    @Test
    public void testPart1() {
        // Given
        List<String> input = Collections.singletonList("test");

        // When
        String result = new Day01().part1(input);

        // Then
        assertEquals(input.getFirst(), result);
    }

    @Test
    public void testPart2() {
        // Given
        List<String> input = Collections.singletonList("test");

        // When
        String result = new Day01().part2(input);

        // Then
        assertEquals(input.getFirst(), result);
    }
}