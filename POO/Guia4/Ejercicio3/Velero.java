package clase6;

public class Velero extends Barco {

	private Integer mastiles;
	
	/**
	 * 
	 * @param eslora
	 * @param mastiles
	 */
	public Velero(Float eslora, Integer _mastiles) {		
		super(eslora);
		mastiles = _mastiles;
	}

	@Override
	protected Float calcularModuloEspecial() {
		//return Float.valueOf(""+mastiles);
		return (float)mastiles;
	}
	
	public void mostrarVelero() {
		
	}
	
}
