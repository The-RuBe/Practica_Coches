package vehiculos.coche;

import vehiculos.Vehiculo;

public abstract class Coche extends Vehiculo {

	private Combustible combustible;
	private boolean encendido = false;

	public Coche(String marca, String modelo, String matricula, String combustible) {
		super(marca, modelo, matricula);
		setCombustible(combustible);
	}

	public String getCombustible() {
		return combustible.toString();
	}

	public void setCombustible(String combustible) {
		this.combustible = Combustible.valueOf(combustible);
	}

	@Override
	public String toString() {
		return String.format("Vehiculos --> [ Marca = %s || Modelo = %s || Matrícula = %s || Combustible = %s ]",
				this.getMarca(), this.getModelo(), this.getMatricula(), this.combustible.toString());
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;

		Coche other = (Coche) obj;
		return super.equals(obj) && this.combustible.equals(other.combustible);
	}

	public void arrancar(int motorEncendido) {
		if (motorEncendido == 1 && encendido != true) {
			System.out.println("El vehículo ha arrancado.");
			encendido = true;
		} else if (motorEncendido == 0 && encendido != false) {
			System.out.println("El vehículo se ha apagado.");
			encendido = false;
		} else {
			System.out.println("Orden no reconocida. Usa 1 para arrancar o 0 para apagar.");
			System.out.println(
					"En el caso de que el vehículo esté ya arrancado no puedes arrancarlo de nuevo, además si está apagado no puedes apagarlo de nuevo.");
		}
	}

}
