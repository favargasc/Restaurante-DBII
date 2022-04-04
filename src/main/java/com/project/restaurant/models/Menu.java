package com.project.restaurant.models;


public class Menu {
    Recipe[] mains;
    Recipe[] specials;
    Recipe[] desserts;
    Recipe[] drinks;
    Recipe[] sides;

    public Menu(Recipe[] mains, Recipe[] specials, Recipe[] desserts, Recipe[] drinks, Recipe[] sides) {
        this.mains = mains;
        this.specials = specials;
        this.desserts = desserts;
        this.drinks = drinks;
        this.sides = sides;
    }

    public Recipe[] getMains() {
        return mains;
    }

    public void setMains(Recipe[] mains) {
        this.mains = mains;
    }

    public Recipe[] getSpecials() {
        return specials;
    }

    public void setSpecials(Recipe[] specials) {
        this.specials = specials;
    }

    public Recipe[] getDesserts() {
        return desserts;
    }

    public void setDesserts(Recipe[] desserts) {
        this.desserts = desserts;
    }

    public Recipe[] getDrinks() {
        return drinks;
    }

    public void setDrinks(Recipe[] drinks) {
        this.drinks = drinks;
    }

    public Recipe[] getSides() {
        return sides;
    }

    public void setSides(Recipe[] sides) {
        this.sides = sides;
    }
}
