package com.thoughtworks.tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class FizzBuzzGameTest {
    private FizzBuzzGame fizzBuzzGame;

    @BeforeEach
    void setUp() {
        fizzBuzzGame = new FizzBuzzGame();
    }

    @Test
    void should_return_number_as_string_when_call_fizzBuzz_with_number_one() {
        String result = fizzBuzzGame.fizzBuzz(1);

        assertThat(result, is("1"));
    }
}
