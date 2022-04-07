package com.project.restaurant.models;

import java.util.ArrayList;

public class OrderDAO {
    ArrayList<OutOrder> orders;
    ArrayList<Recipe> meals;
    ArrayList<Pay> methods;
    ArrayList<Client> clients;

    public OrderDAO(ArrayList<OutOrder> orders, ArrayList<Recipe> meals, ArrayList<Pay> methods, ArrayList<Client> clients) {
        this.orders = orders;
        this.meals = meals;
        this.methods = methods;
        this.clients = clients;
    }

    public ArrayList<OutOrder> getOrders() {
        return orders;
    }

    public void setOrders(ArrayList<OutOrder> orders) {
        this.orders = orders;
    }

    public ArrayList<Recipe> getMeals() {
        return meals;
    }

    public void setMeals(ArrayList<Recipe> meals) {
        this.meals = meals;
    }

    public ArrayList<Pay> getMethods() {
        return methods;
    }

    public void setMethods(ArrayList<Pay> methods) {
        this.methods = methods;
    }

    public ArrayList<Client> getClients() {
        return clients;
    }

    public void setClients(ArrayList<Client> clients) {
        this.clients = clients;
    }
}
