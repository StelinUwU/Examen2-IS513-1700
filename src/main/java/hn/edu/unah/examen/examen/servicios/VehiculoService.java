package hn.edu.unah.examen.examen.servicios;

import hn.edu.unah.examen.examen.models.Vehiculo;

public interface VehiculoService {

    public Vehiculo createVehicle(Vehiculo vehiculo);

    public Vehiculo createVehicleType(Vehiculo vehiculo);

    public Vehiculo getAllVehicles();

    public Vehiculo getVehicleById(int id);
}
