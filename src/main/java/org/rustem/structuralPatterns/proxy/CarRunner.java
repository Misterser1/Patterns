package org.rustem.structuralPatterns.proxy;

public class CarRunner {
    public static void main(String[] args) {
        Car car = new ProxyBMW("E63", "XM");

        car.create();
    }
}
