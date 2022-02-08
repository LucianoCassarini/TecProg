package EjercicioI;

public class Item {
	
	private Short cantidad;
	private Producto oProducto;
	private Float precioUnitario;
	
	public Item(short cantidad, Producto oProducto, Factura oFactura) {
		this.oProducto = oProducto;
		this.cantidad = cantidad;
		
		oFactura.agregarItem(this);
		precioUnitario = oProducto.mostrarPrecioActual();
	}
	

	public Float calcularTotal() {
		return (cantidad * precioUnitario);
	}
	
	public String Detalle() {
		//Porcelanato 45x45 100 unid.
		return( oProducto.mostrarNombre() +" "+ cantidad +" unidades ");
	}
}
