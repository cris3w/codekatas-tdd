package com.examples.creational.builder.PizzaBuilderExample;

// Product
public class Pizza {

    private String dough;
    private String sauce;
    private String topping;

    public Pizza() {
        dough = "";
        sauce = "";
        topping = "";
    }

    public void setDough(String dough) {
        this.dough = dough;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public void setTopping(String topping) {
        this.topping = topping;
    }

    public String getIngredients() {
        return "dough: " + dough + ", sauce: " + sauce + ", topping: " + topping;
    }
}
