package org.rustem.creationalPatterns.factory;

public class PizzaMargaritaFactory extends PizzaFactory {
    @Override
    public Pizza createPizza() {
        return new PizzaMargarita();
    }
}
