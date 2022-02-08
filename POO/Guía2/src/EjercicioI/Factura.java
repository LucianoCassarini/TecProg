package EjercicioI;

import java.util.Calendar;
import java.util.Collection;
import java.util.Vector;

public class Factura {
	
	private Calendar fecha;
	private Empresa oEmpresa;
	private Integer numero;
	private Collection<Item> cItems;
	private Cliente oCliente;
	
	public Factura(Calendar fecha, Empresa oEmpresa, Cliente oCliente ,Integer numero) {
		this.fecha = fecha;
		cItems = new Vector<Item>();
		oEmpresa.agregarFactura(this);
		this.oEmpresa = oEmpresa;
		this.numero = numero;
		this.oCliente = oCliente;
	}
	
	public void agregarItem(Item oItem) {
		cItems.add(oItem);
	}
	
	
	public Float calcularTotal() {
		Float total = 0f;
		for(Item oItem : cItems) {
			total += oItem.calcularTotal();
		}
		return total;
	}
	
	public void listarDetalle() {
		//Detalle 1: Porcelanato 45x45 100 unid. Total Item: $600.-
		int i = 0;
		for(Item oItem : cItems) {
			i++;
			System.out.println("Detalle " + i +": "+ oItem.Detalle() +"Total Items: $"+ oItem.calcularTotal()+".-");
		}

	}
	
	public void mostrarFactura() {
		System.out.println( "Nombre de la empresa: " + oEmpresa.mostrarNombre() + " -IVA " + oEmpresa.tipoIVA());
		System.out.println("Factura nro " + numero);
		System.out.println(oCliente.mostrarNombre() + "- cuit: "+ oCliente.mostrarCuit());
		
		System.out.println( fecha.get(Calendar.DATE) +
		"/"+ fecha.get(Calendar.MONTH) +"/"+ fecha.get(Calendar.YEAR));
		
		System.out.println("Total $" + this.calcularTotal() + ".-");
		this.listarDetalle();
	}
	
}
