package org.rustem;

public class PizzaFourCheeseFactory extends PizzaFactory {
    @Override
    public Pizza createPizza() {
        return new PizzaFourCheese();
    }
}
