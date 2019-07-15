package com.thoughtworks.tdd.rule;

public class WhizzRule extends Rule {
    private static final int NUMBER = 7;

    @Override
    protected boolean shouldTake(int number) {
        return number % NUMBER == 0;
    }

    @Override
    protected String output(int number) {
        return "Whizz";
    }
}
