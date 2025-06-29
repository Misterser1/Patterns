package org.rustem.behavioralPatterns.strategy;

public class StopEngine implements Car{
    @Override
    public void carIsNow() {
        System.out.println("Car is stopped...");
    }
}
