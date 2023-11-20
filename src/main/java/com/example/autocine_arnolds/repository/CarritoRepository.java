package com.example.autocine_arnolds.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.autocine_arnolds.model.Carrito;

@Repository
public interface CarritoRepository extends JpaRepository<Carrito,Long>{
    
}
