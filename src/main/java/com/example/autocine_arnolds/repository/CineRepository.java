package com.example.autocine_arnolds.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.autocine_arnolds.model.Cine;

@Repository
public interface CineRepository extends JpaRepository <Cine,Long>{
    
}








