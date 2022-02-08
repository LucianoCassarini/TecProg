package EjercicioIV;

public class Deposito extends Transaccion {
	
	public Deposito(Cuenta oCuenta, Float monto, Moneda oMoneda) {
		super(oCuenta, monto, oMoneda);
		
		oCuenta.modificarSaldo(oMoneda, monto);
	}
	
}
