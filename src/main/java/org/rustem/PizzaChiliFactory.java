package org.rustem;

public class PizzaChiliFactory extends PizzaFactory{
    @Override
    public Pizza createPizza() {
        return new PizzaChili();
    }
}
