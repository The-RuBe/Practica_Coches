package vehiculos;

import vehiculos.camion.Camion;

public class Main {
    public static void main(String[] args) {

        Camion camion = new Camion("MAN", "TGX", "7777ABC", 12000);

        System.out.println("Demostración de polimorfismo con acelerar():");

        Vehiculos v1 = camion;     

        v1.acelerar();  
        System.out.println("\nProbando método cargar() del camión:");
        camion.cargar(8000);
        camion.cargar(15000);
    }
}