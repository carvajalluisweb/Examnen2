package com.examen.segundoparcial.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


import com.examen.segundoparcial.model.Turno;

@Repository
public interface TurnoRepository  extends MongoRepository<Turno,String>{
    
}
