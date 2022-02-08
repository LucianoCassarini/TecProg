package EjercicioII;

import java.util.Iterator;
import java.util.Vector;

public class Jornalizado  extends Trabajador{
	
	private Vector<Hora> cHoras;
	//agregar Jefe
	public Jornalizado( String nombre, String apellido, Integer dni, Empresa oEmpresa) {
		super(nombre, apellido, dni, oEmpresa, "Jornalizado");
		cHoras = new Vector<Hora>();
	}
	
	public void agregarHoras(Periodo oPeriodo, int cantidad) {
		cHoras.add(new Hora(cantidad, oPeriodo));
	}
	
	@Override
	public Float liquidarSueldo(Periodo oPeriodo) {
		Float sueldo = 0f;
		
		Boolean encontreHoras = Boolean.FALSE;
		Iterator<Hora> icHoras = cHoras.iterator();
		
		while(icHoras.hasNext() && !encontreHoras) {
			Hora oHora = icHoras.next();
			if (oHora.evaluarPeriodo(oPeriodo)) {
				encontreHoras = true;
				sueldo = oHora.calcularSueldo();
			}
		}
		
		return sueldo;
	}
}
