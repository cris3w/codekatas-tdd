package com.examples.behavioral.observer;

public class Gates implements AlarmListener {

    public void alarm() {
        System.out.println("gates close");
    }
}
