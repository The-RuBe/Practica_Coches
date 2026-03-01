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

    public void eliminarVehiculo(Vehiculo vehiculo) {
        boolean encontrado = false;
        for (int i = 0; i < numVehiculos && encontrado == false; i++) {
            if (listaVehiculos[i].equals(vehiculo)) {
                System.out.println("Vehículo eliminado: " + listaVehiculos[i].getMarca());
                for (int j = i; j < numVehiculos - 1; j++) {
                    listaVehiculos[j] = listaVehiculos[j + 1];
                }
                listaVehiculos[numVehiculos - 1] = null;
                numVehiculos--;
                encontrado = true;
            }
        }
        if (encontrado == false) {
            System.out.println("Error: No se encontró el vehículo " + vehiculo.getMarca());
        }
    }
    
    public void mostrarInventario() {
        System.out.println("--- Inventario del Concesionario ---");
        for (int i = 0; i < numVehiculos; i++) {
            System.out.println(listaVehiculos[i].toString());
        }
    }
}