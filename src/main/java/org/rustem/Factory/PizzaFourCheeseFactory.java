package org.rustem.Factory;

public class PizzaFourCheeseFactory extends PizzaFactory {
    @Override
    public Pizza createPizza() {
        return new PizzaFourCheese();
    }
}
