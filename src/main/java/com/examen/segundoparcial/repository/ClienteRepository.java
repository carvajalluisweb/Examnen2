package com.examen.segundoparcial.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.examen.segundoparcial.model.Cliente;

@Repository
public interface ClienteRepository  extends MongoRepository<Cliente,String>{
    List<Cliente> findByCedula(String cedula);
    
}
