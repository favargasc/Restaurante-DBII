package com.project.restaurant.presenters;

import com.project.restaurant.controllers.ProvidersController;
import com.project.restaurant.models.Provider;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import java.util.ArrayList;

@RestController
public class ProvidersPresenter {
    ProvidersController providersController;

    public ProvidersPresenter() {
        this.providersController = new ProvidersController();
    }

    @RequestMapping(value = "/providers", method = RequestMethod.GET)
    public ModelAndView showProviders() {

        ArrayList<Provider> providers =  providersController.getProviders();

        return new ModelAndView("proveedores", "providers", providers);
    }

    @ModelAttribute
    public void addAttributes(Model model) {
        model.addAttribute("provider", new Provider());
    }

    @RequestMapping(value = "/addProvider", method = RequestMethod.POST)
    public RedirectView addProvider(@ModelAttribute("provider") Provider provider) {
        providersController.addProvider(provider);
        return new RedirectView("/providers");
    }

    @RequestMapping(value = "/removeProvider", method = RequestMethod.POST)
    public RedirectView removeProvider(@ModelAttribute("provider") Provider provider) {
        providersController.removeProvider(provider);
        return new RedirectView("/providers");
    }
}
