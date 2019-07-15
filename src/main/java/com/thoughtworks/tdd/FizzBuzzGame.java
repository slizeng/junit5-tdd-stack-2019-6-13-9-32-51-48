package com.thoughtworks.tdd;

import static java.lang.String.valueOf;

class FizzBuzzGame {
    String fizzBuzz(int input) {
        if (isDividedByThree(input)) {
            return "Fizz";
        }

        if (isDividedByFive(input)) {
            return "Buzz";
        }

        return valueOf(input);
    }

    private boolean isDividedByFive(int input) {
        return input % 5 == 0;
    }

    private boolean isDividedByThree(int input) {
        return input % 3 == 0;
    }
}
