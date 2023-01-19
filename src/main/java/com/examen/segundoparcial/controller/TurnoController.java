package com.examen.segundoparcial.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.examen.segundoparcial.controller.dto.TurnoRQ;
import com.examen.segundoparcial.controller.mapper.TurnoMapper;
import com.examen.segundoparcial.service.TurnoService;

@RestController
@RequestMapping("api/turno")
public class TurnoController {

    private final TurnoService turnoService;

    public TurnoController (TurnoService turnoService){
        this.turnoService = turnoService;
    }

    @RequestMapping(value = "/{cedula}", method = RequestMethod.POST)
    public Object createTurno(@PathVariable("cedula")String cedula,@RequestBody TurnoRQ turnoRQ) {
        try {
            this.turnoService.crearTurno(cedula,TurnoMapper.toTurno(turnoRQ));
            return ResponseEntity.ok("Holiday created successfully");

        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }
    
}
