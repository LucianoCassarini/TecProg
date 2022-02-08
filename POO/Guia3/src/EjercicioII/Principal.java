package EjercicioII;

public class Principal {

	public static void main(String[] args) {
		
		//------------------Creamos Personas----------------------
		
		Persona oPersona1 = new Persona("Luciano Cassarini", 41406920);
		Persona oPersona2 = new Persona("Jeffrey Dahmer", 41406920);
		Persona oPersona3 = new Persona("Ted Bundy", 41406920);
		Persona oPersona4 = new Persona("Peter Vronsky", 41406920);
		Persona oPersona5 = new Persona("Tsutomu Miyazaki", 41406920);
		
		//--------------Creamos la universidad y sus facultades-------------
		
		Universidad oUniversidad = new Universidad("Universidad Nacional del Litoral");
		
		Facultad oFich = new Facultad("Facultad de Ingeniería y Cienccias Hidricas", oUniversidad);
		Facultad oFcm = new Facultad("Facultad de Ciencias Medicas", oUniversidad);
		
		//--------------------------Carreras y sus facultades----------------------
		
		Carrera ingInformatica = new Carrera("Ing. Informatica", oFich);
		Carrera ingAmbiental = new Carrera("Ing. Ambiental", oFich);
		Carrera Medicina = new Carrera("Medicina", oFcm);
		
		//---------------------------Creamos Catedras y comisiones--------------------------
		
		Catedra teProg = new Catedra("Tecnologias de la programación", ingInformatica);
		Catedra calculoII = new Catedra("Calculo II", ingInformatica);
		ingAmbiental.agregarCatedra(calculoII);
		Catedra anato = new Catedra("Anatomía", Medicina);
		
		Docente oDocente1 = new Docente(oPersona5);
		
		Comision oComision1 = new Comision("A", teProg, oDocente1);
		Comision oComision2 = new Comision("B", teProg, oDocente1);
		
		Comision oComision3 = new Comision("A", calculoII, oDocente1);
		Comision oComision4 = new Comision("B", calculoII, oDocente1);
		
		//------------------Creamos alumnos y los agregamos a las comisiones-----------------------
		
		Alumno oAlumno1 = new Alumno(oPersona1, ingInformatica);
		Alumno oAlumno2 = new Alumno(oPersona2, ingInformatica);
		Alumno oAlumno3 = new Alumno(oPersona3, ingAmbiental);
		Alumno oAlumno4 = new Alumno(oPersona4, ingInformatica);
		
		//teprog
		oAlumno1.inscribirComision(oComision1);
		oAlumno2.inscribirComision(oComision2);
		oAlumno4.inscribirComision(oComision1);
		
		//calculoII
		oAlumno1.inscribirComision(oComision3);
		oAlumno2.inscribirComision(oComision3);
		oAlumno3.inscribirComision(oComision4);
		oAlumno4.inscribirComision(oComision4);
		oAlumno4.inscribirComision(oComision3);
		
		//------------------------------Listamos los alumnos de la catedra-----------------------
		
		oUniversidad.listarAlumnos(calculoII);
		//oUniversidad.listarAlumnos(teProg);
	}

}
