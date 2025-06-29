package org.rustem.behavioralPatterns.state;

public class Parking implements Car{
    @Override
    public void carIsNow() {
        System.out.println("Car is parking...");
    }

    @Override
    public Car nextState() {
        return new StopEngine();
    }
}
