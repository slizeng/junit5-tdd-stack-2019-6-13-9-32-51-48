package com.thoughtworks.tdd.rule;

public class NormalRule extends Rule {
    @Override
    public String parse(int number) {
        return String.valueOf(number);
    }
}
