package org.rustem.Factory;

public class PizzaMargaritaFactory extends PizzaFactory {
    @Override
    public Pizza createPizza() {
        return new PizzaMargarita();
    }
}
