package com.thoughtworks.tdd.rule;

public abstract class Rule {
    private Rule successor;

    public abstract String parse(int number);

    Rule getSuccessor() {
        return successor;
    }

    public void setSuccessor(Rule successor) {
        this.successor = successor;
    }
}
