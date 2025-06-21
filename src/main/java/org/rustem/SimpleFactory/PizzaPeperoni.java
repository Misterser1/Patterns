package org.rustem.SimpleFactory;

public class PizzaPeperoni extends PizzaSimple {
    @Override
    public void cookPizza() {
        System.out.println("cook Peperoni");
    }
}
