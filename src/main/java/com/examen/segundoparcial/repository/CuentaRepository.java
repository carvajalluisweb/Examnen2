package com.examen.segundoparcial.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


import com.examen.segundoparcial.model.Cuenta;

@Repository
public interface CuentaRepository  extends MongoRepository<Cuenta,String>{
    
}
