package org.rustem;

public class PizzaPeperoniFactory extends PizzaFactory {
    @Override
    public Pizza createPizza() {
        return new PizzaPeperoni();
    }
}
