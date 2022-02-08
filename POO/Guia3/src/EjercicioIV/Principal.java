package EjercicioIV;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Banco oBanco = new Banco("Galicia");
		
		Titular oTitular1 = new Titular("Cassarini", "Luciano", 2141406920); 
		
		Cuenta oCuenta1 = new Cuenta("C000001", oTitular1, oBanco);
		Cuenta oCuenta2 = new Cuenta("C000002", oTitular1, oBanco);
		//Cuenta oCuenta3 = new Cuenta("C000003", oTitular1, oBanco);
		//Cuenta oCuenta4 = new Cuenta("C000004", oTitular1, oBanco);
		//Cuenta oCuenta5 = new Cuenta("C000005", oTitular1, oBanco);
		
		Moneda DolarBlue = new Dolar();
		DolarBlue.cambiarRelacionPeso(147f);
		
		Moneda oPeso = new Peso();
		
		Deposito oDeposito1 = new Deposito(oCuenta1, 456f, DolarBlue);
		Deposito oDeposito2 = new Deposito(oCuenta1, 10583f, oPeso);
		
		Deposito oDeposito3 = new Deposito(oCuenta2, 10583f, oPeso);
		Extraccion oExtraccion = new Extraccion(oCuenta2, 546f, oPeso);
		Consulta oConsulta = new Consulta(oCuenta2);
		
		oBanco.listarComisiones();
		
	}

}
