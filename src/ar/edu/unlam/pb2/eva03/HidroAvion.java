package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.interfaces.Acuatico;
import ar.edu.unlam.pb2.eva03.interfaces.Volador;

public class HidroAvion extends Vehiculo implements Acuatico, Volador{

	private Double profundidad = 0.0;
	private Double altura = 0.0;
	
	public HidroAvion(Integer codigo, String nombre) {
		super(codigo, nombre);
	}

	@Override
	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
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
		result = prime * result + ((altura == null) ? 0 : altura.hashCode());
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
		HidroAvion other = (HidroAvion) obj;
		if (altura == null) {
			if (other.altura != null)
				return false;
		} else if (!altura.equals(other.altura))
			return false;
		if (profundidad == null) {
			if (other.profundidad != null)
				return false;
		} else if (!profundidad.equals(other.profundidad))
			return false;
		return true;
	}
	
	
	
}