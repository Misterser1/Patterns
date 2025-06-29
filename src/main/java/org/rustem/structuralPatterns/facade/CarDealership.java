package org.rustem.structuralPatterns.facade;

public class CarDealership {
    public void buyCar(Engineer car){
        if (car.isCreated()){
            System.out.println("Car " + car.getCar().getName() + " buy");
            car.deleteCar();
        }else{
            System.out.println("Car is not available.");
        }
    }
}
