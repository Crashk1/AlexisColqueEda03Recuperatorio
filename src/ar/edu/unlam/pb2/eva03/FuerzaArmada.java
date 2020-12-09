package ar.edu.unlam.pb2.eva03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeBatalla;
import ar.edu.unlam.pb2.eva03.excepciones.VehiculoIncompatible;
import ar.edu.unlam.pb2.eva03.excepciones.VehiculoInexistente;
import ar.edu.unlam.pb2.eva03.interfaces.Acuatico;
import ar.edu.unlam.pb2.eva03.interfaces.Terrestre;
import ar.edu.unlam.pb2.eva03.interfaces.Volador;

public class FuerzaArmada {

	private Set<Vehiculo> convoy = new HashSet<Vehiculo>();
	private Map<String, Batalla> batallas = new HashMap<String, Batalla>();
	
	public void agregarVehiculo(Vehiculo vehiculo) {
		convoy.add(vehiculo);
	}
	
	public Integer getCapacidadDeDefensa() {
		return convoy.size();
	}
	
	public void crearBatalla(String nombre, TipoDeBatalla tipo, Double latitud, Double longitud) {	
		batallas.put(nombre, new Batalla(latitud, longitud, tipo));
	}
	
	public Batalla getBatalla(String nombre) {
		return batallas.get(nombre);
	}
	
	public boolean enviarALaBatalla(String batalla, Integer codigoVehiculo) throws VehiculoIncompatible, VehiculoInexistente {
		
		for (Vehiculo i : convoy) {
			if (i.getCodigo() == codigoVehiculo) {
				switch (batallas.get(batalla).getTipo()) {
				
				case TERRESTRE:
					if (i instanceof Terrestre) {
						batallas.get(batalla).agregarVehiculoParaBatalla(i);
						return true;
					}
					else {
						throw new VehiculoIncompatible();
					}
				
				case NAVAL:
					if (i instanceof Acuatico) {
						batallas.get(batalla).agregarVehiculoParaBatalla(i);
						return true;
					}
					else {
						throw new VehiculoIncompatible();
					}
				
				case AEREA:
					if (i instanceof Volador) {
						batallas.get(batalla).agregarVehiculoParaBatalla(i);
						return true;
					}
					else {
						throw new VehiculoIncompatible();
					}
					
				}
			}
		}
		
		throw new VehiculoInexistente();
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((batallas == null) ? 0 : batallas.hashCode());
		result = prime * result + ((convoy == null) ? 0 : convoy.hashCode());
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
		FuerzaArmada other = (FuerzaArmada) obj;
		if (batallas == null) {
			if (other.batallas != null)
				return false;
		} else if (!batallas.equals(other.batallas))
			return false;
		if (convoy == null) {
			if (other.convoy != null)
				return false;
		} else if (!convoy.equals(other.convoy))
			return false;
		return true;
	}

}
