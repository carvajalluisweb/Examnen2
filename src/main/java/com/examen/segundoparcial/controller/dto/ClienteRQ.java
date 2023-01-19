package com.examen.segundoparcial.controller.dto;

import java.io.Serializable;
import java.util.Date;

import lombok.Builder;
import lombok.Data;

@Data
@Builder

public class ClienteRQ implements Serializable{

    private String cedula;
    private String nombre;
    private Date fnaci;
    private String direccion;
    private String telefono;
    private String correo;
    
}
