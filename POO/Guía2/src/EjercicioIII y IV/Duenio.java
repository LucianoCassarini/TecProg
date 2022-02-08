package EjercicioIII;

import java.util.Vector;

public class Duenio extends Persona {
	private Vector<Vehiculo> VehiculosEnVenta;
	
	public Duenio(String nombre, String apellido, Integer dni, Integer telefono) {
		super(nombre, apellido, dni, telefono);
		
		VehiculosEnVenta = new Vector<Vehiculo>();
	}
	
	public void vendeVehiculo(Vehiculo oVehiculo) {
		VehiculosEnVenta.add(oVehiculo);
	}
}
