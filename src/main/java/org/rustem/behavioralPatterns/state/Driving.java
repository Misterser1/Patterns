package org.rustem.behavioralPatterns.state;

public class Driving implements Car{
    @Override
    public void carIsNow() {
        System.out.println("Car is driving...");
    }

    @Override
    public Car nextState() {
        return new Parking();
    }
}
