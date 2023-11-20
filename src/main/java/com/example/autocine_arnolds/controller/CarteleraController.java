package com.example.autocine_arnolds.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.autocine_arnolds.model.Carrito;
import com.example.autocine_arnolds.model.Cartelera;

import com.example.autocine_arnolds.model.Proximamente;
import com.example.autocine_arnolds.service.carrito.CarritoService;
import com.example.autocine_arnolds.service.cartelera.CarteleraService;
import com.example.autocine_arnolds.service.cine.CineService;
import com.example.autocine_arnolds.service.proximamente.ProximamenteService;

@Controller
@RequestMapping("/pages")
public class CarteleraController {

    @Autowired
    CarteleraService carteleraService;

    @Autowired
    ProximamenteService proximamenteService;

    @Autowired
    CineService cineService;

    @Autowired
    CarritoService carritoService;

    @GetMapping("/")
    public String listarCatelera(Model model){
        
         List<Carrito> listarCarrito = carritoService.listaCarritos();
        List<Cartelera> listarCatelera = carteleraService.listarCatelera();
        model.addAttribute("listarCatelera", listarCatelera);
   model.addAttribute("listarCarrito", listarCarrito);
        return "/pages/detalleCartelera";
    } 

    @GetMapping("/get/{id}")
    public String buscarCarteleraId(@PathVariable("id") Long id, Model model) {
        Cartelera cartelera = carteleraService.buscarCarteleraId(id);
        Proximamente proximamente = proximamenteService.buscarProximamente(id);
        List<Carrito> listarCarrito = carritoService.listaCarritos();

        model.addAttribute("listarCarrito", listarCarrito);
        model.addAttribute("nombrePelicula", cartelera.getTitulo());
        model.addAttribute("cartelera", cartelera);
        model.addAttribute("proximamente", proximamente);
        return "pages/detalleCartelera"; 
    }
}
