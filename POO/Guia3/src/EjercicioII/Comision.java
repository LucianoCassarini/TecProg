package EjercicioII;

import java.util.Vector;

public class Comision {
	private String id;
	private Vector<Alumno> cAlumnos;
	private Docente oDocente;
	
	public Comision(String id, Catedra oCatedra, Docente oDocenteACargo) {
		this.id = id;
		oDocente = oDocenteACargo;
		oDocenteACargo.agregarComision(this);
		oCatedra.agregarComision(this);
		cAlumnos = new Vector<Alumno>();
	}
	
	public void agrgarAlumnos(Alumno oAlumno) {
		cAlumnos.add(oAlumno);
	}
	
	public String mostrarID() {
		return id;
	}
	
	public void listarAlumnos(){
		for(Alumno oAlumno : cAlumnos) {
			oAlumno.mostrarInfo();
		}
	}
}
