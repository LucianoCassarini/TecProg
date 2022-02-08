package clase6;

import java.util.Calendar;

public class Alquiler {

	private Barco oBarco;
	
	private Calendar desde;
	private Calendar hasta;
	
	public Alquiler(Barco oBarco, Calendar desde, Calendar hasta, Puerto oPuerto) {
		super();
		this.oBarco = oBarco;
		this.desde = desde;
		this.hasta = hasta;
		
		oPuerto.agregarAlquiler(this);
		
	}

	public boolean esVigente(Calendar oPeriodo) {
		return oPeriodo.after(desde) && oPeriodo.before(hasta);
	}

	public Float liquidar(Calendar oPeriodo) {
		
		// A: número de días de ocupación
		// B: modulo del barco
		// C: cantidad de amarres ... solo los alumnos
		// A * B
		
		/**
		 * Casos
		 * alquiler comenzo el 18/04/2021 y liquido 04/2021 => 12 días
		 * alquiler termina el 10/04/2021 y liquido 04/2021 => 10 días
		 * alquiler es todo el mes => 30 días 
		 */		
		
		Integer cantidadDias = 30;
		
		Float moduloBarco = oBarco.calcularModulo();
		
		return cantidadDias * moduloBarco;
	}

	
}