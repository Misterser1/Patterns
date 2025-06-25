package org.rustem.BehavioralPatterns.Command;

public class CarRunner {
    public static void main(String[] args) {
        Car car = new Car();

        CarKey carKey = new CarKey(new CarStartCommand(car), new CarStopCommand(car));

        carKey.carStop();
    }
}
