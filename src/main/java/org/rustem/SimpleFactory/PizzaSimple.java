package org.rustem.SimpleFactory;

public class PizzaSimple {
    public void cookPizza() {
    }
    public void givePizza() {
    }

    public static void main(String[] args) {
        /* Simple Factory Method */
        PizzaFactory pizzaFactory = new PizzaFactory();

        PizzaSimple pizza = pizzaFactory.createPizza(PizzaType.MARGARITA);

        pizza.cookPizza();
    }

}
