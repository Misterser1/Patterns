package org.rustem.Composite;

import java.util.ArrayList;
import java.util.List;

public class CarDealership {
    private List<Car> carList = new ArrayList<Car>();

    public void addCar(Car car) {
        carList.add(car);
    }

    public void removeCar(Car car) {
        carList.remove(car);
    }

    public void deliveryCar(){
        System.out.println("Cars delivery to car dealership\n");
        for(Car car : carList){
            car.carDelivery();
        }
    }
}
