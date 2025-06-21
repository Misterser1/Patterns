package org.rustem.Adapter;

public class DogRunner {
    public static void main(String[] args) {
        Dog dog = new AdapterDogToCar(new Car());

        dog.bark();
    }
}
