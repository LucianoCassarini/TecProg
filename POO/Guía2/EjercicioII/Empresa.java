package EjercicioII;

import java.util.Vector;

public class Empresa {
	//-----------Private-------------------------
	private String nombre;
	private Vector<Trabajador> cTrabajadores;
	
	//-----------Public--------------------------
	
	public Empresa(String nombre) {
		this.nombre = nombre;
		cTrabajadores = new Vector<Trabajador>();
	}
	
	public String mostrarNombre() {
		return nombre;
	}
	
	public void calcularSueldos(Periodo oPeriodo) {
		for (Trabajador oTrabajador : cTrabajadores) {
			oTrabajador.liquidar(oPeriodo);
			System.out.println("\n");
		}
	}
	
	public void agregarTrabajador(Trabajador trabajador) {
		cTrabajadores.add(trabajador);
	}
	
}
