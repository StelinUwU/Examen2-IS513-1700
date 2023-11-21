package hn.edu.unah.examen.examen.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import hn.edu.unah.examen.examen.models.TipoVehiculo;
import hn.edu.unah.examen.examen.models.Vehiculo;

@RestController
@RequestMapping("/api/services/vehiculos")
public class VehiculosController {

    @RequestMapping("/type/create")
    public String createCarType(@RequestBody TipoVehiculo tipoVehiculo) {
        return tipoVehiculo.toString();
    }

    @RequestMapping("/create")
    public String createClient(@RequestBody Vehiculo vehiculo) {
        return vehiculo.toString();
    }

    @RequestMapping("/getVehicles")
    public String getAllVehicles() {
        return "getAllVehicles";
    }

    @RequestMapping("/getVehicle/{id}")
    public String getVehicleById(@PathVariable int id) {
        return "getVehicleById " + id;
    }
}
