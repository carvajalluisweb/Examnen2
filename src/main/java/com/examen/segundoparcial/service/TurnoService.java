package com.examen.segundoparcial.service;

import org.springframework.stereotype.Service;

import com.examen.segundoparcial.repository.TurnoRepository;

@Service
public class TurnoService {

    private final TurnoRepository turnoRepository;

    public TurnoService(TurnoRepository turnoRepository){
        this.turnoRepository = turnoRepository;
    }

    
    
}
