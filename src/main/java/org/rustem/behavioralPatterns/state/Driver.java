package org.rustem.behavioralPatterns.state;

public class Driver {
    private Car car;

    public void setCar(Car car){
        this.car = car;
    }

    public void changeCar(){
        this.car = car.nextState();
    }

    public void carIsNow(){
        car.carIsNow();
    }
}
