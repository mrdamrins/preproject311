package com.example.controller;

import com.example.service.UserService;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

  private final UserService userService;

  public UserController(UserService userService) {
    this.userService = userService;
  }

  @GetMapping
  public String user(Authentication authentication, Model model) {
    if (authentication.isAuthenticated()) {
      model.addAttribute("user", authentication.getPrincipal());
    }
    return "index";
  }
}
