package EjercicioII;

public class Hora {
	private Integer cantidad;
	private Periodo oPeriodo;
	
	public Hora(Integer cantidad, Periodo oPeriodo) {
		super();
		this.cantidad = cantidad;
		this.oPeriodo = oPeriodo;
	}
	
	public boolean evaluarPeriodo(Periodo periodo) {
		return oPeriodo.equals(periodo);
	}
	
	public Float calcularSueldo() {
		return oPeriodo.calcularSueldo(cantidad);
	}
}
