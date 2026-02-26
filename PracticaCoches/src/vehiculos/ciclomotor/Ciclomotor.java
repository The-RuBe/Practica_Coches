package vehiculos.ciclomotor;

import vehiculos.Vehiculo;

public abstract class Ciclomotor extends Vehiculo {
	
	private double cilindrada;

	public Ciclomotor(String marca, String modelo, String matricula, double cilindrada) {
		super(marca, modelo, matricula);
		this.cilindrada = cilindrada;
	}

	public double getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(double cilindrada) {
		this.cilindrada = cilindrada;
	}

	@Override
	public void acelerar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toString() {
		return String.format("Ciclomotor --> [ Marca = %s || Modelo = %s || Matrícula = %s || Cilindrada = %f]", this.getMarca(), this.getModelo(), this.getMatricula(),this.getCilindrada());
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ciclomotor other = (Ciclomotor) obj;
		return Double.doubleToLongBits(cilindrada) == Double.doubleToLongBits(other.cilindrada);
	}
	
	
	
}
