package com.thoughtworks.tdd.rule;

public class NormalRule extends Rule {
    @Override
    protected boolean shouldTake(int number) {
        return true;
    }

    @Override
    protected String output(int number) {
        return String.valueOf(number);
    }
}
