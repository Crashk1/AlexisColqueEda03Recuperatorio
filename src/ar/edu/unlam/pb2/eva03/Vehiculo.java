package ar.edu.unlam.pb2.eva03;

public class Vehiculo {

	private Integer codigo;
	private String nombre;
	private Double velocidad = 0.0;
	
	public Vehiculo(Integer codigo, String nombre) {
		this.codigo = codigo;
		this.nombre = nombre;
	}

	public void acelerar(Double velocidad) {
		this.velocidad += velocidad;
	}
	
	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(Double velocidad) {
		this.velocidad = velocidad;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + ((velocidad == null) ? 0 : velocidad.hashCode());
		return result;
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
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (velocidad == null) {
			if (other.velocidad != null)
				return false;
		} else if (!velocidad.equals(other.velocidad))
			return false;
		return true;
	}
	
	
	
}
