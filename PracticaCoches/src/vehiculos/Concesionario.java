package vehiculos;

import java.util.ArrayList;
import java.util.List;

public class Concesionario {

    private List<Vehiculo> listaVehiculos;

    public Concesionario() {
        listaVehiculos = new ArrayList<>();
    }

    // Añadir vehículo al final de la lista
    public void addVehiculo(Vehiculo v) {
        listaVehiculos.add(v);
    }

    // Eliminar vehículo
    public void eliminarVehiculo(Vehiculo v) {
        listaVehiculos.remove(v);
    }

    public List<Vehiculo> getListaVehiculos() {
        return listaVehiculos;
    }
}