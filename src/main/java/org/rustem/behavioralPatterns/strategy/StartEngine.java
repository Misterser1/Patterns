package org.rustem.behavioralPatterns.strategy;

public class StartEngine implements Car{
    @Override
    public void carIsNow() {
        System.out.println("Car is starting...");
    }
}
