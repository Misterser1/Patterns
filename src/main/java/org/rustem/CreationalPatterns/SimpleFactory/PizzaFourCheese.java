package org.rustem.CreationalPatterns.SimpleFactory;

public class PizzaFourCheese extends PizzaSimple {
    @Override
    public void cookPizza() {
        System.out.println("cook Four Cheese");
    }
}
