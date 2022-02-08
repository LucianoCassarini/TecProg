package EjercicioII;

import java.util.Calendar;

public class Periodo {
	private Calendar fecha;
	private Float precioSub40;
	private Float precioPost40;
	
	public Periodo(Calendar fecha, Float precioSub40, Float precioPost40) {
		super();
		this.fecha = fecha;
		this.precioSub40 = precioSub40;
		this.precioPost40 = precioPost40;
	}
	
	public Float calcularSueldo(Integer cantidad) {
		if(cantidad <= 40) {
			return (cantidad * precioSub40);
		}else {
			Integer horasExtra = cantidad - 40;
			return ((40*precioSub40) + (horasExtra*precioPost40));
		}
	}
	
	@Override
	public boolean equals(Object obj) {		
		return super.equals(obj);
	}
}
