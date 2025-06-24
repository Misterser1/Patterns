package org.rustem.StructuralPatterns.Facade;

public class CarSale {
    private final Engineer engineer = new Engineer();
    private final CarDealership carDealership = new CarDealership();

    public void saleCar(String name){
        Car car = new Car(name);
        engineer.createCar(car);
        carDealership.buyCar(engineer);
    }
}
