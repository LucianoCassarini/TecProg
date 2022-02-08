package EjercicioI;

import java.util.Calendar;

public class Examen {
	private Float nota;
	private Calendar fecha;
	private Catedra oCatedra;
	
	public Examen(Float nota, Alumno oAlumno, Catedra oCatedra) {
		this.nota = nota;
		this.oCatedra = oCatedra;
		
		fecha = Calendar.getInstance();
		oAlumno.cargarExamen(this);
	}
	
	public Boolean estaAprobado() {
		if(nota >= 6) {
			return true;
		}else {
			return false;
		}
	}
	
	public Float mostrarNota() {
		return nota;
	}
}
