package com.examen.segundoparcial.service;

import java.util.List;

import org.springframework.stereotype.Service;



import com.examen.segundoparcial.model.Ejecutivo;


import com.examen.segundoparcial.repository.EjecutivoRepository;


@Service
public class EjecutivoService {

    private final EjecutivoRepository ejecutivoRepository;
    

    public EjecutivoService(EjecutivoRepository ejecutivoRepository) {
        this.ejecutivoRepository = ejecutivoRepository;
        
    }

    public List<Ejecutivo> findByCodigo(String codigo){
        return ejecutivoRepository.findByCodigo(codigo);
    }

}
