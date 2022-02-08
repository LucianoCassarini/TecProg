package EjercicioII;

import java.util.Vector;

public class Docente {
	private Persona oPersona;
	private Vector<Comision> cComisionesACargo;
	
	public Docente(Persona oPersona) {
		this.oPersona = oPersona;
		cComisionesACargo = new Vector<Comision>();
	}
	
	public void agregarComision(Comision oComision) {
		cComisionesACargo.add(oComision);
	}
}
