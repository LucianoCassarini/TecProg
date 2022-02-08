package EjercicioIV;

public abstract class Moneda {
	private Float relacionPeso;
	private String tipo;
	public Moneda(Float relacionPrecio, String tipo) {
		this.relacionPeso = relacionPrecio;
		this.tipo = tipo;
	}
	
	public Float convertirAPesos(Float monto){
		return (monto * relacionPeso);
	}
	
	public void cambiarRelacionPeso(Float precio) {
		relacionPeso = precio;
	}
	
	public String devuelveTipo() {
		return tipo;
	}
}
