package vehiculos.furgoneta;

public class Camper extends Furgoneta {

	private String descripcion;

	public Camper(String marca, String modelo, String matricula, String tipo, String descripcion) {
		super(marca, modelo, matricula, tipo);
		this.descripcion = descripcion;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return String.format("Camper [marca= %s, modelo= %s, matricula= %s, descripcion= %s]", this.getMarca(),
				this.getModelo(), this.getMatricula(), this.getDescripcion());
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;

		Camper other = (Camper) obj;
		return super.equals(obj) && this.descripcion.equals(other.descripcion);
	}

//	Método
	public void repostar(double litros) {
	    if (litros <= 0) {
	        System.out.println("La cantidad de litros debe ser mayor que 0.");
	    } else {
	        System.out.println(String.format("La camper %s %s ha repostado %.2f litros.", 
	            this.getMarca(), this.getModelo(), litros));
	    }
	}
}
