package EjercicioIII;

public class Camioneta extends Vehiculo{
	
	private String tipo = "Camioneta";
	
	public Camioneta(String marca, Integer modelo, String patente, Float precioVenta,
			Integer kilometraje, Concesionaria oConcesionaria, Duenio oDuenio) {
		super(marca, modelo, patente, precioVenta, kilometraje, oConcesionaria, oDuenio, false, "Camioneta");
	}
}
