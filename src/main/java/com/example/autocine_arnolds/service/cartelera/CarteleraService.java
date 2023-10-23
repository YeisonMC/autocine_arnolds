package com.example.autocine_arnolds.service.cartelera;

import java.util.List;

import com.example.autocine_arnolds.model.Cartelera;

public interface CarteleraService {
    List<Cartelera> listarCatelera();
    void guardarCartelera(Cartelera cartelera);

    Cartelera buscarCarteleraId(Long id);
    void eliminarCarteleraId(Long id);
}
  