package com.project.restaurant.models;


import java.util.ArrayList;

public class Menu {
    ArrayList<Recipe> mains;
    Recipe[] specials;
    ArrayList<Recipe> desserts;
    ArrayList<Recipe> drinks;
    ArrayList<Recipe> snacks;

    public Menu(ArrayList<Recipe> mains, Recipe[] specials, ArrayList<Recipe> desserts, ArrayList<Recipe> drinks, ArrayList<Recipe> snacks) {
        this.mains = mains;
        this.specials = specials;
        this.desserts = desserts;
        this.drinks = drinks;
        this.snacks = snacks;
    }

    public ArrayList<Recipe> getMains() {
        return mains;
    }

    public void setMains(ArrayList<Recipe> mains) {
        this.mains = mains;
    }

    public Recipe[] getSpecials() {
        return specials;
    }

    public void setSpecials(Recipe[] specials) {
        this.specials = specials;
    }

    public ArrayList<Recipe> getDesserts() {
        return desserts;
    }

    public void setDesserts(ArrayList<Recipe> desserts) {
        this.desserts = desserts;
    }

    public ArrayList<Recipe> getDrinks() {
        return drinks;
    }

    public void setDrinks(ArrayList<Recipe> drinks) {
        this.drinks = drinks;
    }

    public ArrayList<Recipe> getSnacks() {
        return snacks;
    }

    public void setSnacks(ArrayList<Recipe>  snacks) {
        this.snacks = snacks;
    }
}
