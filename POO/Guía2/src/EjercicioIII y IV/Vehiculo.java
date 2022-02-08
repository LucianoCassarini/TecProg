package EjercicioIII;

public abstract class Vehiculo {
	private String marca;
	private Integer modelo;
	private String patente;
	private Float precioVenta;
	private Integer kilometraje;
	private Boolean importado;
	private String tipo;
	
	public Vehiculo(String marca, Integer modelo, String patente, Float precioVenta,
			Integer kilometraje, Concesionaria oConcesionaria, Duenio oDuenio, Boolean importado, String tipo) {
		 this.marca = marca;
		 this.modelo = modelo;
		 this.patente = patente;
		 this.precioVenta = precioVenta;
		 this.kilometraje = kilometraje;
		 this.importado = importado;
		 this.tipo = tipo;
		 
		 oConcesionaria.cargarVehiculo(this);
		 
		 if (oDuenio == null) {
			 kilometraje = 0;
		 }else {
			 oDuenio.vendeVehiculo(this);
		 }
		 
	}
	
	public Float mostrarPrecio() {
		return precioVenta;
	}
	
	public void mostrarInfo() {
		System.out.println(tipo + " " + marca + ", " + modelo + ", " + precioVenta + ".-");
		if(importado) {
			System.out.println("El auto es importado, los impuestos estan incluidos en el precio del mismo.");
		}
	}
	
	public Boolean esImportado() {
		return importado;
	}
	
	public Boolean esUsado() {
		if(kilometraje == 0) {
			return false;
		}else {
			return true;
		}
	
	}
}
