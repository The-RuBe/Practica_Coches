package vehiculos;

public class Concesionario {
    
    private Vehiculo[] listaVehiculos;
    private int numVehiculos;          

    public Concesionario(int capacidadMaxima) {
        this.listaVehiculos = new Vehiculo[capacidadMaxima];
        this.numVehiculos = 0;
    }

    public void añadirVehiculo(Vehiculo vehiculo) {
        if (numVehiculos < listaVehiculos.length) {
            listaVehiculos[numVehiculos] = vehiculo;
            numVehiculos++;
            System.out.println("Vehículo añadido: " + vehiculo.getMarca());
        } else {
            System.out.println("Error: El concesionario está lleno.");
        }
    }

    public void mostrarInventario() {
        System.out.println("--- Inventario del Concesionario ---");
        for (int i = 0; i < numVehiculos; i++) {
            System.out.println(listaVehiculos[i].toString());
        }
    }
}