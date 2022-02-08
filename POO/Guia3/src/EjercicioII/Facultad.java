package EjercicioII;

import java.util.Iterator;
import java.util.Vector;

public class Facultad {
	private String nombre;
	private Vector<Carrera> cCarreras;
	
	public Facultad(String nombre, Universidad oUniversidad) {
		this.nombre = nombre;
		cCarreras = new Vector<Carrera>();
		
		oUniversidad.agregarFacultad(this);
	}
	
	public void agregarCarrera(Carrera oCarrera) {
		cCarreras.add(oCarrera);
	}
	
	public void listarAlumnosCatedra(Catedra oCatedra) {
		for(Carrera oCarrera : cCarreras) {
			Boolean encontro = oCarrera.listarAlumnosCatedra(oCatedra);
			if(encontro) break;
			
		}
	}
	
}
