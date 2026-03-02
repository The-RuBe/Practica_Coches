package vehiculos.coche;

public class Sedan extends Coche {

	private int puertas;
	boolean encendido = false;
	
	public Sedan(String marca, String modelo, String matricula, String combustible, int puertas) {
		super(marca, modelo, matricula, combustible);
		this.puertas = puertas;
	}

	public int getPuertas() {
		return puertas;
	}

	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}

	@Override
	public String toString() {
		return String.format(
				"Vehiculos --> [ Marca = %s || Modelo = %s || Matrícula = %s || Combustible = %s || Puertas = %d ]",
				this.getMarca(), this.getModelo(), this.getMatricula(), this.getCombustible().toString(), this.puertas);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;

		Sedan other = (Sedan) obj;
		return super.equals(obj) && this.puertas == other.puertas;
	}

	@Override
	public void acelerar() {
		System.out.println("Este vehículo puede alcanzar los 100 km/h en 5 segundos");
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
