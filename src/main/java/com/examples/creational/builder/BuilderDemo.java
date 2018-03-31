package com.examples.creational.builder;

// https://sourcemaking.com/design_patterns/builder/java/2

public class BuilderDemo {

    public static void main(String[] args) {
        Waiter waiter = new Waiter();
        PizzaBuilder hawaiianPizzabuilder = new HawaiianPizzaBuilder();
        PizzaBuilder spicyPizzaBuilder = new SpicyPizzaBuilder();

        waiter.setPizzaBuilder(hawaiianPizzabuilder);
        waiter.constructPizza();
        Pizza hawaiianPizza = waiter.getPizza();
        System.out.println("Hawaiian Pizza: " + hawaiianPizza.getIngredients());

        waiter.setPizzaBuilder(spicyPizzaBuilder);
        waiter.constructPizza();
        Pizza spicyPizza = waiter.getPizza();
        System.out.println("Spicy Pizza: " + spicyPizza.getIngredients());
    }
}
