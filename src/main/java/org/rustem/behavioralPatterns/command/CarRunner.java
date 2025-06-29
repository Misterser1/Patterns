package org.rustem.behavioralPatterns.command;

public class CarRunner {
    public static void main(String[] args) {
        Car car = new Car();

        CarKey carKey = new CarKey(new CarStartCommand(car), new CarStopCommand(car));

        carKey.carStop();
    }
}
