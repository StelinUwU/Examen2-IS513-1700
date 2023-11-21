package hn.edu.unah.examen.examen.servicios.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.edu.unah.examen.examen.models.Cliente;
import hn.edu.unah.examen.examen.repositorios.ClienteRepository;
import hn.edu.unah.examen.examen.servicios.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteRepository clientRepository;

    @Override
    public String createCliente(Cliente nuevoCliente) {

        return "Cliente creado";
    }

    @Override
    public Cliente getClients(Cliente cliente) {
        return null;
    }

    @Override
    public Cliente getAllClients(Cliente cliente) {
        return null;
    }

    @Override
    public Cliente getClienteById(int id) {
        return null;
    }

}
