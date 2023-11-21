package hn.edu.unah.examen.examen.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/services/reservas")
public class ReservasController {

    @RequestMapping("/create")
    public boolean createReserva() {
        return true;
    }
}