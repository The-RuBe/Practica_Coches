package vehiculos;

import vehiculos.camion.Camion;
import vehiculos.ciclomotor.Moto;
import vehiculos.ciclomotor.Quad;
import vehiculos.coche.Ranchera;
import vehiculos.coche.Sedan;
import vehiculos.furgoneta.Camper;

public class Main {
	public static void main(String[] args) {

		Concesionario concesionario = new Concesionario(10);

		Camion c1 = new Camion("Volvo", "FH16", "1111-AAA", 20000);
		Ranchera r1 = new Ranchera("Audi", "A4 Avant", "3333-CCC", "DIESEL", 505);
		Sedan s1 = new Sedan("BMW", "Serie 3", "5555-EEE", "GASOLINA", 4);
		Moto m1 = new Moto("Honda", "CBR 600", "7777-GGG", 600.0, "Deportiva");
		Quad q1 = new Quad("Suzuki", "LTZ 400", "9999-III", 400.0, 1.80);
		Camper cp1 = new Camper("Volkswagen", "California", "1212-KKL", "L1H1", "Techo elevable y cocina");

		System.out.println("Métodos acelerar():");

		Vehiculo v1 = c1;

		v1.acelerar();
		System.out.println();
		System.out.println("Método para añadir Vehículos al Array de Concesionario: ");
		concesionario.añadirVehiculo(c1);
		concesionario.añadirVehiculo(r1);
		concesionario.añadirVehiculo(m1);
		concesionario.añadirVehiculo(cp1);
		concesionario.añadirVehiculo(q1);
		concesionario.añadirVehiculo(s1);
		
		System.out.println();
		
		System.out.println("Método para eliminar Vehículo:");
		concesionario.eliminarVehiculo(s1);
		
		System.out.println();
		System.out.println("Método cargar() del camión:");
		c1.cargar(8000);
		c1.cargar(15000);
		
		System.out.println();
		System.out.println("Método arrancar() del sedán:");
		s1.arrancar(1);
		s1.arrancar(1);
		s1.arrancar(0);
	}
}