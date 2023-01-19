package com.examen.segundoparcial.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Version;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Document(collection = "clientes")
public class Cliente {
    @Id
    private String id;

    private String cedula;
    private String nombre;
    private Date fnaci;
    private String direccion;
    private String telefono;
    private String correo;

    @Version
    private Integer version;

    
}
