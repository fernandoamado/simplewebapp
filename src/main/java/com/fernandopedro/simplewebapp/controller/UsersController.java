package com.fernandopedro.simplewebapp.controller;

import com.fernandopedro.simplewebapp.model.User;
import com.fernandopedro.simplewebapp.repository.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/users")
public class UsersController {

    @Autowired
    private Users users;

    @GetMapping
    public ModelAndView list() {
        ModelAndView modelAndView = new ModelAndView("AllUsers");
        modelAndView.addObject("users", users.findAll());
        modelAndView.addObject("user", new User());
        return modelAndView;
    }

    @PostMapping
    public String saveUser(User user){
        this.users.save(user);
        return "redirect:/users";
    }

}
