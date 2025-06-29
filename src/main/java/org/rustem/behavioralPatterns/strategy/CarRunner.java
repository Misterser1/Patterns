package org.rustem.behavioralPatterns.strategy;

public class CarRunner {
    public static void main(String[] args) {
        Driver driver = new Driver();

        driver.setCar(new StartEngine());
        driver.executeCar();

        driver.setCar(new Driving());
        driver.executeCar();
    }
}
