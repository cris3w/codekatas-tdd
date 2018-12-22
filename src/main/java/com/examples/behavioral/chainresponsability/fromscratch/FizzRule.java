package com.examples.behavioral.chainresponsability.fromscratch;

public class FizzRule implements Rule {

    @Override
    public boolean canApply(int number) {
        return number % 3 == 0;
    }

    @Override
    public String apply() {
        return "Fizz";
    }
}
