package com.thoughtworks.tdd.rule;

public abstract class Rule {
    private Rule successor;

    public String parse(int number) {
        return matches(number) ? output(number) : getSuccessor().parse(number);
    }

    protected abstract boolean matches(int number);

    protected abstract String output(int number);

    private Rule getSuccessor() {
        return successor;
    }

    public Rule setSuccessor(Rule successor) {
        this.successor = successor;
        return successor;
    }
}
