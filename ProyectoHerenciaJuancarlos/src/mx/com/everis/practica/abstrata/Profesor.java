package mx.com.everis.practica.abstrata;

import mx.com.everis.practica.clases.Persona;

public abstract class Profesor extends Persona {
	private String idProfesor;
	
	public Profesor(String nombre,String apellido,String idProfesor){
		super(nombre,apellido);
		this.idProfesor=idProfesor;
	}
	abstract public double importeNomina (); 

}
