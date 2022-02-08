package EjercicioIV;

public class Real extends Moneda {
	
	public Real() {
		super(17.50f, "Real");
	}
	
	public void cambiarValorReal(Float precio) {
		this.cambiarRelacionPeso(precio);
	}
}
