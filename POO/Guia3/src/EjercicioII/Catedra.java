package EjercicioII;

import java.util.Vector;

public class Catedra {
	private String nombre;
	private Vector<Comision> cComisiones;
	
	public Catedra(String nombre, Carrera oCarrera) {
		this.nombre = nombre;
		oCarrera.agregarCatedra(this);
		cComisiones = new Vector<Comision>();
	}
	
	public void agregarComision(Comision oComision) {
		cComisiones.add(oComision);
	}
	
	
	public void listarAlumnos() {
		for(Comision oComision : cComisiones) {
			System.out.println("Comision "+oComision.mostrarID()+": ");
			oComision.listarAlumnos();
		}
	}
}
