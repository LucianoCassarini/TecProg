package EjercicioII;

import java.util.Vector;

public class Alumno {
	
	private Persona oPersona;
	private Vector<Carrera> cCarreras;
	private Vector<Examen> cExamenes;
	
	public Alumno(Persona oPersona, Carrera _oCarrera) {
		this.oPersona = oPersona;
		cCarreras = new Vector<Carrera>();
		_oCarrera.agregarAlumno(this);
		cExamenes = new Vector<Examen>();
	}
	
	public void inscribirseACarrera(Carrera oCarrera) {
		oCarrera.agregarAlumno(this);
		cCarreras.add(oCarrera);
	}
	
	public void inscribirComision(Comision oComision) {
		oComision.agrgarAlumnos(this);
	}
	
	public void mostrarInfo() {
		oPersona.mostrarDatos();
	}
}
