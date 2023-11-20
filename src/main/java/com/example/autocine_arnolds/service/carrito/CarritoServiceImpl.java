package com.example.autocine_arnolds.service.carrito;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.autocine_arnolds.model.Carrito;
import com.example.autocine_arnolds.repository.CarritoRepository;

@Service
public class CarritoServiceImpl implements CarritoService {
    
    @Autowired 
    private CarritoRepository carritoRepository;

    @Override
    public List<Carrito> listaCarritos() {
      return (List<Carrito>) carritoRepository.findAll();
    }

    @Override
    public void guardarCarrito(Carrito carrito) {
        carritoRepository.save(carrito);
    }

    @Override
    public Carrito buscarCarritoId(Long id) {
        return carritoRepository.findById(id).orElse(null);
    }

    @Override
    public void eliminarCarritoId(Long id) {
        carritoRepository.deleteById(id);
    }
}
