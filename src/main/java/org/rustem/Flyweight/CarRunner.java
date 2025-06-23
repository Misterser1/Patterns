package org.rustem.Flyweight;

import java.util.ArrayList;
import java.util.List;

public class CarRunner {
    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();

        List<Car> cars = new ArrayList<>();

        cars.add(carFactory.getCarByName("BMW"));
        cars.add(carFactory.getCarByName("BMW"));
        cars.add(carFactory.getCarByName("BMW"));
        cars.add(carFactory.getCarByName("Mercedes"));
        cars.add(carFactory.getCarByName("Mercedes"));
        cars.add(carFactory.getCarByName("Mercedes"));

        for (Car car : cars) {
            car.createCar();
        }
    }
}
