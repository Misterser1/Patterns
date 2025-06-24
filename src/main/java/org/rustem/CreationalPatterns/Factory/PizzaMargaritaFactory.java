package org.rustem.CreationalPatterns.Factory;

public class PizzaMargaritaFactory extends PizzaFactory {
    @Override
    public Pizza createPizza() {
        return new PizzaMargarita();
    }
}
