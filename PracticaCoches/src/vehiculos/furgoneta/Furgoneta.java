package vehiculos.furgoneta;

import vehiculos.Vehiculo;

public abstract class Furgoneta extends Vehiculo {

	private Tipo tipo;

//	Tratamos a los tipo Enum como si fuesen Strings
	public Furgoneta(String marca, String modelo, String matricula, String tipo) {
		super(marca, modelo, matricula);
		setTipo(tipo);
	}

	public String getTipo() {
		return tipo.toString();
	}

	public void setTipo(String tipo) {
		this.tipo = Tipo.valueOf(tipo);
	}

	@Override
	public String toString() {
		return String.format("Furgoneta [marca= %s, modelo= %s, matricula= %s, tipo= %s]", this.getMarca(),
				this.getModelo(), this.getMatricula(), this.getTipo());
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		
		Furgoneta other = (Furgoneta) obj;
		return super.equals(obj) && this.tipo.equals(other.tipo);
	}

	@Override
	public void acelerar() {
		System.out.println(this.toString());
	}

}
