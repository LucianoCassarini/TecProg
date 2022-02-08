package EjercicioII;

public class Jefe extends Trabajador {
	private Float sueldo;
	
	public Jefe (String nombre, String apellido, Integer dni, Empresa oEmpresa, Float sueldo) {
		super(nombre, apellido, dni, oEmpresa, "Jefe");
		this.sueldo = sueldo;
	}
	
	public void ajustarSueldo(Float newSueldo) {
		sueldo = newSueldo;
	}
	
	@Override
	public Float liquidarSueldo(Periodo oPeriodo) {		
		return sueldo;
	} 
}
