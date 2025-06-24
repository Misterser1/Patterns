package org.rustem.StructuralPatterns.Facade;

public class CarRunner {
    public static void main(String[] args) {
        CarSale carSale = new CarSale();

        carSale.saleCar("Lexus");
    }
}
