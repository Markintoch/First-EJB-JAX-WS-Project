package classes;

public class Pelicula {

	
	String nombre;
	int year;
	int id;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Pelicula() {
	  
	}
	
	public Pelicula(String nombre, int year, int id) {
		this.nombre = nombre;
		this.year = year;
		this.id = id;
	}
	public String getNombre() {
	  return nombre;
	}
	public void setNombre(String nombre) {
	  this.nombre = nombre;
	}
	public int getYear() {
	  return year;
	}
	public void setYear(int year) {
	  this.year = year;
	}
	
	
}
