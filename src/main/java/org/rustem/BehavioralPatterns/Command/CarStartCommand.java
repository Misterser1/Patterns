package org.rustem.BehavioralPatterns.Command;

public class CarStartCommand implements Command{
    private Car car;

    public CarStartCommand(Car car) {
        this.car = car;
    }

    @Override
    public void execute() {
        car.carStart();
    }
}
