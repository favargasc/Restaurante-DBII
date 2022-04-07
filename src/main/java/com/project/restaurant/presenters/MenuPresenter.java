package com.project.restaurant.presenters;

import com.project.restaurant.controllers.MenuController;
import com.project.restaurant.models.Menu;
import com.project.restaurant.models.Recipe;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;


@RestController
public class MenuPresenter {
    MenuController menuController;

    public MenuPresenter() {
        this.menuController = new MenuController();
    }

    @RequestMapping(value = "/menu", method = RequestMethod.GET)
    public ModelAndView getMenu() {
        Recipe meal = new Recipe("Ensalada Griega", 3000.0, "Lorem ipsum dolor sit amet, consectetur adipisicing elit. Quia, nam.");
        Recipe meal2 = new Recipe(fill("Papas Fritas "), 3000.0, "");

        ArrayList<Recipe> mains = menuController.getMains();
        ArrayList<Recipe> drinks = menuController.getDrinks();
        ArrayList<Recipe> desserts = menuController.getDesserts();
        ArrayList<Recipe> snacks = menuController.getStacks();

        Recipe[] specials = new Recipe[]{meal, meal, meal, meal};
        Recipe[] sides = new Recipe[]{meal2, meal2, meal2, meal2, meal2, meal2, meal2, meal2};

        return new ModelAndView("menu", "menu", new Menu(mains, specials, desserts, drinks, snacks));
    }

    public String fill(String word) {
        StringBuilder wordBuilder = new StringBuilder(word);
        wordBuilder.append(".".repeat(Math.max(0, (50 - wordBuilder.length()))));
        return wordBuilder.toString();
    }
}
