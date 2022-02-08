package EjercicioI;

public class Cliente {
	private String nombre;
	
	private String cuit;
	
	public Cliente(String nombre, String cuit) {
		this.nombre = nombre;
		this.cuit = cuit;
	}
	
	public String mostrarNombre() {
		return nombre;
	}
	public String mostrarCuit() {
		return cuit;
	}
}
