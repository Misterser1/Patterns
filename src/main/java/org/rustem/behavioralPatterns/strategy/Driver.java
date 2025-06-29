package org.rustem.behavioralPatterns.strategy;

public class Driver {
    private Car car;

    public void setCar(Car car){
        this.car = car;
    }

    public void executeCar(){
        car.carIsNow();
    }
}
