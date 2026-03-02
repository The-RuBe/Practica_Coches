package vehiculos.camion;

import vehiculos.Vehiculo;

public class Camion extends Vehiculo {
	private int capacidadCarga;

	public Camion(String marca, String modelo, String matricula, int capacidadCarga) {
		super(marca, modelo, matricula);
		this.capacidadCarga = capacidadCarga;
	}

	public int getCapacidadCarga() {
		return capacidadCarga;
	}

	public void setCapacidadCarga(int capacidadCarga) {
		this.capacidadCarga = capacidadCarga;
	}

	@Override
	public String toString() {
		return String.format("Camion --> [ Marca = %s || Modelo = %s || Matrícula = %s || Capacidad de carga = %d ]",
				this.getMarca(), this.getModelo(), this.getMatricula(), this.capacidadCarga);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Camion other = (Camion) obj;
		return super.equals(obj) && this.capacidadCarga == other.capacidadCarga;
	}

	@Override
	public void acelerar() {
		System.out.println("El camión acelera lentamente.");
	}

	public void cargar(double peso) {
		if (peso <= 0) {
			System.out.println("El peso debe ser mayor que 0 kg.");
		} else if (peso <= capacidadCarga) {
			System.out.println("Carga aceptada: " + peso + " kg.");
		} else {
			System.out.println("Carga rechazada, supera la capacidad máxima de " + capacidadCarga + " kg.");
		}
	}
}
