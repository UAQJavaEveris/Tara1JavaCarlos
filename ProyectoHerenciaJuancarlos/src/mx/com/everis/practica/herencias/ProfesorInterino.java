package mx.com.everis.practica.herencias;

import mx.com.everis.practica.abstrata.Profesor;
public class ProfesorInterino extends Profesor {

	public ProfesorInterino(String nombre, String apellido, String idProfesor) {
		super(nombre, apellido, idProfesor);
		
	}

	@Override
	public double importeNomina() {
		// TODO Auto-generated method stub
		return 30*35.60;
	}

}
