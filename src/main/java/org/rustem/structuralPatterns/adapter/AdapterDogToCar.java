package org.rustem.structuralPatterns.adapter;

public class AdapterDogToCar implements Dog  {
    private final Car car;

    public AdapterDogToCar(Car car) {
        this.car = car;
    }

    @Override
    public void bark() {
        car.honk();
    }

    @Override
    public void eat() {

    }
}
