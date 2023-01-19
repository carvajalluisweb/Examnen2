package com.examen.segundoparcial.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Version;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Document(collection = "cuentas")
public class Cuenta {
    
    @Id
    private String Id;

    private String numero;
    private String tipo;
    private double saldo;

    @Version
    private Integer version;

}
