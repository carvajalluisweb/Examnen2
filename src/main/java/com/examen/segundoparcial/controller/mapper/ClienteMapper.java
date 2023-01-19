package com.examen.segundoparcial.controller.mapper;

import com.examen.segundoparcial.controller.dto.ClienteRQ;
import com.examen.segundoparcial.controller.dto.ClienteRS;
import com.examen.segundoparcial.model.Cliente;

public class ClienteMapper {

    public static Cliente toCliente(ClienteRQ rq){
        return Cliente.builder().cedula(rq.getCedula()).nombre(rq.getNombre()).fnaci(rq.getFnaci()).direccion(rq.getDireccion()).telefono(rq.getTelefono()).correo(rq.getCorreo()).build();
    }
    

    public static ClienteRS toClienteRS(Cliente rq){
        return ClienteRS.builder().cedula(rq.getCedula()).nombre(rq.getNombre()).fnaci(rq.getFnaci()).direccion(rq.getDireccion()).telefono(rq.getTelefono()).correo(rq.getCorreo()).build();
    }
}
