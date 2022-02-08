package EjercicioIII;

public class Moto extends Vehiculo {
	private String tipo = "Moto";
	
	public Moto(String marca, Integer modelo, String patente, Float precioVenta,
			Integer kilometraje, Concesionaria oConcesionaria, Duenio oDuenio) {
		super(marca, modelo, patente, precioVenta, kilometraje, oConcesionaria, oDuenio, false, "Moto");
	}
}
