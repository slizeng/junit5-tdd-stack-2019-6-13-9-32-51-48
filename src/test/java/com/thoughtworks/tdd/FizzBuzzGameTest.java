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

    @Test
    void should_return_Whizz_when_fizzBuzz_with_number_seven() {
        String result = fizzBuzzGame.fizzBuzz(7);

        assertEquals(result, "Whizz");
    }

    @Test
    void should_return_FizzBuzz_when_fizzBuzz_with_number_fifteen() {
        String result = fizzBuzzGame.fizzBuzz(15);

        assertEquals(result, "FizzBuzz");
    }

    @Test
    void should_return_FizzWhizz_when_fizzBuzz_with_number_twenty_one() {
        String result = fizzBuzzGame.fizzBuzz(21);

        assertEquals(result, "FizzWhizz");
    }

    @Test
    void should_return_BuzzWhizz_when_fizzBuzz_with_number_thirty_five() {
        String result = fizzBuzzGame.fizzBuzz(35);

        assertEquals(result, "BuzzWhizz");
    }

    @Test
    void should_return_FizzBuzzWhizz_when_fizzBuzz_with_number_thirty_five() {
        String result = fizzBuzzGame.fizzBuzz(105);

        assertEquals(result, "FizzBuzzWhizz");
    }
}
