package org.rustem.structuralPatterns.bridge;

public class BMW extends Create{

    public BMW(Color color) {
        super(color);
    }

    @Override
    public void create() {
        System.out.println("BMW creating...");
        color.fillColor();
    }
}
