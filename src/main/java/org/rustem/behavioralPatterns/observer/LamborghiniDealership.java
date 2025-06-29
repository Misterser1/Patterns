package org.rustem.behavioralPatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class LamborghiniDealership implements Observed {
    private List<String> cars = new ArrayList<>();
    private List<Observer> fans = new ArrayList<>();

    public void addCar(String car){
        this.cars.add(car);
        notifyObserver();
    }

    public void removeCar(String car){
        this.cars.remove(car);
        notifyObserver();
    }

    @Override
    public void addObserver(Observer observer) {
        this.fans.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.fans.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer fan : fans){
            fan.handleEvent(cars);
        }
    }
}
