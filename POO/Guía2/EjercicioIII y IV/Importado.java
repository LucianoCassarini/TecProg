package EjercicioIII;

public class Importado {
	private String paisOrigen;
	private Float costoImpuesto;
	
	public Importado(String paisOrigen, Float costoImpuesto) {
		this.paisOrigen = paisOrigen;
		this.costoImpuesto = costoImpuesto;
	}
	
	public Float mostrarCostoImpuesto() {
		return costoImpuesto;
	}
}
