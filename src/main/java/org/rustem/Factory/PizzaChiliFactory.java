package org.rustem.Factory;

public class PizzaChiliFactory extends PizzaFactory {
    @Override
    public Pizza createPizza() {
        return new PizzaChili();
    }
}
