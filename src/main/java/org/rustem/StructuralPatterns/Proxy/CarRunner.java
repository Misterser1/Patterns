package org.rustem.StructuralPatterns.Proxy;

public class CarRunner {
    public static void main(String[] args) {
        Car car = new ProxyBMW("E63", "XM");

        car.create();
    }
}
