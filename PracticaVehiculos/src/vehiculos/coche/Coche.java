package vehiculos.coche;

import vehiculos.Vehiculo;

public abstract class Coche extends Vehiculo {

	private Combustible combustible;

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

}