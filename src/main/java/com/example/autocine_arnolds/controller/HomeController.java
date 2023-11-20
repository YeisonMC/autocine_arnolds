package com.example.autocine_arnolds.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.autocine_arnolds.model.Cartelera;
import com.example.autocine_arnolds.model.Proximamente;
import com.example.autocine_arnolds.service.cartelera.CarteleraService;
import com.example.autocine_arnolds.service.proximamente.ProximamenteService;


@Controller
public class HomeController {

   @Autowired
   private CarteleraService carteleraService;

   @Autowired
   private ProximamenteService proximamenteService;

   @GetMapping({"/","/home"})
   public String home(Model model){

   List<Cartelera>listarCatelera=carteleraService.listarCatelera();
   List<Proximamente> listarProximamente = proximamenteService.listarProximamente();

   model.addAttribute("listarCatelera", listarCatelera);
   model.addAttribute("listarProximamente", listarProximamente);
   model.addAttribute("cartelera", "EN CARTELERA");
   model.addAttribute("venta", "VENTA ANTICIPADA");
   return "home";
   }
}
