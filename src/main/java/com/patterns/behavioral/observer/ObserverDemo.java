package com.patterns.behavioral.observer;

// https://sourcemaking.com/design_patterns/observer/java/2

public class ObserverDemo {

    public static void main( String[] args ) {
        SensorSystem sensorSystem = new SensorSystem();
        sensorSystem.register(new Gates());
        sensorSystem.register(new Lighting());
        sensorSystem.register(new Surveillance());
        sensorSystem.soundTheAlarm();
    }
}
