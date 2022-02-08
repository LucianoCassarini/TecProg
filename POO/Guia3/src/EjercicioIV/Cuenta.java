package EjercicioIV;

import java.util.Vector;

public class Cuenta {
	private String id;
	private Titular oTitular;
	private Vector<Transaccion> cTransacciones;
	private Float saldo = 0f;
	private Float saldoDolar = 0f;
	private Float saldoReales = 0f;
	
	public Cuenta(String id, Titular oTitular, Banco oBanco) {
		this.id = id;
		this.oTitular = oTitular;
		cTransacciones = new Vector<Transaccion>();
		oBanco.cargarCuenta(this);
	}
	
	public void agregarTransaccion(Transaccion oTransaccion) {
		cTransacciones.add(oTransaccion);
	}
	
	public void modificarSaldo(Moneda oMoneda, Float monto) {
		if(oMoneda.devuelveTipo() == "Dolar") {
			saldoDolar += monto;
		}else if(oMoneda.devuelveTipo() == "Real") {
			saldoReales += monto;
		}else {
			saldo += monto;
		}
	}
	
	public String mostrarInfo() {
		return id;
	}
	
	public Float calcularComision() {
	/**	(a) La cantidad de transacciones del periodo
		(b) Sumatoria de transacciones del periodo en pesos argentinos – moneda base
		30 – ( (b / a) x 0,5 % ) = comisión
		Por ejemplo: (20.000 / 20) = 1.000 => 1.000 * 0,005 = 5 => 30 – 5 = $ 25 
	**/
		
		Integer numTransacciones = cTransacciones.size();
		Float totalDinero = 0f;
		for(Transaccion oTransaccion : cTransacciones) {
			totalDinero += oTransaccion.montoEnPesos();
		}
		
		 return (30 - ((totalDinero/numTransacciones) * 0.005f));
		
	}
	
	public Float consultarSaldo() {
		Float total = saldo;
		return total;
	}
}
