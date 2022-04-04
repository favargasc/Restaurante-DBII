package com.project.restaurant.controller;

import com.project.restaurant.models.Menu;
import com.project.restaurant.models.Recipe;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


@RestController
public class MenuController {
    @RequestMapping(value = "/menu", method = RequestMethod.GET)
    public ModelAndView getMenu() {
        Recipe meal = new Recipe("Ensalada Griega", 3000.0, "Lorem ipsum dolor sit amet, consectetur adipisicing elit. Quia, nam.");
        Recipe meal2 = new Recipe(fill("Papas Fritas "), 3000.0, "");
        Recipe[] mains = new Recipe[]{meal, meal, meal, meal};
        Recipe[] specials = new Recipe[]{meal, meal, meal, meal};
        Recipe[] desserts = new Recipe[]{meal2, meal2, meal2, meal2, meal2, meal2, meal2, meal2};
        Recipe[] drinks = new Recipe[]{meal2, meal2, meal2, meal2, meal2, meal2, meal2, meal2};
        Recipe[] sides = new Recipe[]{meal2, meal2, meal2, meal2, meal2, meal2, meal2, meal2};

        return new ModelAndView("menu", "menu", new Menu(mains, specials, desserts, drinks, sides));
    }

    public String fill(String word) {
        StringBuilder wordBuilder = new StringBuilder(word);
        wordBuilder.append(".".repeat(Math.max(0, (50 - wordBuilder.length()))));
        return wordBuilder.toString();
    }
}
