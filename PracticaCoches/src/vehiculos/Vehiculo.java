package vehiculos;

import java.util.Objects;

public abstract class Vehiculo {

	private String marca;
	private String modelo;
	private String matricula;

	public Vehiculo(String marca, String modelo, String matricula) {
		this.marca = marca;
		this.modelo = modelo;
		this.matricula = matricula;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	@Override
	public String toString() {
		return String.format("Vehiculos --> [ Marca = %s || Modelo = %s || Matrícula = %s ]", this.marca, this.modelo, this.matricula);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;

		Vehiculo other = (Vehiculo) obj;
		return this.marca.equals(other.marca) && this.matricula.equals(other.matricula)
				&& this.modelo.equals(other.modelo);
	}

	public abstract void acelerar();

}
