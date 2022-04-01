package com.project.restaurant.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RoutesController {
    @GetMapping("/")
    public String getIndex() {
        return "home";
    }

    @GetMapping("menu")
    public String getMenuPage() {
        return "menu";
    }

    @GetMapping("clientes")
    public String getClientPage() {
        return "clientes";
    }

    @GetMapping("inventario")
    public String getInventoryPage() {
        return "inventario";
    }

    @GetMapping("ordenes")
    public String getOrdersPage() {
        return "ordenes";
    }

    @GetMapping("proveedores")
    public String getProvidersPage() {
        return "proveedores";
    }
}

