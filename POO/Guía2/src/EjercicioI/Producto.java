package EjercicioI;

public class Producto {
	private float precio;
	private String nombre;
	
	public Producto(Float precio, String nombre) {
		this.precio = precio;
		this.nombre = nombre;
	}
	
	public float mostrarPrecioActual() {
		return precio;
	}
	
	public String mostrarNombre() {
		return nombre;
	}
}
