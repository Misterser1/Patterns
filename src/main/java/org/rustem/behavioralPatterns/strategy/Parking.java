package org.rustem.behavioralPatterns.strategy;

public class Parking implements Car{
    @Override
    public void carIsNow() {
        System.out.println("Car is parking...");
    }
}
