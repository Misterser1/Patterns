package org.rustem.behavioralPatterns.state;

public class StartEngine implements Car{
    @Override
    public void carIsNow() {
        System.out.println("Car is starting...");
    }

    @Override
    public Car nextState() {
        return new Driving();
    }
}
