package com.project.restaurant.presenters;

import com.project.restaurant.controllers.ClientsController;
import com.project.restaurant.controllers.MenuController;
import com.project.restaurant.controllers.MethodController;
import com.project.restaurant.controllers.OrderController;
import com.project.restaurant.models.InOrder;
import com.project.restaurant.models.OrderDAO;
import com.project.restaurant.models.OutOrder;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

@RestController
public class OrdersPresenter {
    @RequestMapping(value = "/orders", method = RequestMethod.GET)
    public ModelAndView getOrders() {

        return new ModelAndView(
                "ordenes",
                "orders",
                new OrderDAO(
                        new OrderController().getOrders(),
                        new MenuController().getAll(),
                        new MethodController().getMethods(),
                        new ClientsController().getClients()
                ));
    }

    @ModelAttribute
    public void setOrder(Model model) {
        model.addAttribute("OutOrder", new OutOrder());
        model.addAttribute("inOrder", new InOrder());
    }

    @RequestMapping(value = "/add_order", method = RequestMethod.POST)
    public RedirectView addClient(@ModelAttribute("inOrder") InOrder order) {
        OrderController orderController = new OrderController();
        orderController.addOrder(order);
        return new RedirectView("/orders");
    }

    @RequestMapping(value = "/remove_order", method = RequestMethod.POST)
    public RedirectView removeClient(@ModelAttribute("OutOrder") OutOrder order) {
        OrderController orderController = new OrderController();
        orderController.removeOrder(order);
        return new RedirectView("/orders");
    }
}

