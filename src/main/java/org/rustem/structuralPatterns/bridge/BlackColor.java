package org.rustem.structuralPatterns.bridge;

public class BlackColor implements Color{
    @Override
    public void fillColor() {
        System.out.println("filling black color");
    }
}
