package com.thoughtworks.tdd.rule;

public class FizzWhizzRule extends Rule {
    @Override
    protected boolean matches(int number) {
        return number % 21 == 0;
    }

    @Override
    protected String output(int number) {
        return "FizzWhizz";
    }
}
