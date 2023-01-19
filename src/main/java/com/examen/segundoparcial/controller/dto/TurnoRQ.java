package com.examen.segundoparcial.controller.dto;

import java.io.Serializable;
import java.util.Date;

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
    private Date hfGerenacion;
    private Date hrInicio;
    private Date hfFin;
    private Integer calificacion;
    
}
