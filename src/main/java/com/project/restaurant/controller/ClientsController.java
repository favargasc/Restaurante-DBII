package com.project.restaurant.controller;

import com.project.restaurant.models.Client;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

@RestController
public class ClientsController {
    @RequestMapping(value = "/clients", method = RequestMethod.GET)
    public ModelAndView getClients() {
        Client client1 = new Client(1, "fabian", "85859875", "Costado sur, casa roja");
        Client client2 = new Client(2, "jimmy", "87290990", "Costado norte del hospital");
        Client client3 = new Client(3, "royner", "27301874","200mts de los tribunales");
        return new ModelAndView("clientes", "clients", new Client[]{client1, client2, client3});
    }

    @ModelAttribute
    public void setClient(Model model) {
        model.addAttribute("client", new Client());
    }

    @RequestMapping(value = "/add_client", method = RequestMethod.POST)
    public RedirectView addClient(@ModelAttribute("client") Client client) {
        System.out.println(client.getName());
        System.out.println(client.getAddress());
        System.out.println(client.getPhone());
        return new RedirectView("/clients");
    }

    @RequestMapping(value = "/remove_client", method = RequestMethod.POST)
    public RedirectView removeClient(@ModelAttribute("client") Client client) {
        System.out.println(client.getId());
        return new RedirectView("/clients");
    }
}