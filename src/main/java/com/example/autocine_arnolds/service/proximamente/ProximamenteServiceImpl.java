package com.example.autocine_arnolds.service.proximamente;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.autocine_arnolds.model.Proximamente;
import com.example.autocine_arnolds.repository.ProximamenteRepository;
 
@Service
public class ProximamenteServiceImpl implements ProximamenteService{

    @Autowired
    private ProximamenteRepository proximamenteRepository;

    @Override
    public List<Proximamente> listarProximamente() {
      return(List<Proximamente>) proximamenteRepository.findAll();
    }

    @Override
    public void guardarProximamente(Proximamente proximamente) {
        proximamenteRepository.save(proximamente);
    }

    @Override
    public Proximamente buscarProximamente(Long id) {
        return proximamenteRepository.findById(id).orElse(null);
    }

    @Override
    public void eliminarProximamente(Long id) {
        proximamenteRepository.deleteById(id);
    }
}
