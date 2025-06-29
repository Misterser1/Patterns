package org.rustem.structuralPatterns.facade;

public class CarRunner {
    public static void main(String[] args) {
        CarSale carSale = new CarSale();

        carSale.saleCar("Lexus");
    }
}
