package com.thoughtworks.tdd.rule;

public class FizzBuzzRule extends Rule{
    @Override
    protected boolean matches(int number) {
        return number % 15 == 0;
    }

    @Override
    protected String output(int number) {
        return "FizzBuzz";
    }
}
