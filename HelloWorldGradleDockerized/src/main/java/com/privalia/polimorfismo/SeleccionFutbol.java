package com.privalia.polimorfismo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
public abstract class SeleccionFutbol {
	
	@NonNull
	protected int id;
	@NonNull
	protected String nombre;
	@NonNull
	protected String apellidos;
	@NonNull
	protected int edad;
	
	public void viajar(){
		System.out.println("Viajar (Class Padre)");
	}
	
	public void concentrarse() {
		System.out.println("Concentrarse (Class Padre)");
	}

	public abstract void entrenamiento();
	
	public void partidodeFutbol() {
		System.out.println("Asiste al Partido de Fútbol (Class Padre)");
	}
	
}
