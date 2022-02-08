package EjercicioIII;

public class Principal {

	public static void main(String[] args) {
		
		Concesionaria oConcesionaria = new Concesionaria("Coinauto S.A", 999999999);
		
		
		// ------------------------------Crea Auto importado------------------------------------------
		Duenio oDuenio1 = new Duenio("Pedro", "Lopez", 99999999, 304594934);
		
		Importado oImportado = new Importado("Alemania", 90000f);
		
		Auto oAuto = new Auto("Mercedes-Benz", 2010, "AG 795 LH", 2645000f, 60000, oConcesionaria, oDuenio1, oImportado);
		
		//------------------------------------Crea Moto---------------------------------------------
		Moto oMoto = new Moto("Honda", 2017, "A12 GAO", 270000f, 900, oConcesionaria, null);
		
		//--------------------------------Registrar venta----------------------------------------------
		Comprador oComprador1 = new Comprador("Luciano", "Cassarini", 99999999, 304594934);
		
		Ventas oVenta = new Ventas(oConcesionaria, oAuto, null, oComprador1);
		oVenta.venderVehiculo(oMoto);
		
		//Ventas oVenta2 = new Ventas(oConcesionaria, oAuto, null, oComprador1);
		
		//oVenta.mostrarDetalleVenta();
		
		//oConcesionaria.VentasNacionalesUsados();
		
		//----------------------------------Crea Accesorios-----------------------------------------------
		Accesorio oAccesorio1 = new Accesorio("Limpia vidrios", 300f, 4, oConcesionaria);
		Accesorio oAccesorio2 = new Accesorio("Aromatizante", 80f, 3, oConcesionaria);
		
		Ventas oVenta2 = new Ventas(oConcesionaria, oAuto, oAccesorio2, oComprador1);
		
		Ventas oVenta3 = new Ventas(oConcesionaria, null, oAccesorio1, oComprador1);
		oVenta3.venderAccesorio(oAccesorio1, 2);
		oVenta3.venderAccesorio(oAccesorio2, 1);
		
		oConcesionaria.listaVentas();
		
		System.out.println(oAccesorio1.infoProducto()+ ", Stock: " + oAccesorio1.mostrarStock() + ".-");
		System.out.println(oAccesorio2.infoProducto()+ ", Stock: " + oAccesorio2.mostrarStock() + ".-");
		
	}

}
