package com.project.restaurant.presenters;

import com.project.restaurant.controllers.InventaryController;
import com.project.restaurant.controllers.MeasurementUnitsController;
import com.project.restaurant.controllers.ProvidersController;
import com.project.restaurant.models.*;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;
import java.util.ArrayList;

@RestController
public class InventoryPresenter {
    @RequestMapping(value = "/inventories", method = RequestMethod.GET)
    public ModelAndView getInventory() {
        ArrayList<OutInventory> inventories = new InventaryController().getInventory();
        ArrayList<Provider> providers = new ProvidersController().getProviders();
        ArrayList<MeasurementUnits> measurementUnits = new MeasurementUnitsController().getMeasureUnits();

        return new ModelAndView(
                "inventario",
                "inventoryDAO",
                new InventoryDAO(inventories, providers, measurementUnits));
    }

    @ModelAttribute
    public void setOutInventory(Model model) {
        model.addAttribute("outInventory", new OutInventory());
    }

    @ModelAttribute
    public void setInInventory(Model model) {
        model.addAttribute("inInventory", new InInventory());
    }

    @RequestMapping(value = "/add_inventory", method = RequestMethod.POST)
    public RedirectView addInventory(@ModelAttribute("inInventory") InInventory inventory) {
        InventaryController inventaryController = new InventaryController();
        inventaryController.addInventory(inventory);
        return new RedirectView("/inventories");
    }

    @RequestMapping(value = "/remove_inventory", method = RequestMethod.POST)
    public RedirectView removeInventory(@ModelAttribute("outInventory") OutInventory inventory) {
        InventaryController inventaryController = new InventaryController();
        inventaryController.removeClient(inventory);
        return new RedirectView("/inventories");
    }
}
