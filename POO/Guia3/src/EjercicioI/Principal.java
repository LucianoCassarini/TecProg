package EjercicioI;

public class Principal {

	public static void main(String[] args) {
		//---------Creamos una carrera-----------
		Carrera oCarrera = new Carrera("Ingenieria Informatica");
		
		//---------Creamos un par de catedras-----------
		Catedra oCatedra = new Catedra("Tecnologias de la programacion");
		Catedra oCatedra2= new Catedra("Matemática Basica");
		
		//Creamos algunos alumnos y los inscribimos a las catedras anteriores
		Alumno oAlumno1 = new Alumno("Cassarini Luciano", oCarrera);
		Alumno oAlumno2 = new Alumno("Perez Juan", oCarrera);
		
		oAlumno1.inscribirCatedra(oCatedra);
		oAlumno1.inscribirCatedra(oCatedra2);
		
		oAlumno2.inscribirCatedra(oCatedra);
		oAlumno2.inscribirCatedra(oCatedra2);

		//---------Creamos examenes--------- 
		Examen oExamen1 = new Examen(8f, oAlumno1, oCatedra);
		Examen oExamen2 = new Examen(7f, oAlumno1, oCatedra2);
		Examen oExamen3 = new Examen(4f, oAlumno1, oCatedra);
		
		//---------Un alumno egreso-----------
		oAlumno1.alumnoEgreso();
		
		oCarrera.listar_egresados();
		
	}

}
