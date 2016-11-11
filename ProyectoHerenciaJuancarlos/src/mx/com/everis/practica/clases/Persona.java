/*
 * @Autor Juan carlos
 * @Version 1.0
 * */

package mx.com.everis.practica.clases;

public class Persona {
	/*
	 * name
	 * 
	 * */
	private String nombre;
	/*
	 * last name
	 * 
	 * */
	private String apellido;
	/*
	 * getname
	 * @param  String name
	 * 
	 * */
    public Persona(){
		System.out.println("soy papa");
	}
	
	public Persona(String nombre,String apellido)
	{
		this.nombre=nombre;
		this.apellido=apellido;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	/*
	 * set name
	 * @param  String name
	 * 
	 * */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/*
	 * get name
	 * @return  String lastname
	 * 
	 * */
	public String getApellido() {
		return apellido;
	}
	/*
	 * set name
	 * @param  String lastname
	 * 
	 * */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	

}
