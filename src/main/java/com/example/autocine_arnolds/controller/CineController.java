package com.example.autocine_arnolds.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.autocine_arnolds.model.Cartelera;
import com.example.autocine_arnolds.model.Cine;
import com.example.autocine_arnolds.service.cartelera.CarteleraService;
import com.example.autocine_arnolds.service.cine.CineService;

@Controller
@RequestMapping("/pages/cines")
public class CineController {
    @Autowired
    CarteleraService carteleraService;

    @Autowired
    CineService cineService;



    @GetMapping("/cine")
    public String peliculas(Model model){

      List<Cartelera> listarCatelera = carteleraService.listarCatelera();
      List<Cine> listarCine = cineService.listarCine();

      model.addAttribute("listarCatelera", listarCatelera);
      model.addAttribute("listarCine", listarCine);

      return "/pages/cines/cine";
    }
}
