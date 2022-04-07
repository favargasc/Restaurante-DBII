package com.project.restaurant.presenters;

import com.project.restaurant.controllers.ClientsController;
import com.project.restaurant.models.Client;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import java.util.ArrayList;

@RestController
public class ClientsPresenter {
    public ClientsController clientsController;

    public ClientsPresenter() {
        this.clientsController = new ClientsController();
    }

    @RequestMapping(value = "/clients", method = RequestMethod.GET)
    public ModelAndView getClients() {
        ArrayList<Client> clients =  clientsController.getClients();

        return new ModelAndView("clientes", "clients", clients);
    }

    @ModelAttribute
    public void setClient(Model model) {
        model.addAttribute("client", new Client());
    }

    @RequestMapping(value = "/add_client", method = RequestMethod.POST)
    public RedirectView addClient(@ModelAttribute("client") Client client) {
        clientsController.addClient(client);
        return new RedirectView("/clients");
    }

    @RequestMapping(value = "/remove_client", method = RequestMethod.POST)
    public RedirectView removeClient(@ModelAttribute("client") Client client) {
        clientsController.removeClient(client);
        System.out.println(client.getId());
        return new RedirectView("/clients");
    }
}