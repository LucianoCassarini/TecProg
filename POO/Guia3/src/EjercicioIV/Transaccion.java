package EjercicioIV;

import java.util.Calendar;

public abstract class Transaccion {
	private Calendar fecha;
	private Float monto;
	private Moneda oMoneda;
	
	public Transaccion(Cuenta oCuenta, Float monto, Moneda oMoneda) {
		fecha = Calendar.getInstance();
		this.monto = monto;
		this.oMoneda = oMoneda;
		oCuenta.agregarTransaccion(this);
	}
	
	public Float montoEnPesos() {
		if(oMoneda != null) {
			return oMoneda.convertirAPesos(monto);
		}else {
			return 0f;
		}
	} 
}
