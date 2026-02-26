package vehiculos.moto;

import java.util.Objects;

import vehiculos.Vehiculo;

public class Moto extends Vehiculo{
	
	private String tipo;

	public Moto(String marca, String modelo, String matricula, String tipo) {
		super(marca, modelo, matricula);
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return String.format("Moto --> [ Marca = %s || Modelo = %s || Matrícula = %s || Tipo = %s]", this.getMarca(), this.getModelo(), this.getMatricula(),this.getTipo());
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Moto other = (Moto) obj;
		return Objects.equals(tipo, other.tipo);
	}

	@Override
	public void acelerar() {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
