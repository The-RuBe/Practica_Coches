package vehiculos.coche;

public class Ranchera extends Coche {

	private int capacidadMaletero;

	public Ranchera(String marca, String modelo, String matricula, Combustible combustible, int capacidadMaletero) {
		super(marca, modelo, matricula, combustible);
		this.capacidadMaletero = capacidadMaletero;
	}

	public int getCapacidadMaletero() {
		return capacidadMaletero;
	}

	public void setCapacidadMaletero(int capacidadMaletero) {
		this.capacidadMaletero = capacidadMaletero;
	}

	@Override
	public String toString() {
		return String.format(
				"Vehiculos --> [ Marca = %s || Modelo = %s || Matrícula = %s || Combustible = %s || Capacidad de maletero = %d]",
				this.getMarca(), this.getModelo(), this.getMatricula(), this.getCombustible(), this.capacidadMaletero);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;

		Ranchera other = (Ranchera) obj;
		return super.equals(obj) && this.capacidadMaletero == other.capacidadMaletero;
	}

	@Override
	public void acelerar() {
		System.out.println("Este vehículo puede alcanzar los 100 km/h en 10 segundos");
	}

}
