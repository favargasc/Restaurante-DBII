package com.project.restaurant.presenters;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomePresenter {
    @GetMapping("/home")
    public String getHome() {
        return "home";
    }
}

