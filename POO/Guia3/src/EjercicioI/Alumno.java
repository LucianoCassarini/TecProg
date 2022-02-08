package EjercicioI;

import java.util.Calendar;
import java.util.Vector;

public class Alumno {
	private String nombre;
	private Calendar fecha_ingreso;
	private Calendar fecha_egreso;
	
	private Vector<Examen> cExamenes;
	
	public Alumno(String nombre, Carrera oCarrera) {
		this.nombre = nombre;
		fecha_ingreso = Calendar.getInstance();
		oCarrera.cargarAlumno(this);
		cExamenes = new Vector<Examen>();
	}
	
	public void inscribirCatedra(Catedra oCatedra) {
		oCatedra.agregarAlumno(this);
	}
	
	public void cargarExamen(Examen oExamen) {
		cExamenes.add(oExamen);
	}
	
	public void alumnoEgreso() {
		fecha_egreso = Calendar.getInstance();
	}
	
	public Boolean esEgresado() {
		if(fecha_egreso != null) {
			return true;
		}else {
			return false;
		}
	}
	
	public float promedio() {
		float total = 0f;
		
		Integer cantidadExamenes = 0;
		for(Examen oExamen : cExamenes) {
			if(oExamen.estaAprobado()) {
				total += oExamen.mostrarNota();
				cantidadExamenes++;
			}
		}
		return (total/cantidadExamenes);
	}
	
	public void mostrarInfo() {
		System.out.println(nombre + " Promedio: "+ this.promedio() + ".");
	}
}
