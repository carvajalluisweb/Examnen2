package com.examen.segundoparcial.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Version;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Document(collection = "ejecutivos")

public class Ejecutivo {
    @Id
    private String Id;

    private String codigo;
    private String nombreC;
    private Integer escritorio;

    @Version
    private Integer version;
    
}
