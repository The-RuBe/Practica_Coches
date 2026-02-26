package vehiculos.ciclomotor.quad;

import vehiculos.Vehiculo;

public class Quad extends Vehiculo{
	
	private double tamaño;

	public Quad(String marca, String modelo, String matricula, double tamaño) {
		super(marca, modelo, matricula);
		this.tamaño = tamaño;
	}

	public double getTamaño() {
		return tamaño;
	}

	public void setTamaño(double tamaño) {
		this.tamaño = tamaño;
	}

	@Override
	public void acelerar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toString() {
		return String.format("Quad --> [ Marca = %s || Modelo = %s || Matrícula = %s || Tamaño = %f]", this.getMarca(), this.getModelo(), this.getMatricula(), this.getTamaño());
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Quad other = (Quad) obj;
		return Double.doubleToLongBits(tamaño) == Double.doubleToLongBits(other.tamaño);
	}
	
	
	
}
