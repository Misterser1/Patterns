package org.rustem.Composite;

public class CarDealershipRunner {
    public static void main(String[] args) {
        CarDealership carDealership = new CarDealership();

        Car BMW = new BMW();
        Car Mercedes = new Mercedes();

        carDealership.addCar(BMW);
        carDealership.addCar(Mercedes);

        carDealership.deliveryCar();
    }

}
