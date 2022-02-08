package EjercicioIII;

public abstract class Persona {
	
	private String nombre;
	private String apellido;
	private Integer dni;
	private Integer telefono;
	
	public Persona(String nombre, String apellido, Integer dni, Integer telefono) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.telefono = telefono;
	}
	
	public String mostrarDatos() {
		return (nombre + ", " + apellido + ". DNI: " + dni + ".-");
	}
}
