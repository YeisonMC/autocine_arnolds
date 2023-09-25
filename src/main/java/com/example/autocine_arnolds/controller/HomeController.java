package com.example.autocine_arnolds.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.autocine_arnolds.model.Cartelera;
import com.example.autocine_arnolds.service.cartelera.CarteleraService;


@Controller
public class HomeController {

   @Autowired
   private CarteleraService carteleraService;

   @GetMapping({"/","/home"})
   public String home(Model model){

   List<Cartelera>listarCatelera=carteleraService.listarCatelera();

   model.addAttribute("listarCatelera", listarCatelera);
   model.addAttribute("cartelera", "EN CARTELERA");
   model.addAttribute("venta", "VENTA ANTICIPADA");
   return "home";
   }
}
