package com.thoughtworks.tdd.rule;

public class BuzzWhizzRule extends Rule{
    @Override
    protected boolean matches(int number) {
        return number % 35 == 0;
    }

    @Override
    protected String output(int number) {
        return "BuzzWhizz";
    }
}
