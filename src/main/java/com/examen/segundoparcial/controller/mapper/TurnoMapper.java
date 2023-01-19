package com.examen.segundoparcial.controller.mapper;

import com.examen.segundoparcial.controller.dto.TurnoRQ;
import com.examen.segundoparcial.model.Turno;

public class TurnoMapper {

    public static Turno toTurno(TurnoRQ rq){
        return Turno.builder().numturno(rq.getNumturno()).cedulaCli(rq.getCedulaCli()).nombreCli(rq.getNombreCli()).codigoEj(rq.getCodigoEj()).nombreEj(rq.getNombreEj()).hfGerenacion(rq.getHfGerenacion()).hrInicio(rq.getHrInicio()).hfFin(rq.getHfFin()).calificacion(rq.getCalificacion()).build();
    }
    
}
