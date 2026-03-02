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
<<<<<<< HEAD
		Camper cp1 = new Camper("Volkswagen", "California", "1212-KKL", "L3H2", "Techo elevable y cocina");
=======
		Camper cp1 = new Camper("Volkswagen", "California", "1212-KKL", "L1H1", "Techo elevable y cocina");
>>>>>>> c044c08d45c5fb0133c9da1e429730c589148c60

		System.out.println("------------------------------------");
		
		// metodo añadir vehiculo al consesionario
		concesionario.añadirVehiculo(c1);
		concesionario.añadirVehiculo(r1);
		concesionario.añadirVehiculo(s1);
		concesionario.añadirVehiculo(m1);
		concesionario.añadirVehiculo(q1);
		concesionario.añadirVehiculo(cp1);

		System.out.println("------------------------------------");
		
		// metodo para mostrar el concesionario
		concesionario.mostrarInventario();
		
		System.out.println("------------------------------------");
		
		// metodo eliminar vehiculo del consecionario
		concesionario.eliminarVehiculo(r1);
		concesionario.mostrarInventario();
		
		Vehiculo v1 = c1;
		
		System.out.println("------------------------------------");
		
		// metodos acelerar para cada vehiculo

		v1.acelerar();
<<<<<<< HEAD
		r1.acelerar();
		s1.acelerar();
		m1.acelerar();
		q1.acelerar();
		cp1.acelerar();
		
		System.out.println("------------------------------------");
		
		// metodo del camion
		System.out.println("método cargar() del camión:");
		c1.cargar(8000);
		c1.cargar(15000);
		
		System.out.println("-----------------------------------");
		
		System.out.println("método arrancar() de sedán:");
=======
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
>>>>>>> c044c08d45c5fb0133c9da1e429730c589148c60
		s1.arrancar(1);
		s1.arrancar(0);
		
		System.out.println("------------------------------------");
		
		System.out.println("método respostar() de la furgoneta:");
		cp1.repostar(20);
		cp1.repostar(0);

	}
}