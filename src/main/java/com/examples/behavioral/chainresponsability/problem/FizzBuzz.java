package com.examples.behavioral.chainresponsability.problem;

public class FizzBuzz {

    public String generate(int number) {
        if (isFizzBuzz(number)) {
            return "FizzBuzz";
        }
        if (isFizz(number)) {
            return "Fizz";
        }
        if (isBuzz(number)) {
            return "Buzz";
        }
        return String.valueOf(number);
    }

    private boolean isFizzBuzz(int number) {
        return number % 15 == 0;
    }

    private boolean isFizz(int number) {
        return number % 3 == 0;
    }

    private boolean isBuzz(int number) {
        return number % 5 == 0;
    }
}
