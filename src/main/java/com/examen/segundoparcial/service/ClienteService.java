package com.examen.segundoparcial.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.examen.segundoparcial.model.Cliente;
import com.examen.segundoparcial.repository.ClienteRepository;

@Service
public class ClienteService {
    private final ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository){
        this.clienteRepository = clienteRepository;
    }

    public List<Cliente> findByCedula(String cedula){
        return clienteRepository.findByCedula(cedula);
    }




}
