package com.thoughtworks.tdd.rule;

public class FizzBuzzWhizzRule extends Rule {
    @Override
    protected boolean matches(int number) {
        return number % 105 == 0;
    }

    @Override
    protected String output(int number) {
        return "FizzBuzzWhizz";
    }
}
