package com.example.autocine_arnolds.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController {
   @GetMapping({"/","/home"})
   public String home(Model model){
   model.addAttribute("cartelera", "EN CARTELERA");
   model.addAttribute("venta", "VENTA ANTICIPADA");
   return "home";
   }
}
