package com.examen.segundoparcial.controller.dto;

import java.io.Serializable;
import java.security.Timestamp;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TurnoRQ implements Serializable{

    private Integer numturno;
    private String cedulaCli;
    private String nombreCli;
    private String codigoEj;
    private String nombreEj;
    private Timestamp hfGerenacion;
    private Timestamp hrInicio;
    private Timestamp hfFin;
    private Integer calificacion;
    
}
