package com.thoughtworks.tdd.rule;

public class BuzzRule extends Rule {
    private static final int NUMBER = 5;

    @Override
    protected boolean matches(int number) {
        return number % NUMBER == 0;
    }

    @Override
    protected String output(int number) {
        return "Buzz";
    }
}
