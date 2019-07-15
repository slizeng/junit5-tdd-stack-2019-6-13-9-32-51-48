package com.thoughtworks.tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzGameTest {
    private FizzBuzzGame fizzBuzzGame;

    @BeforeEach
    void setUp() {
        fizzBuzzGame = new FizzBuzzGame();
    }

    @Test
    void should_return_number_as_string_when_fizzBuzz_with_number_one() {
        String result = fizzBuzzGame.fizzBuzz(1);

        assertThat(result, is("1"));
    }

    @Test
    void should_return_fizz_when_fizzBuzz_with_number_three() {
        String result = fizzBuzzGame.fizzBuzz(3);

        assertEquals(result, "Fizz");
    }

    @Test
    void should_return_Buzz_when_fizzBuzz_with_number_five() {
        String result = fizzBuzzGame.fizzBuzz(5);

        assertEquals(result, "Buzz");
    }
}
