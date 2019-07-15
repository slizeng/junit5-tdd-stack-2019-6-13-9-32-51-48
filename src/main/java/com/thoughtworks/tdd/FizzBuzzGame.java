package com.thoughtworks.tdd;

import com.thoughtworks.tdd.rule.*;

class FizzBuzzGame {
    private Rule parseRule;

    public FizzBuzzGame() {
        FizzBuzzRule fizzBuzzRule = new FizzBuzzRule();
        FizzWhizzRule fizzWhizzRule = new FizzWhizzRule();
        FizzRule fizzRule = new FizzRule();
        BuzzRule buzzRule = new BuzzRule();
        WhizzRule whizzRule = new WhizzRule();
        NormalRule normalRule = new NormalRule();

        fizzBuzzRule
                .setSuccessor(fizzWhizzRule)
                .setSuccessor(fizzRule)
                .setSuccessor(buzzRule)
                .setSuccessor(whizzRule)
                .setSuccessor(normalRule);

        this.parseRule = fizzBuzzRule;
    }


    public String fizzBuzz(int input) {
        return parseRule.parse(input);
    }
}
