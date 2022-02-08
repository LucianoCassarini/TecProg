package EjercicioIV;

public class Consulta extends Transaccion {
	
	public Consulta(Cuenta oCuenta) {
		super(oCuenta, null, null);
		System.out.println("Saldo de la cuenta: "+oCuenta.consultarSaldo());
	}
	
}
