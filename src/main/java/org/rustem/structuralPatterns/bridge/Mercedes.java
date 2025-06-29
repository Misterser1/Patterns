package org.rustem.structuralPatterns.bridge;

public class Mercedes extends Create{
    public Mercedes(Color color) {
        super(color);
    }

    @Override
    public void create() {
        System.out.println("Mercedes creating...");
        color.fillColor();
    }
}
