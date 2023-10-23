package com.example.autocine_arnolds.service.cartelera;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.autocine_arnolds.model.Cartelera;
import com.example.autocine_arnolds.repository.CarteleraRepository;

@Service
public class CarteleraServiceImpl implements CarteleraService{
    
    @Autowired
    private CarteleraRepository carteleraRepository;

    @Override
    public List<Cartelera> listarCatelera() {
        return (List<Cartelera>) carteleraRepository.findAll();
    }

    @Override
    public void guardarCartelera(Cartelera cartelera) {
        carteleraRepository.save(cartelera);
    }

    @Override
    public Cartelera buscarCarteleraId(Long id) {
        return carteleraRepository.findById(id).orElse(null);
    }

    @Override
    public void eliminarCarteleraId(Long id) {
       carteleraRepository.deleteById(id);
    } 
}
 