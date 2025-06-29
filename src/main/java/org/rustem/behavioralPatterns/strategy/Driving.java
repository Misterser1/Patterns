package org.rustem.behavioralPatterns.strategy;

public class Driving implements Car{
    @Override
    public void carIsNow() {
        System.out.println("Car is driving...");
    }
}
