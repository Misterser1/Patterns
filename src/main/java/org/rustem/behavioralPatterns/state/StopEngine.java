package org.rustem.behavioralPatterns.state;

public class StopEngine implements Car{
    @Override
    public void carIsNow() {
        System.out.println("Car is stopped...");
    }

    @Override
    public Car nextState() {
        return new StartEngine();
    }
}
