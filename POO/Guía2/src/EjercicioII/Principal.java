package EjercicioII;

import java.util.Calendar;

public class Principal {

	public static void main(String[] args) {
		
		Empresa oEmpresa = new Empresa("La Anonima S.A");
		
		Calendar fecha042020 = Calendar.getInstance();
		fecha042020.set(Calendar.MONTH, Calendar.APRIL);
		fecha042020.set(Calendar.YEAR, 120);
		Periodo oPeriodoAbril2021 = new Periodo(fecha042020, 300f, 330.5f);
		
		//-------------------------------------Jefe-----------------------------------------------
		Jefe oEmpleado0 = new Jefe("Luciano", "Cassarini", 41406920 , oEmpresa, 70000f);
		
		//-----------------------------------Jornalizado------------------------------------------
		Jornalizado oEmpleado1 = new Jornalizado("Luciano", "Cassarini", 41406920 , oEmpresa);
		oEmpleado1.agregarHoras(oPeriodoAbril2021, 100);
		
		//------------------------------------Categoria------------------------------------------
		Categoria operarioCarga = new Categoria("Operario de carga", 40000f);
		
		//------------------------------------Mensualizado----------------------------------------
		Mensualizado oEmpleado3 = new Mensualizado("Luciano", "Cassarini", 41406920 , oEmpresa, oEmpleado0, operarioCarga);
		
		
		//-----------------------------------Calcular sueldos-------------------------------------
		oEmpresa.calcularSueldos(oPeriodoAbril2021);
	}
	
}
