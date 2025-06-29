package org.rustem.structuralPatterns.bridge;

public class CarRunner {
    public static void main(String[] args) {
        Create car = new BMW(new BlackColor());

        car.create();
    }
}
