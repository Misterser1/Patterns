package org.rustem.structuralPatterns.flyweight;

public class BMW implements Car{
    @Override
    public void createCar() {
        System.out.println("Creating BMW...");
    }
}
