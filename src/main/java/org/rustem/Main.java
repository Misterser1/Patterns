package org.rustem;

public class Main {
    public static void main(String[] args) {
        /* Factory Method */
        PizzaFactory factory = new PizzaPeperoniFactory();

        Pizza pizza = factory.createPizza();

        pizza.cookPizza();
    }
}