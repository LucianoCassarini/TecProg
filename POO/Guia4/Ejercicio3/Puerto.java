package clase6;

import java.util.Calendar;
import java.util.Vector;

public class Puerto {

	private Vector<Alquiler> cAlquileres;
	
	public Puerto() {
		this.cAlquileres = new Vector();
	}


	public void liquidaePeriodo(Calendar oPeriodo) {
		
		for (Alquiler oAlquiler : cAlquileres) {
			
			if (oAlquiler.esVigente(oPeriodo)) {
				
				System.out.println("Alquiler " + oAlquiler.liquidar(oPeriodo) );				
			}			
		}		
	}
	

	public static void main(String[] args) {

		Puerto oPuerto = new Puerto();
		Barco oVelero = new Velero(8.5f, 2);
		Calendar desde = Calendar.getInstance();
		desde.set(Calendar.MONTH, Calendar.FEBRUARY);
		Calendar hasta = Calendar.getInstance();
		hasta.set(Calendar.MONTH, Calendar.AUGUST);
		
		new Alquiler(oVelero, desde, hasta, oPuerto);
		oPuerto.liquidaePeriodo(Calendar.getInstance());

	}


	public void agregarAlquiler(Alquiler alquiler) {
		cAlquileres.add(alquiler);
	}

}
