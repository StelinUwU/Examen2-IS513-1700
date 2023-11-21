package hn.edu.unah.examen.examen.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import hn.edu.unah.examen.examen.models.Cliente;
import hn.edu.unah.examen.examen.models.TipoCliente;

@RestController
@RequestMapping("/api/services/clientes")

public class ClientesController {

    @RequestMapping("/type/create")
    public String createClientType(@RequestBody TipoCliente tipoCliente) {
        return tipoCliente.toString();
    }

    @RequestMapping("/create")
    public String createClient(@RequestBody Cliente cliente) {
        return cliente.toString();
    }

    @RequestMapping("/getClients")
    public String getAllClients() {
        return "getAllClients";
    }

    @RequestMapping("/getClients/{id}")
    public String getClientsById(@PathVariable int id) {
        return "getAllClients " + id;
    }

}
