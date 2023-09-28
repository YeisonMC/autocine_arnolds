package com.example.autocine_arnolds.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.autocine_arnolds.model.Cartelera;
import com.example.autocine_arnolds.service.cartelera.CarteleraService;

@Controller
@RequestMapping("/cartelera")
public class CarteleraController {
    
    @Autowired
    CarteleraService carteleraService;

    @GetMapping("/")
    public String listarCatelera(Model model){
        List<Cartelera> cartelera = carteleraService.listarCatelera();
        model.addAttribute("cartelera", cartelera);
        return "cartelera";
    }

    // @GetMapping()
    // public ArrayList<Cartelera>listarCatelera(){
    //     return (ArrayList<Cartelera>) carteleraService.listarCatelera();
    // }


}
