package org.rustem.creationalPatterns.factory;

public class PizzaPeperoniFactory extends PizzaFactory {
    @Override
    public Pizza createPizza() {
        return new PizzaPeperoni();
    }
}
