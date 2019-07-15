package com.thoughtworks.tdd.rule;

public class WhizzRule extends Rule {
    private static final int NUMBER = 7;

    @Override
    public String parse(int number) {
        if (number % NUMBER == 0) {
            return "Whizz";
        }

        return getSuccessor().parse(number);
    }
}
