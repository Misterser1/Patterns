package org.rustem.CreationalPatterns.Factory;

public class PizzaChiliFactory extends PizzaFactory {
    @Override
    public Pizza createPizza() {
        return new PizzaChili();
    }
}
