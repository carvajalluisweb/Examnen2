package com.examen.segundoparcial.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


import com.examen.segundoparcial.model.Ejecutivo;

@Repository
public interface EjecutivoRepository  extends MongoRepository<Ejecutivo,String>{

    List<Ejecutivo> findByCodigo(String cod);
    
}
