package com.thoughtworks.tdd;

import static java.lang.String.valueOf;

class FizzBuzzGame {
    String fizzBuzz(int input) {
        if (isDividedByThree(input)) {
            return "Fizz";
        }

        return valueOf(input);
    }

    private boolean isDividedByThree(int input) {
        return input % 3 == 0;
    }
}
