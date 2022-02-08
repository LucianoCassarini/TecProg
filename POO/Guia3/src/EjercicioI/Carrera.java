package EjercicioI;

import java.util.Vector;

public class Carrera {
	private String nombre;
	private Vector<Alumno> cAlumnos;
	
	public Carrera(String nombre) {
		this.nombre = nombre;
		cAlumnos = new Vector<Alumno>();
	}
	
	public void listar_egresados() {
		System.out.println("Egresados: ");
		
		for(Alumno oAlumno : cAlumnos) {
			if(oAlumno.esEgresado()) {
				oAlumno.mostrarInfo();
			}
		}
	}
	
	public void cargarAlumno(Alumno oAlumno) {
		cAlumnos.add(oAlumno);
	}
	
}
