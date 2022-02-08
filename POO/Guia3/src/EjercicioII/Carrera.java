package EjercicioII;

import java.util.Iterator;
import java.util.Vector;

public class Carrera {
	private String id;
	private Vector<Catedra> cCatedras;
	private Vector<Alumno> cAlumnos;
	
	public Carrera(String id, Facultad oFacultad) {
		this.id = id;
		cCatedras = new Vector<Catedra>();
		cAlumnos = new Vector<Alumno>();
		oFacultad.agregarCarrera(this);
	}
	
	public void agregarAlumno(Alumno oAlumno) {
		cAlumnos.add(oAlumno);
	}
	
	public void agregarCatedra(Catedra oCatedra) {
		cCatedras.add(oCatedra);
	}
	
	public Boolean listarAlumnosCatedra(Catedra oCatedra){
		Iterator<Catedra> it= cCatedras.iterator();
		while(it.hasNext() ) {
			if(it.next() == oCatedra) {
				oCatedra.listarAlumnos();
				return true;
			}
		}
		return false;
	}
}
