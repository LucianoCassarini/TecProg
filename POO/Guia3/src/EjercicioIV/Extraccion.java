package EjercicioIV;

public class Extraccion extends Transaccion{
	
	public Extraccion(Cuenta oCuenta, Float monto, Moneda oMoneda) {
		super(oCuenta, monto, oMoneda);
		
		oCuenta.modificarSaldo(oMoneda, (-monto));
	}
}
