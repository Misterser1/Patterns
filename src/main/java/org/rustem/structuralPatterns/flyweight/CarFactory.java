package org.rustem.structuralPatterns.flyweight;

import java.util.HashMap;
import java.util.Map;

public class CarFactory {
    private Map<String, Car> carMap = new HashMap<>();

    public Car getCarByName(String name){
        Car car = carMap.get(name);

        if(car == null){
            switch (name) {
                case "BMW":
                    System.out.println("Buy BMW");
                    car = new BMW();
                    break;
                case "Mercedes":
                    System.out.println("Buy Mercedes");
                    car = new Mercedes();
                    break;
            }
            carMap.put(name, car);
        }
        return car;
    }
}
