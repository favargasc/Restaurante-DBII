package com.project.restaurant.controller;

import com.project.restaurant.models.Order;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

@RestController
public class OrdersController {
    @RequestMapping(value = "/orders", method = RequestMethod.GET)
    public ModelAndView getOrders() {

        Order order1 = new Order(1, "fabian", "arroz con pollo", "Al contado", "12-01-2018", 2);
        Order order2 = new Order(2, "fabian", "arroz con pollo", "Al contado", "12-01-2018", 4);
        Order order3 = new Order(3, "fabian", "arroz con pollo", "Al contado", "12-01-2018", 5);
        return new ModelAndView("ordenes", "orders", new Order[]{order1, order2, order3});
    }


    @ModelAttribute
    public void setOrder(Model model) {
        model.addAttribute("order", new Order());
    }

    @RequestMapping(value = "/add_order", method = RequestMethod.POST)
    public RedirectView addClient(@ModelAttribute("order") Order order) {
        System.out.println(order.getName());
        System.out.println(order.getDate());
        System.out.println(order.getMeal());
        System.out.println(order.getPayMethod());
        System.out.println(order.getAmount());
        return new RedirectView("/orders");
    }

    @RequestMapping(value = "/remove_order", method = RequestMethod.POST)
    public RedirectView removeClient(@ModelAttribute("order") Order order) {
        System.out.println(order.getId());
        return new RedirectView("/orders");
    }
}

