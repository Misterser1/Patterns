package org.rustem.CreationalPatterns.SimpleFactory;

public class PizzaPeperoni extends PizzaSimple {
    @Override
    public void cookPizza() {
        System.out.println("cook Peperoni");
    }
}
