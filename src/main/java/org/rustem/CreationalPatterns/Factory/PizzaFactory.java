package org.rustem.CreationalPatterns.Factory;

public abstract class PizzaFactory {

    /* Simple Factory Method */
//    public Pizza createPizza(PizzaType type){
//        Pizza pizza = null;
//
//        switch (type) {
//            case PEPERONI -> pizza = new PizzaPeperoni();
//            case MARGARITA -> pizza = new PizzaMargarita();
//            case CHILI -> pizza = new PizzaChili();
//            case FOUR_CHEESE -> pizza = new PizzaFourCheese();
//        }
//
//        return pizza;
//    }
    /* Factory Method */
    public abstract Pizza createPizza();
}
