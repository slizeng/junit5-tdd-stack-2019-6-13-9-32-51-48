package com.thoughtworks.tdd.rule;

public class BuzzRule extends Rule {
    private static final int NUMBER = 5;

    @Override
    public String parse(int number) {
        if (number % NUMBER == 0) {
            return "Buzz";
        }

        return getSuccessor().parse(number);
    }
}
