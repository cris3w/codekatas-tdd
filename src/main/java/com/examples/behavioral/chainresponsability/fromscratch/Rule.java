package com.examples.behavioral.chainresponsability.fromscratch;

public interface Rule {

    boolean canApply(int number);

    String apply();
}
