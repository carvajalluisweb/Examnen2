package com.examen.segundoparcial.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.examen.segundoparcial.model.Cliente;
import com.examen.segundoparcial.model.Turno;
import com.examen.segundoparcial.repository.ClienteRepository;
import com.examen.segundoparcial.repository.TurnoRepository;

@Service
public class TurnoService {

    private final TurnoRepository turnoRepository;
    private final ClienteRepository clienteRepository;

    public TurnoService(TurnoRepository turnoRepository,ClienteRepository clienteRepository){
        this.turnoRepository = turnoRepository;
        this.clienteRepository = clienteRepository;
    }

  

    @Transactional
    public void crearTurno(String cedula,Turno turno) {

        Cliente cliente = (Cliente) this.clienteRepository.findByCedula(cedula);

        List<Turno> turnos = this.turnoRepository.findByTurno(turno.getNumturno());
        if (turnos.isEmpty()) {
            turno.setCedulaCli(cedula);
            turno.setNombreCli(cliente.getNombre());
            

            this.turnoRepository.save(turno);
        } else {
            throw new RuntimeException("Turno Creado");
        }
    }
    
}
