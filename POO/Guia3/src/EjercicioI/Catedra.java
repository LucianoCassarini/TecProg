package EjercicioI;

import java.util.Vector;

public class Catedra {
	
	private String nombre;
	private Vector<Alumno> cAlumnos;
	
	public Catedra(String nombre) {
		this.nombre = nombre;
		cAlumnos = new Vector<Alumno>();
	}
	
	public void agregarAlumno(Alumno oAlumno) {
		cAlumnos.add(oAlumno);
	}
}
