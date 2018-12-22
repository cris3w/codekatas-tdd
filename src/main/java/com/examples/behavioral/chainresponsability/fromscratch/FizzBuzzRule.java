package com.examples.behavioral.chainresponsability.fromscratch;

public class FizzBuzzRule implements Rule {

    @Override
    public boolean canApply(int number) {
        return number % 15 == 0;
    }

    @Override
    public String apply() {
        return "FizzBuzz";
    }
}
