package com.example.autocine_arnolds.service.cartelera;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.autocine_arnolds.model.Cartelera;
import com.example.autocine_arnolds.repository.CarteleraRepository;

@Service
public class pruebacartelera {
    @Autowired
    private CarteleraRepository carteleraRepository;

    public Cartelera obtenerCarteleraPorId(Long id) {
        Optional<Cartelera> carteleraOptional = carteleraRepository.findById(id);
        if (carteleraOptional.isPresent()) {
            return carteleraOptional.get();
        } else {
            throw new CarteleraNotFoundException("Cartelera no encontrada con ID: " + id);
        }
    }
}
