package com.example.autocine_arnolds.repository;

import org.springframework.stereotype.Repository;

import com.example.autocine_arnolds.model.Proximamente;

import org.springframework.data.repository.CrudRepository;


@Repository
public interface ProximamenteRepository extends CrudRepository<Proximamente, Long>{
    
}
