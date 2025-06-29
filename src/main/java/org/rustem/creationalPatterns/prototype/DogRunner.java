package org.rustem.creationalPatterns.prototype;

public class DogRunner {
    public static void main(String[] args) {
        Dog dog = new LabradorDog("Lord", "Black");

        System.out.println(dog);

        LabradorDog cloneDog = (LabradorDog) dog.cloneDog();

        System.out.println(cloneDog);
    }
}
