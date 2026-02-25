package vehiculos;

import java.util.ArrayList;
import java.util.List;

public class Concesionario {

    private List<Vehiculos> listaVehiculos;

    public Concesionario() {
        listaVehiculos = new ArrayList<>();
    }

    // Añadir vehículo al final de la lista
    public void addVehiculo(Vehiculos v) {
        listaVehiculos.add(v);
    }

    // Eliminar vehículo
    public void eliminarVehiculo(Vehiculos v) {
        listaVehiculos.remove(v);
    }

    public List<Vehiculos> getListaVehiculos() {
        return listaVehiculos;
    }
}