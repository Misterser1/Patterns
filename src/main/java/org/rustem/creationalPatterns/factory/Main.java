package org.rustem.creationalPatterns.factory;

public class Main {
    public static void main(String[] args) {
        /* Factory Method */
        PizzaFactory factory = new PizzaPeperoniFactory();

        Pizza pizza = factory.createPizza();

        pizza.cookPizza();
    }
}