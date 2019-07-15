package com.thoughtworks.tdd.rule;

public class FizzRule extends Rule {

    private static final int NUMBER = 3;

    @Override
    protected boolean shouldTake(int number) {
        return number % NUMBER == 0;
    }

    @Override
    protected String output(int number) {
        return "Fizz";
    }
}
