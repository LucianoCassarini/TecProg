package EjercicioIII;

public class Accesorio {
	private String nombreProducto;
	private Float precioUnitario;
	private Integer stock;
	
	public Accesorio(String nombreProducto, Float precioUnitario,Integer stock, Concesionaria oConcesionaria) {
		this.nombreProducto = nombreProducto;
		this.precioUnitario = precioUnitario;
		this.stock = stock;
		oConcesionaria.cargarAccesorio(this);
	}
	
	public String infoProducto() {
		return nombreProducto;
	}
	
	public Float mostrarPrecio() {
		return precioUnitario;
	}
	
	public String mostrarInfo() {
		return (nombreProducto +":  "+ precioUnitario + ".-");
		
	}
	
	public void ajustarStock(Integer cantidadVendida){
		stock = (stock-cantidadVendida);
	}
	
	public Integer mostrarStock() {
		return stock;
	}
}
