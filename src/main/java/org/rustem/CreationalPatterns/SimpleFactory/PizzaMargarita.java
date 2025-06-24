package org.rustem.CreationalPatterns.SimpleFactory;


public class PizzaMargarita extends PizzaSimple {
    @Override
    public void cookPizza() {
        System.out.println("cook Margarita");
    }
}
