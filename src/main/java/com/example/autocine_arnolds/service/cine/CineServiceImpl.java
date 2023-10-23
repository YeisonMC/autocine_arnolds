package com.example.autocine_arnolds.service.cine;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.autocine_arnolds.model.Cine;
import com.example.autocine_arnolds.repository.CineRepository;

@Service
public class CineServiceImpl implements CineService{

    @Autowired
    private CineRepository cineRepository;

    @Override
    public List<Cine> listarCine() {
     return (List<Cine>) cineRepository.findAll();
    }

    @Override
    public void guardarCine(Cine cine) {
        cineRepository.save(cine);
    }

    @Override
    public Cine buscarCineId(Long id) {
        return cineRepository.findById(id).orElse(null);
    }

    @Override
    public void eliminarCineId(Long id) {
        cineRepository.deleteById(id);
    }
}
