package com.project.restaurant.presenters;

import com.project.restaurant.controllers.LoginController;
import com.project.restaurant.models.Login;
import com.project.restaurant.models.Provider;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

@RestController
public class LoginPresenter {
    @RequestMapping("/")
    public ModelAndView getIndex() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("login");
        return modelAndView;
    }

    @ModelAttribute
    public void addAttributes(Model model) {
        model.addAttribute("login", new Login());
    }

    @RequestMapping(value = "/getLogin", method = RequestMethod.POST)
    public RedirectView addProvider(@ModelAttribute("login") Login login) {
        LoginController loginController = new LoginController();

        if (loginController.checkLogin(login) != 0) {
            return new RedirectView("/home");
        }
        return new RedirectView("/");
    }
}
