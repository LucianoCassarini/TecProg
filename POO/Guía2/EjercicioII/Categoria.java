package EjercicioII;

public class Categoria {
	private String nombre;
	private Float sueldo;
	
	public Categoria(String nombre, Float sueldo) {
		this.nombre = nombre;
		this.sueldo = sueldo;
	}
	
	public String mostrarNombre() {
		return nombre;
	}
	
	public Float calcularSueldo() {
		return sueldo;
	}
}
