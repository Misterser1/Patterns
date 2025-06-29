package org.rustem.structuralPatterns.flyweight;

public class Mercedes implements Car{
    @Override
    public void createCar() {
        System.out.println("Creating Mercedes...");
    }
}
