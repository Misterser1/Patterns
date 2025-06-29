package org.rustem.BehavioralPatterns.Observer;

public class LamborghiniRunner {
    public static void main(String[] args) {
        LamborghiniDealership lamborghiniDealership = new LamborghiniDealership();

        lamborghiniDealership.addCar("Lamborghini Huracan");
        lamborghiniDealership.addCar("Lamborghini Aventador");

        LamborghiniFan first = new LamborghiniFan("Adam");
        LamborghiniFan second = new LamborghiniFan("Alex");

        lamborghiniDealership.addObserver(first);
        lamborghiniDealership.addObserver(second);

        lamborghiniDealership.addCar("Lamborghini Diablo");

        lamborghiniDealership.removeCar("Lamborghini Huracan");
    }
}
