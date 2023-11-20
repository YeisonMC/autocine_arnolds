package com.example.autocine_arnolds.controller;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.autocine_arnolds.model.Cartelera;
import com.example.autocine_arnolds.model.Proximamente;
import com.example.autocine_arnolds.service.cartelera.CarteleraService;
import com.example.autocine_arnolds.service.proximamente.ProximamenteService;

@Controller
@RequestMapping("/pages/subpaginas")

public class PeliculasController {

    @Autowired
    CarteleraService carteleraService;

    @Autowired
    ProximamenteService proximamenteService;

    
    @GetMapping("/peliculas")
    public String peliculas(Model model){
        
    List<Cartelera> listarCatelera = carteleraService.listarCatelera();
    List<Proximamente> listarProximamente = proximamenteService.listarProximamente();

    // List<Object> peliculas = new ArrayList<>();
    // peliculas.addAll(listarCatelera);
    // peliculas.addAll(listarProximamente);

    List<Cartelera> listarCateleraRandom = carteleraService.listarCatelera();   
    List<Proximamente> listarProximamenteRandom = proximamenteService.listarProximamente(); 
    Collections.shuffle(listarCateleraRandom); 
    Collections.shuffle(listarProximamenteRandom); 

    model.addAttribute("listarCateleraRandom", listarCateleraRandom);
    model.addAttribute("listarProximamenteRandom", listarProximamenteRandom);

    // Collections.shuffle(peliculas); 
    // model.addAttribute("peliculas", peliculas);

    model.addAttribute("listarCatelera", listarCatelera);
    model.addAttribute("listarProximamente", listarProximamente);

      return "/pages/subpaginas/peliculas";
    } 
  
    @GetMapping("/create")
    public String crearCartelera(Model model){
      
      Cartelera cartelera = new Cartelera();
      // Proximamente proximamente = new Proximamente();

      List<Cartelera> listarCatelera = carteleraService.listarCatelera();
      // List<Proximamente> listarProximamente = proximamenteService.listarProximamente();

      model.addAttribute("cartelera", cartelera);
      model.addAttribute("listarCatelera", listarCatelera);

      // model.addAttribute("proximamente", proximamente);
      // model.addAttribute("listarProximamente", listarProximamente);

      return "/pages/subpaginas/peliculasFrm";
    }

    @PostMapping("/save")
    public String guardarCartelera(@ModelAttribute Cartelera cartelera){
      carteleraService.guardarCartelera(cartelera);
      // proximamenteService.guardarProximamente(proximamente);

      System.out.println("Registro guardado");
      return "redirect:/pages/subpaginas/peliculas";
    }
 
    @GetMapping("/edit/{id}")
    public String editarCartelera(@PathVariable("id")Long idcartelera, Model model){

      Cartelera cartelera = carteleraService.buscarCarteleraId(idcartelera);
      // Proximamente proximamente = proximamenteService.buscarProximamente(idproximamente);

      model.addAttribute("nombrePelicula", cartelera.getTitulo());
      model.addAttribute("cartelera", cartelera);
      // model.addAttribute("proximamente", proximamente);
      System.out.println("Registro editado");
      return "/pages/subpaginas/peliculasFrm";
    }

    @GetMapping("/delete/{id}")
    public String eliminarCartelera(@PathVariable("id")Long idcartelera){
      carteleraService.eliminarCarteleraId(idcartelera);

      System.out.println("Registro Eliminado");
      return "redirect:/pages/subpaginas/peliculas";
    }

    @GetMapping("/delete/proximamente/{id}")
    public String eliminarProximamente(@PathVariable("id")Long idProximamente){
      proximamenteService.eliminarProximamente(idProximamente);

      System.out.println("Registro Eliminado");
      return "redirect:/pages/subpaginas/peliculas";
    }
}
