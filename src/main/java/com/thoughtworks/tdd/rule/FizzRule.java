package com.thoughtworks.tdd.rule;

public class FizzRule extends Rule {

    private static final int NUMBER = 3;

    @Override
    public String parse(int number) {
        if (number % NUMBER == 0) {
            return "Fizz";
        }

        return getSuccessor().parse(number);
    }
}
