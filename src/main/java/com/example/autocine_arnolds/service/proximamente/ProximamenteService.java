package com.example.autocine_arnolds.service.proximamente;

import java.util.List;

import com.example.autocine_arnolds.model.Proximamente;

public interface ProximamenteService {

    List<Proximamente> listarProximamente();
    void guardarProximamente(Proximamente proximamente);

    Proximamente buscarProximamente(Long id);
    void eliminarProximamente(Long id);
}
