package EjercicioIII;

import java.util.Calendar;
import java.util.Vector;

public class Ventas {
	private Calendar fecha;
	private Vector<Vehiculo> cVehiculos;
	private Vector<Accesorio> cAccesorios;
	private Comprador oComprador;
	private Concesionaria oConcesionaria;
	
	public Ventas(Concesionaria oConcesionaria, Vehiculo oVehiculo, Accesorio oAccesorio, Comprador oComprador) {

		this.oComprador = oComprador;
		this.oConcesionaria = oConcesionaria;
		
		oConcesionaria.registrarVenta(this);
		cVehiculos = new Vector<Vehiculo>();
		cAccesorios = new Vector<Accesorio>();
		
		if(oVehiculo != null) {
			this.venderVehiculo(oVehiculo);
		}
		if(oAccesorio != null) {
			this.venderAccesorio(oAccesorio, 1);
			oAccesorio.ajustarStock(1);
		}
		
		
		fecha = Calendar.getInstance();
		
		
		//oConcesionaria.VehiculoVendido(oVehiculo);
	
		
	}
	
	public void venderVehiculo(Vehiculo oVeiculo) {
		cVehiculos.add(oVeiculo);
	}
	
	public void venderAccesorio(Accesorio oAccesorio, Integer cantidad) {
		for(Integer i = 0; i< cantidad; i++) {
			cAccesorios.add(oAccesorio);
		}
		oAccesorio.ajustarStock(cantidad);
		
	}
	
	public void mostrarDetalleVenta() {
		
		System.out.println("Detalle de venta: ");
		System.out.println("Concesionaria: " + oConcesionaria.mostrarDatos());
		System.out.println("Comprador: " + oComprador.mostrarDatos());
		System.out.println("Detalle: ");
		Float total = 0f;
		for(Vehiculo oVehiculo : cVehiculos) {
			oVehiculo.mostrarInfo();
			total += oVehiculo.mostrarPrecio();
		}
		for(Accesorio oAccesorio : cAccesorios) {
			System.out.println(oAccesorio.mostrarInfo());
			total += oAccesorio.mostrarPrecio();
		}
		System.out.println("Total Venta: " + total + ".-");
		
	}
	
	public Boolean esNacional() {
		Boolean aux = false;
		for(Vehiculo oVehiculo : cVehiculos) {
			if(!oVehiculo.esImportado()) {
				aux = true;
			}
		}
		return aux;
	}
	
	public Boolean esUsado() {
		Boolean aux = false;
		for(Vehiculo oVehiculo : cVehiculos) {
			if(oVehiculo.esUsado()) {
				aux = true;
			}
		}
		return aux;
	}
}
