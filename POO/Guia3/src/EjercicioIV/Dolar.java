package EjercicioIV;

public class Dolar extends Moneda {
	
	public Dolar() {
		super(93.67f, "Dolar");
	}
	
	public void cambiarValorDolar(Float precio) {
		this.cambiarRelacionPeso(precio);
	}
}
