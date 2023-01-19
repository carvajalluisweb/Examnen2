package com.examen.segundoparcial.controller;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.examen.segundoparcial.controller.dto.ClienteRS;
import com.examen.segundoparcial.controller.mapper.ClienteMapper;
import com.examen.segundoparcial.model.Cliente;
import com.examen.segundoparcial.service.ClienteService;

@RestController
@RequestMapping("api/cliente")
public class ClienteController {

    private final ClienteService clienteService;

    public ClienteController (ClienteService clienteService){
        this.clienteService = clienteService;
    }

    @RequestMapping(value = "/cedula/{cedula}", method = RequestMethod.GET)
    public Object findBCcedula(@PathVariable("cedula") String cedula) throws ParseException {
        Iterable<Cliente> clientes = this.clienteService.findByCedula(cedula);
        List<ClienteRS> clientesRS = new ArrayList<>();
        for (Cliente cliente : clientes)
            clientesRS.add(ClienteMapper.toClienteRS(cliente));
        if (clientesRS.isEmpty())
            return ResponseEntity.notFound().build();
        else
            return ResponseEntity.ok(clientesRS);
    }
    
}
