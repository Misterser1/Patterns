package org.rustem.StructuralPatterns.Bridge;

public class RedColor implements Color{

    @Override
    public void fillColor() {
        System.out.println("filling red color");
    }
}
