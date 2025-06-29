package org.rustem.behavioralPatterns.state;

public class CarRunner {
    public static void main(String[] args) {
        Driver driver = new Driver();
        Car car = new StartEngine();

        driver.setCar(car);

        for(int i = 0; i < 5; i++){
            driver.carIsNow();
            driver.changeCar();
        }
    }
}
