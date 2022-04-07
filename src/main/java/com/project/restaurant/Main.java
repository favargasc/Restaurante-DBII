package com.project.restaurant;

import com.project.restaurant.controllers.ProvidersController;
import com.project.restaurant.models.Provider;

import java.util.ArrayList;

public class Main {
    public static void main (String [ ] args) {
        ProvidersController pc = new ProvidersController();
        ArrayList<Provider> providers =  pc.getProviders();

        for (Provider provider : providers) {
           System.out.println(provider.getName());
        }
    }
}
