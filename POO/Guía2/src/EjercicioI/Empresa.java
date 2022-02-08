package EjercicioI;

import java.util.Collection;
import java.util.Vector;

public class Empresa {
	private String nombre;
	private IVA oIVA;
	private Collection<Factura> cFacturas;
	
	public Empresa(String nombre, IVA _iva) {
		this.nombre = nombre;
		oIVA = _iva;
		cFacturas = new Vector<Factura>();
	}
	
	public float mostrarSumatoriaFacturas() {
		float total = 0;
		
		for(Factura oFactura : cFacturas) {
			total += oFactura.calcularTotal();
		}
		
		return total;
	}
	
	public String mostrarNombre() {
		return nombre;
	}
	
	public String tipoIVA() {
		return (oIVA.mostrarNombre());
	}
	public void agregarFactura(Factura oFactura) {
		cFacturas.add(oFactura);
	}
}
