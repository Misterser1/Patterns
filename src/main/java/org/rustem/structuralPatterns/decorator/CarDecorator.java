package org.rustem.structuralPatterns.decorator;

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
