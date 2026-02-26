package vehiculos;

import vehiculos.camion.Camion;
import vehiculos.coche.Coche;
import vehiculos.coche.Ranchera;
import vehiculos.coche.Sedan;
import vehiculos.furgoneta.Furgoneta;

public class Main {
	public static void main(String[] args) {

		Concesionario concesionario = new Concesionario();

		Ciclomotor ciclomotor = new Ciclomotor("Piaggio", "Zip", "1111AAA", 50);
		Moto moto = new Moto("Yamaha", "MT-07", "2222BBB", 700, "naked");
		Quad quad = new Quad("Can-Am", "Outlander", "3333CCC", 650, "grande");
		Coche coche = new Coche("Seat", "Ibiza", "4444DDD", "gasolina");
		Sedan sedan = new Sedan("BMW", "Serie 3", "5555EEE", "diesel", 4);
		Ranchera ranchera = new Ranchera("Skoda", "Octavia", "6666FFF", "diesel", 600);
		Camion camion = new Camion("MAN", "TGX", "7777GGG", 12000);
		Furgoneta furgoneta = new Furgoneta("Mercedes", "Vito", "8888HHH", "L2H2");
		Camper camper = new Camper("Volkswagen", "California", "9999JJJ", "L1H1", "Cama, fregadero, placas solares y nevera");
		
		concesionario.addVehiculo(ciclomotor);
		concesionario.addVehiculo(moto);
		concesionario.addVehiculo(quad);
		concesionario.addVehiculo(coche);
		concesionario.addVehiculo(sedan);
		concesionario.addVehiculo(ranchera);
		concesionario.addVehiculo(camion);
		concesionario.addVehiculo(furgoneta);
		concesionario.addVehiculo(camper);
		
		// probar solo camion

		System.out.println("método acelerar() del camión:");

		Vehiculos v1 = camion;

		v1.acelerar();

		System.out.println("método cargar() del camión:");
		camion.cargar(8000);
		camion.cargar(15000);
	}
}