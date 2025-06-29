package org.rustem.structuralPatterns.bridge;

public class BlueColor implements Color{
    @Override
    public void fillColor() {
        System.out.println("filling blue color");
    }
}
