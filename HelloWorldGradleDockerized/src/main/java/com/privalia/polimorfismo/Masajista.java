package com.privalia.polimorfismo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Masajista extends SeleccionFutbol{

	
	private String titulacion;
	private int aniosExperiencia;
	
	
	public Masajista() {
		super();
	}
	
	public Masajista(int id, String nombre, String apellidos, int edad, int dorsal, String demarcacion) {
		super(id,nombre,apellidos,edad);
		this.titulacion= titulacion;
		this.aniosExperiencia = aniosExperiencia;
	}
	

	@Override
	public void entrenamiento() {
		System.out.println("Da asistencia en el entrenamiento  (Class Futbolista)");
	}

	public void darMasaje() {
		System.out.println("Da un masaje");
	}
	
}
