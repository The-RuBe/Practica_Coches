package vehiculos;

import vehiculos.camion.Camion;
import vehiculos.ciclomotor.moto.Moto;
import vehiculos.ciclomotor.quad.Quad;
import vehiculos.coche.Ranchera;
import vehiculos.coche.Sedan;
import vehiculos.furgoneta.Camper;

public class Main {
	public static void main(String[] args) {

		Concesionario concesionario = new Concesionario();

		Moto moto = new Moto("Yamaha", "MT-07", "2222BBB", 700, "naked");
		Quad quad = new Quad("Can-Am", "Outlander", "3333CCC", 650, 500);
		Sedan sedan = new Sedan("BMW", "Serie 3", "5555EEE", "Diesel", 4);
		Ranchera ranchera = new Ranchera("Skoda", "Octavia", "6666FFF", "Gasolina", 600);
		Camion camion = new Camion("MAN", "TGX", "7777GGG", 12000);
		Camper camper = new Camper("Volkswagen", "California", "9999JJJ", "L1H1",
				"Cama, fregadero, placas solares y nevera");

		concesionario.addVehiculo(moto);
		concesionario.addVehiculo(quad);
		concesionario.addVehiculo(sedan);
		concesionario.addVehiculo(ranchera);
		concesionario.addVehiculo(camion);
		concesionario.addVehiculo(camper);

		// probar solo camion

		System.out.println("método acelerar() del camión:");

		Vehiculo v1 = camion;

		v1.acelerar();

		System.out.println("método cargar() del camión:");
		camion.cargar(8000);
		camion.cargar(15000);
	}
}