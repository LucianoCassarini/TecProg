package EjercicioII;

public class Persona {
	private String nombre;
	private Integer dni;
	
	public Persona(String nombre, Integer dni) {
		this.nombre = nombre;
		this.dni = dni;
	}
	
	public void mostrarDatos() {
		System.out.println(nombre +" DNI: " + dni + ".");
	}
}
