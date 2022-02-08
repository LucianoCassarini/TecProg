package EjercicioIII;

public class Auto extends Vehiculo {
	
	private Importado oImportado;
	private String tipo = "Auto";
	
	public Auto(String marca, Integer modelo, String patente, Float precioVenta,
			Integer kilometraje, Concesionaria oConcesionaria, Duenio oDuenio) {
		super(marca, modelo, patente, precioVenta, kilometraje, oConcesionaria, oDuenio, false, "Auto");
	}
	
	public Auto(String marca, Integer modelo, String patente, Float precioVenta,
			Integer kilometraje, Concesionaria oConcesionaria, Duenio oDuenio, Importado oImportado) {
		
		super(marca, modelo, patente, (precioVenta += oImportado.mostrarCostoImpuesto()), kilometraje, oConcesionaria, oDuenio, true, "Auto");
		this.oImportado = oImportado;
		
	}
	
}
