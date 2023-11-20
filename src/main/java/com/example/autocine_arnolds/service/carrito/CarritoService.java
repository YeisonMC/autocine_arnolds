package com.example.autocine_arnolds.service.carrito;

import java.util.List;

import com.example.autocine_arnolds.model.Carrito;

public interface CarritoService {
    List<Carrito> listaCarritos();
    void guardarCarrito (Carrito carrito);

    Carrito buscarCarritoId(Long id);
    void eliminarCarritoId(Long id);
}
 