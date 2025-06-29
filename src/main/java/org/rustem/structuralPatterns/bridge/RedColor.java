package org.rustem.structuralPatterns.bridge;

public class RedColor implements Color{

    @Override
    public void fillColor() {
        System.out.println("filling red color");
    }
}
