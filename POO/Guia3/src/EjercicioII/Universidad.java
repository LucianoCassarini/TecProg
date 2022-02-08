package EjercicioII;

import java.util.Vector;

public class Universidad {
	private String nombre;
	private Vector<Facultad> cFacultades;
	
	public Universidad(String nombre) {
		this.nombre = nombre;
		cFacultades = new Vector<Facultad>();
	}
	
	public void listarAlumnos(Catedra oCatedra) {
		for(Facultad oFacultad : cFacultades) {
			oFacultad.listarAlumnosCatedra(oCatedra);
		}
	}
	
	public void agregarFacultad(Facultad oFacultad) {
		cFacultades.add(oFacultad);
	}
}
