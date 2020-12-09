package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.interfaces.Acuatico;

public class Submarino extends Vehiculo implements Acuatico {

	private Double profundidad = 0.0;

	public Submarino(Integer codigo, String nombre) {
		super(codigo, nombre);
	}
	
	@Override
	public Double getProfundidad() {
		return profundidad;
	}

	public void setProfundidad(Double profundidad) {
		this.profundidad = profundidad;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((profundidad == null) ? 0 : profundidad.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Submarino other = (Submarino) obj;
		if (profundidad == null) {
			if (other.profundidad != null)
				return false;
		} else if (!profundidad.equals(other.profundidad))
			return false;
		return true;
	}
	
	
	
}
