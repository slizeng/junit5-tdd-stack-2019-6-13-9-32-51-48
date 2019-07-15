package com.thoughtworks.tdd;

import com.thoughtworks.tdd.rule.*;

class FizzBuzzGame {
    private Rule parseRule;

    public FizzBuzzGame() {
        Rule rule = new FizzBuzzRule();

        rule.setSuccessor(new FizzWhizzRule())
                .setSuccessor(new BuzzWhizzRule())
                .setSuccessor(new FizzRule())
                .setSuccessor(new BuzzRule())
                .setSuccessor(new WhizzRule())
                .setSuccessor(new NormalRule());

        this.parseRule = rule;
    }


    public String fizzBuzz(int input) {
        return parseRule.parse(input);
    }
}
