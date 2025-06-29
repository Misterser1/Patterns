package org.rustem.creationalPatterns.simpleFactory;

public class PizzaFactory {

    /* Simple Factory Method */
    public PizzaSimple createPizza(PizzaType type){
        PizzaSimple pizza = null;

        switch (type) {
            case PEPERONI -> pizza = new PizzaPeperoni();
            case MARGARITA -> pizza = new PizzaMargarita();
            case CHILI -> pizza = new PizzaChili();
            case FOUR_CHEESE -> pizza = new PizzaFourCheese();
        }

        return pizza;
    }
}
