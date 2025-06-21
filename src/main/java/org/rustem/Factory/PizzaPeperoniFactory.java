package org.rustem.Factory;

public class PizzaPeperoniFactory extends PizzaFactory {
    @Override
    public Pizza createPizza() {
        return new PizzaPeperoni();
    }
}
