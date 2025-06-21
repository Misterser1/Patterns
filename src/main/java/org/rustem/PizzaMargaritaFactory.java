package org.rustem;

public class PizzaMargaritaFactory extends PizzaFactory{
    @Override
    public Pizza createPizza() {
        return new PizzaMargarita();
    }
}
