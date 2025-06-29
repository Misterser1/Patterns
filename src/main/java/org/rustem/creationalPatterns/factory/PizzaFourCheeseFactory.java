package org.rustem.creationalPatterns.factory;

public class PizzaFourCheeseFactory extends PizzaFactory {
    @Override
    public Pizza createPizza() {
        return new PizzaFourCheese();
    }
}
