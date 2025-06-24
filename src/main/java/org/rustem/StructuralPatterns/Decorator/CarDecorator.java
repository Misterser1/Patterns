package org.rustem.StructuralPatterns.Decorator;

public class CarDecorator implements Car {
    Car car;

    public CarDecorator(Car car) {
        this.car = car;
    }

    @Override
    public String createCar() {
        return car.createCar();
    }
}
