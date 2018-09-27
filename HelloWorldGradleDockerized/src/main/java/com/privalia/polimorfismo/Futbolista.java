package com.privalia.polimorfismo;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Futbolista extends SeleccionFutbol {
	
	private int dorsal;
	private String demarcacion;
	
	public Futbolista() {
		super();
	}

	public Futbolista(int id, String nombre, String apellidos, int edad, int dorsal, String demarcacion) {
		super(id,nombre,apellidos,edad);
		this.dorsal = dorsal;
		this.demarcacion = demarcacion;
	}
	
	@Override
	public void entrenamiento() {
		System.out.println("Realiza un entrenamiento  (Class Futbolista)");
	}
	
	@Override
	public void partidodeFutbol() {
		System.out.println("Juega un Partido  (Class Futbolista)");
	}
	
	public void entrevista() {
		System.out.println("Da una entrevista");
	}

	
}
