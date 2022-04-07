package com.project.restaurant.models;


<<<<<<< HEAD
import java.util.ArrayList;

public class Menu {
    ArrayList<Recipe> mains;
    Recipe[] specials;
    ArrayList<Recipe> desserts;
    ArrayList<Recipe> drinks;
    ArrayList<Recipe> snacks;

    public Menu(ArrayList<Recipe> mains, Recipe[] specials, ArrayList<Recipe> desserts, ArrayList<Recipe> drinks, ArrayList<Recipe> snacks) {
=======
public class Menu {
    Recipe[] mains;
    Recipe[] specials;
    Recipe[] desserts;
    Recipe[] drinks;
    Recipe[] sides;

    public Menu(Recipe[] mains, Recipe[] specials, Recipe[] desserts, Recipe[] drinks, Recipe[] sides) {
>>>>>>> origin/master
        this.mains = mains;
        this.specials = specials;
        this.desserts = desserts;
        this.drinks = drinks;
<<<<<<< HEAD
        this.snacks = snacks;
    }

    public ArrayList<Recipe> getMains() {
        return mains;
    }

    public void setMains(ArrayList<Recipe> mains) {
=======
        this.sides = sides;
    }

    public Recipe[] getMains() {
        return mains;
    }

    public void setMains(Recipe[] mains) {
>>>>>>> origin/master
        this.mains = mains;
    }

    public Recipe[] getSpecials() {
        return specials;
    }

    public void setSpecials(Recipe[] specials) {
        this.specials = specials;
    }

<<<<<<< HEAD
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
=======
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
>>>>>>> origin/master
    }
}
