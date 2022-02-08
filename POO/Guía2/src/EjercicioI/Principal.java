package EjercicioI;

import java.util.Calendar;

public class Principal {

	public static void main(String[] args) {
		
		IVA oIVA_Monotributo = new IVA("Monotributo");
		Empresa miEmpresa = new Empresa("Mayorista S.A", oIVA_Monotributo);
		
		Cliente oCliente1 = new Cliente("Gilcomat SRL", "30-12345678-1");
		Factura oFactura1 = new Factura(Calendar.getInstance(), miEmpresa, oCliente1 ,0000000001);
		Factura oFactura2 = new Factura(Calendar.getInstance(), miEmpresa, oCliente1,0000000002);
		
		//----------------------------Factura1-----------------------------------
		
		Producto oProducto1 = new Producto(6f,"Porcelanato");
		Producto oProducto2 = new Producto(400f,"Grifería");
		
		Item oItem1 = new Item((short)100, oProducto1, oFactura1);
		Item oItem2 = new Item((short)1, oProducto2, oFactura1);
		
		oFactura1.mostrarFactura();
		System.out.println("\n");
		//----------------------------Factura2-----------------------------------
		Producto oProducto3 = new Producto(3000f,"Teclado");
		Producto oProducto4 = new Producto(30000f,"Monitor");
		
		Item oItem3 = new Item((short)1, oProducto3, oFactura2);
		Item oItem4 = new Item((short)1, oProducto4, oFactura2);
		
		oFactura2.mostrarFactura();
		System.out.println("\n");
		
		System.out.println("Total Facturado: $" + miEmpresa.mostrarSumatoriaFacturas() + ".-");
		
	}

}
