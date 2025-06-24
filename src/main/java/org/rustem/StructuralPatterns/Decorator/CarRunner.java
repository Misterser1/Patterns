package org.rustem.StructuralPatterns.Decorator;

public class CarRunner {
    public static void main(String[] args) {
        Car car = new RedBMW(new BMW());

        System.out.println(car.createCar());
    }
}
