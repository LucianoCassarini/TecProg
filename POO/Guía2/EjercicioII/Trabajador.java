package EjercicioII;

public abstract class Trabajador {
	private String nombre;
	private String apellido;
	private String tipo;
	private Integer dni;
	
	public Trabajador(String nombre, String apellido, Integer dni, Empresa oEmpresa, String tipo) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.tipo = tipo;
		oEmpresa.agregarTrabajador(this);
	}
	
	public void mostrarInfo(){
		
	}
	
	public void liquidar(Periodo oPeriodo) {
		System.out.println("Empleado: " + apellido +", "+ nombre +".");
		System.out.println("DNI: "+ dni + " - Tipo: " + tipo +".");
		System.out.println("Sueldo: " + liquidarSueldo(oPeriodo));
	}
	
	protected abstract Float liquidarSueldo(Periodo oPeriodo);
	
}
