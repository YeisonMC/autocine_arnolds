package com.example.autocine_arnolds.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.autocine_arnolds.model.Cartelera;
import com.example.autocine_arnolds.service.cartelera.CarteleraService;

@Controller
@RequestMapping("/cartelera")
public class CarteleraController {


    @Autowired
    CarteleraService carteleraService;

    @GetMapping("/")
    public String listarCatelera(Model model){
        
        List<Cartelera> listarCatelera = carteleraService.listarCatelera();
        
        model.addAttribute("titulo", "Lista de personajes / Marvel");
        model.addAttribute("listarCatelera", listarCatelera);

        return "/cartelera/detalleCartelera";
    }

    @GetMapping("/get/{id}")
    public String buscarCarteleraId(@PathVariable("id") Long id, Model model) {
        Cartelera cartelera = carteleraService.buscarCarteleraId(id);
        model.addAttribute("cartelera", cartelera);
        return "cartelera/detalleCartelera"; // Cambia la vista a la página de detalles
    }

    // public CarteleraController(CarteleraService carteleraService) {
    //     this.carteleraService = carteleraService;
    // }

    // @GetMapping
    // public ResponseEntity<List<Cartelera>> listarCarteleras() {
    //     List<Cartelera> carteleras = carteleraService.listarCatelera();
    //     return new ResponseEntity<>(carteleras, HttpStatus.OK);
    // }

    // @GetMapping("/{id}")
    // public ResponseEntity<Cartelera> obtenerCarteleraPorId(@PathVariable Long id) {
    //     try {
    //         Cartelera cartelera = carteleraService.buscarCarteleraId(id);
    //         return new ResponseEntity<>(cartelera, HttpStatus.OK);
    //     } catch (CarteleraNotFoundException ex) {
    //         return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    //     }
    // }

 
    
        // @Autowired
        // private pruebacartelera pruebacartelera;
    
        // @GetMapping("/detalleCartelera/{id}")
        // public String verDetalleCartelera(@PathVariable Long id, Model model) {
        //     Cartelera cartelera = pruebacartelera.obtenerCarteleraPorId(id);
        //     model.addAttribute("cartelera", cartelera);
        //     return "detalleCartelera";
        // }





    // @GetMapping("/")
    // public List<Cartelera> listarCartelerasPorIds(@RequestParam List<Long> ids) {
    //     return carteleraService.listarCartelerasPorIds(ids);
    // }
    


    // @GetMapping("/")
    // public String listarCatelera(Model model){
    //     List<Cartelera> cartelera = carteleraService.listarCatelera();
    //     model.addAttribute("cartelera", cartelera);
    //     return "cartelera";
    // }

    // @GetMapping()
    // public ArrayList<Cartelera>listarCatelera(){
    //     return (ArrayList<Cartelera>) carteleraService.listarCatelera();
    // }


}
