package org.rustem.creationalPatterns.simpleFactory;

public class PizzaChili extends PizzaSimple {
    @Override
    public void cookPizza() {
        System.out.println("Cook Chili");
    }
}
