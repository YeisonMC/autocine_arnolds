package com.example.autocine_arnolds.service.cine;

import java.util.List;

import com.example.autocine_arnolds.model.Cine;

public interface CineService {

    List<Cine> listarCine();
    void guardarCine(Cine cine);

    Cine buscarCineId(Long id);
    void eliminarCineId(Long id);
}
 