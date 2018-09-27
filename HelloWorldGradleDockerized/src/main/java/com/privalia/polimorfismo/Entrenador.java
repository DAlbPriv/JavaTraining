package com.privalia.polimorfismo;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Entrenador extends SeleccionFutbol {

	private int idFederacion;
	
	public Entrenador() {
		super();
	}
	
	public Entrenador(int id, String nombre, String apellidos, int edad, int idFederacion) {
		super(id,nombre,apellidos,edad);
		this.setIdFederacion(idFederacion);
	}
	
	
	
	@Override
	public void entrenamiento() {
		System.out.println("Dirige un entrenamiento  (Class Entrenador)");
	}

	@Override
	public void partidodeFutbol() {
		System.out.println("Dirige un Partido de Fútbol (Class Entrenador)");

	}
	
	public void planificarEntrenamiento() {
		System.out.println("Planificar un entrenamiento(Class Entrenador)");
	}

}
