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

import com.example.autocine_arnolds.model.Carrito;
import com.example.autocine_arnolds.model.Cartelera;
import com.example.autocine_arnolds.model.Cine;
import com.example.autocine_arnolds.model.Proximamente;
import com.example.autocine_arnolds.service.carrito.CarritoService;
import com.example.autocine_arnolds.service.cartelera.CarteleraService;
import com.example.autocine_arnolds.service.cine.CineService;

@Controller
@RequestMapping("/pages/cines")
public class CineController {
    @Autowired
    CarteleraService carteleraService;

    @Autowired
    CineService cineService;

    @Autowired
    CarritoService carritoService;
  
    @GetMapping("/cine")
    public String peliculas(Model model){
      List<Cine> listarCine = cineService.listarCine();
      model.addAttribute("listarCine", listarCine);
      return "/pages/cines/cine";
    }

    @GetMapping("/create")
    public String  crearCines (Model model){
      Cine cine = new Cine();

     List<Cine> listarCine = cineService.listarCine();

     model.addAttribute("cine", cine);
      model.addAttribute("listarCine", listarCine);

      return "/pages/cines/cineFrm";
    } 

    @PostMapping("/save")
    public String guardarCines (@ModelAttribute Cine cine){
      cineService.guardarCine(cine);
      System.out.println("Registro guardado");
      return "redirect:/pages/cines/cine";
    }

    @GetMapping("/edit/{id}")
    public String editarCines(@PathVariable("id")Long idcine, Model model){

      Cine cine = cineService.buscarCineId(idcine);
      model.addAttribute("cine", cine);
      return "/pages/cines/cineFrm";
    }

    @GetMapping ("/delete/{id}")
    public String eliminarCines(@PathVariable("id")Long idcine){
      cineService.eliminarCineId(idcine);
      System.out.println("Registro Eliminado");
      return "redirect:/pages/cines/cine";
    }

    //************************ CINE DETALLES ************************

      @GetMapping("/cineDetalles/{id}")
    public String cineDetalles(@PathVariable("id") Long id, Model model) {

      List<Cine> listarCine = cineService.listarCine();
      List<Carrito> listarCarrito = carritoService.listaCarritos();
      List<Cartelera> listarCatelera = carteleraService.listarCatelera();
      Cine cine = cineService.buscarCineId(id);
      Collections.shuffle(listarCatelera); 
 
      model.addAttribute("nombreCine", cine.getNombre());
      model.addAttribute("listarCatelera", listarCatelera);
      model.addAttribute("listarCarrito", listarCarrito);
      model.addAttribute("cine", cine);
      model.addAttribute("listarCine", listarCine);

        return "/pages/cines/cineDetalles"; 
    }

    //   @GetMapping("/cineDetalles")
    // public String listcineDetalles(Model model){

    //   List<Cartelera> listarCatelera = carteleraService.listarCatelera();
    //   List<Cine> listarCine = cineService.listarCine();
    //   model.addAttribute("listarCine", listarCine);
    //   model.addAttribute("listarCatelera", listarCatelera);
    //   return "/pages/cines/cineDetalles";
    // }

}
