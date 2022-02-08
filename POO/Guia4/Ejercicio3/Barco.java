package clase6;

public abstract class Barco {

	private Float eslora;

	public Barco(Float eslora) {
		super();
		this.eslora = eslora;
	}

	
	public Float calcularModulo() {
		// Módulo NORMAL + módulo ESPECIAL
		return calcularModuloNormal() + calcularModuloEspecial();
	}
	
	private Float calcularModuloNormal() {
		return 10 * eslora;
	}
	
	protected abstract Float calcularModuloEspecial(); 
	
}
