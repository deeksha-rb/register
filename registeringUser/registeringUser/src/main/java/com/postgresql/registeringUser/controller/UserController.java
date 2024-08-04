package com.postgresql.registeringUser.controller;

import com.postgresql.registeringUser.model.User;
import com.postgresql.registeringUser.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/register")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public String showRegistrationForm(Model model) {
        model.addAttribute("user", new User());
        return "register";

    }

    @PostMapping
    public String registerUser(User user) {
        userService.registerUser(user);
        return "redirect:/register?success";
    }
}
