package com.examen.segundoparcial.service;

import java.security.Timestamp;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.examen.segundoparcial.model.Cliente;
import com.examen.segundoparcial.model.Ejecutivo;
import com.examen.segundoparcial.model.Turno;
import com.examen.segundoparcial.repository.ClienteRepository;
import com.examen.segundoparcial.repository.EjecutivoRepository;
import com.examen.segundoparcial.repository.TurnoRepository;

@Service
public class TurnoService {

    private final TurnoRepository turnoRepository;
    private final ClienteRepository clienteRepository;
    private final EjecutivoRepository ejecutivoRepository;

    public TurnoService(TurnoRepository turnoRepository, ClienteRepository clienteRepository, EjecutivoRepository ejecutivoRepository) {
        this.turnoRepository = turnoRepository;
        this.clienteRepository = clienteRepository;
        this.ejecutivoRepository = ejecutivoRepository;
    }

    @Transactional
    public void crearTurno(String cedula, Turno turno) {

        Cliente cliente = (Cliente) this.clienteRepository.findByCedula(cedula);

        List<Turno> turnos = this.turnoRepository.findByTurno(turno.getNumturno());
        if (turnos.isEmpty()) {
            turno.setCedulaCli(cedula);
            turno.setNombreCli(cliente.getNombre());
            turno.setHfGerenacion(null);

            this.turnoRepository.save(turno);
        } else {
            throw new RuntimeException("Turno Creado");
        }
    }

    @Transactional
    public void crearAtencion(String codigo, Turno turno) {

        Ejecutivo ejecutivo = (Ejecutivo) this.ejecutivoRepository.findByCodigo(codigo);

        List<Turno> turnos = this.turnoRepository.findByTurno(turno.getNumturno());
        Date date =new Date();
        if (!turnos.isEmpty()) {

            turno.setCodigoEj(ejecutivo.getCodigo());
            turno.setHfGerenacion(date);

            this.turnoRepository.save(turno);
        } else {
            throw new RuntimeException("NO existe turno");
        }
    }

}
