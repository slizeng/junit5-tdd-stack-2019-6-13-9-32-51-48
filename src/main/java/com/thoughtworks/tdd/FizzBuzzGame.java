package com.thoughtworks.tdd;

import com.thoughtworks.tdd.rule.*;

class FizzBuzzGame {
    private Rule parseRule;

    public FizzBuzzGame() {
        FizzBuzzRule fizzBuzzRule = new FizzBuzzRule();
        FizzRule fizzRule = new FizzRule();
        BuzzRule buzzRule = new BuzzRule();
        WhizzRule whizzRule = new WhizzRule();
        NormalRule normalRule = new NormalRule();

        fizzBuzzRule.setSuccessor(fizzRule);
        fizzRule.setSuccessor(buzzRule);
        buzzRule.setSuccessor(whizzRule);
        whizzRule.setSuccessor(normalRule);

        this.parseRule = fizzBuzzRule;
    }


    public String fizzBuzz(int input) {
        return parseRule.parse(input);
    }
}
