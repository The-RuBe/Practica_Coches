package vehiculos.coche;

public class Sedan extends Coche {

	private int puertas;

	public Sedan(String marca, String modelo, String matricula, Combustible combustible, int puertas) {
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
				super.getMarca(), super.getModelo(), super.getMatricula(), super.getCombustible(), this.puertas);
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

}
