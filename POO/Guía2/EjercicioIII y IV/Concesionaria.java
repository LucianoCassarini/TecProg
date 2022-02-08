package EjercicioIII;

import java.util.Vector;

public class Concesionaria {
	
	private String nombre;
	private Integer cuit;
	private Vector<Vehiculo> cVehiculos;
	private Vector<Accesorio> cAccesorios;
	private Vector<Ventas> cVentas;
	
	public Concesionaria(String nombre, Integer cuit) {
		this.nombre = nombre;
		this.cuit = cuit;
		cVehiculos = new Vector<Vehiculo>();
		cAccesorios = new Vector<Accesorio>();
		cVentas = new Vector<Ventas>();
	}
	
	public void cargarVehiculo(Vehiculo oVehiculo) {
		cVehiculos.add(oVehiculo);
	}
	public void cargarAccesorio(Accesorio oAccesorio) {
		cAccesorios.add(oAccesorio);
	}
	
	public void registrarVenta(Ventas oVentas) {
		cVentas.add(oVentas);
	}
	
	public String mostrarDatos() {
		return (nombre + ", cuit: " + cuit + ".-");
	}
	
	public void VentasNacionalesUsados() {
		for(Ventas oVenta : cVentas) {
			if(oVenta.esNacional() && oVenta.esUsado()) {
				oVenta.mostrarDetalleVenta();
				System.out.println("\n");
			}
		}
	}
	
	public void listaVentas() {
		for(Ventas oVenta : cVentas) {
			oVenta.mostrarDetalleVenta();
			System.out.println("\n");
		}
	}
	
//	public void VehiculoVendido(Vehiculo oVehiculo) {
//		Integer i = 0;
//		for(Vehiculo aux : cVehiculos) {
//			if(oVehiculo == aux) {
//				break;
//			}
//			i++;
//		}
//		cVehiculos.removeElementAt(i);
//	}
}
