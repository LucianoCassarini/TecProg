package EjercicioII;

public class Mensualizado extends Trabajador {
	private Jefe oJefe;
	private Categoria oCategoria;
	
	public Mensualizado (String nombre, String apellido, Integer dni, Empresa oEmpresa, Jefe oJefe, Categoria oCategoria) {
		super(nombre, apellido, dni, oEmpresa, "Mensualizado");
		this.oJefe = oJefe;
		this.oCategoria = oCategoria;
	}
	
	public void mostrarCategoria() {
		System.out.println(oCategoria.mostrarNombre());
	}
	
	@Override
	public Float liquidarSueldo(Periodo oPeriodo) {
		return oCategoria.calcularSueldo();
	}
}
