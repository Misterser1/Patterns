package org.rustem.creationalPatterns.factory;

public class PizzaChiliFactory extends PizzaFactory {
    @Override
    public Pizza createPizza() {
        return new PizzaChili();
    }
}
