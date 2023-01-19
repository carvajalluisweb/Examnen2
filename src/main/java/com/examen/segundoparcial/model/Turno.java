package com.examen.segundoparcial.model;
import java.security.Timestamp;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Version;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Builder;
import lombok.Data;
@Data
@Builder
@Document(collection = "turnos")
public class Turno {

    @Id
    private String Id;

    private Integer numturno;
    private String cedulaCli;
    private String nombreCli;
    private String codigoEj;
    private String nombreEj;
    private Timestamp hfGerenacion;
    private Timestamp hrInicio;
    private Timestamp hfFin;
    private Integer calificacion;

    @Version
    private Integer version;
    


    
    
}
