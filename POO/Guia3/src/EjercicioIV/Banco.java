package EjercicioIV;

import java.util.Vector;

public class Banco {
	private String nombre;
	private Vector<Cuenta> cCuentas;
	
	public Banco(String nombre) {
		this.nombre = nombre;
		cCuentas = new Vector<Cuenta>();
	}
	
	public void cargarCuenta(Cuenta oCuenta) {
		cCuentas.add(oCuenta);
	}
	
	public void listarComisiones() {
		for(Cuenta oCuenta : cCuentas) {
			System.out.println(oCuenta.mostrarInfo() + ": $"+ oCuenta.calcularComision()+".-");
		}
	}
	
}
