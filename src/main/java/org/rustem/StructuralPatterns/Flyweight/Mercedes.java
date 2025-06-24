package org.rustem.StructuralPatterns.Flyweight;

public class Mercedes implements Car{
    @Override
    public void createCar() {
        System.out.println("Creating Mercedes...");
    }
}
