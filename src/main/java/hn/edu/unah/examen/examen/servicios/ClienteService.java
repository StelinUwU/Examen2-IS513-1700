package hn.edu.unah.examen.examen.servicios;

import hn.edu.unah.examen.examen.models.Cliente;

public interface ClienteService {

    public String createCliente(Cliente cliente);

    public Cliente getClients(Cliente cliente);

    public Cliente getAllClients(Cliente cliente);

    public Cliente getClienteById(int id);

}
