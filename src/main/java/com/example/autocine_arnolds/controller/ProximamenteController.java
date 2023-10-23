package com.example.autocine_arnolds.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.autocine_arnolds.model.Proximamente;
import com.example.autocine_arnolds.service.proximamente.ProximamenteService;


@Controller
@RequestMapping("/pages/proximamente")
public class ProximamenteController {
    @Autowired
    ProximamenteService proximamenteService;
 
    @GetMapping("/")
    public String listarProximamente(Model model) {
        List<Proximamente> listarProximamente = proximamenteService.listarProximamente();
        model.addAttribute("listarProximamente", listarProximamente);
        return "/pages/proximamente/detalleProximamente"; // Esta vista mostrará la lista de películas próximamente
    }

    @GetMapping("/{id}")
    public String verDetallesProximamente(@PathVariable("id") Long id, Model model) {
        Proximamente proximamente = proximamenteService.buscarProximamente(id);
        model.addAttribute("proximamente", proximamente);
        model.addAttribute("nombrePelicula", proximamente.getTitulo());
        return "/pages/proximamente/detalleProximamente"; // Esta vista mostrará los detalles de la película próximamente
    }
}
