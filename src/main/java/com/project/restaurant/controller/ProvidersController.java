package com.project.restaurant.controller;

import com.project.restaurant.models.Provider;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

@RestController
public class ProvidersController {
    @RequestMapping(value = "/providers", method = RequestMethod.GET)
    public ModelAndView showProviders() {

        Provider provider1 = new Provider(1, "Del valle");
        Provider provider2 = new Provider(2, "Dos Pinos");
        Provider provider3 = new Provider(3, "Mu");

        return new ModelAndView("proveedores", "providers", new Provider[] { provider1, provider2, provider3 });
    }

    @ModelAttribute
    public void addAttributes(Model model) {
        model.addAttribute("provider", new Provider());
    }

    @RequestMapping(value = "/addProvider", method = RequestMethod.POST)
    public RedirectView addProvider(@ModelAttribute("provider") Provider provider) {
        System.out.println(provider.getName());
        return new RedirectView("/providers");
    }

    @RequestMapping(value = "/removeProvider", method = RequestMethod.POST)
    public RedirectView removeProvider(@ModelAttribute("provider") Provider provider) {
        System.out.println(provider.getId());
        return new RedirectView("/providers");
    }
}
