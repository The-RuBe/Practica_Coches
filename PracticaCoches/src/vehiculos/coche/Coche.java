package vehiculos.coche;

import vehiculos.Vehiculo;

public abstract class Coche extends Vehiculo {

	private Combustible combustible;

	public Coche(String marca, String modelo, String matricula, Combustible combustible) {
		super(marca, modelo, matricula);
		this.combustible = combustible;
	}

	public Combustible getCombustible() {
		return combustible;
	}

	public void setCombustible(Combustible combustible) {
		this.combustible = combustible;
	}

	@Override
	public String toString() {
		return String.format("Vehiculos --> [ Marca = %s || Modelo = %s || Matrícula = %s || Combustible = %s ]",
				super.getMarca(), super.getModelo(), super.getMatricula(), this.combustible);
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
		return super.equals(obj) && combustible.equals(other.combustible);
	}

}
